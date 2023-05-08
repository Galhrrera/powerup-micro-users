package com.pragma.powerup.usermicroservice.domain.usecase;

import com.pragma.powerup.usermicroservice.domain.api.IUserServicePort;
import com.pragma.powerup.usermicroservice.domain.exceptions.*;
import com.pragma.powerup.usermicroservice.domain.model.User;
import com.pragma.powerup.usermicroservice.domain.spi.IUserPersistencePort;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.pragma.powerup.usermicroservice.configuration.Constants.*;

public class UserUseCase implements IUserServicePort {
    private final IUserPersistencePort userPersistencePort;

    public UserUseCase(IUserPersistencePort userPersistencePort) {
        this.userPersistencePort = userPersistencePort;
    }

    @Override
    public void saveUser(User user) {
        if (validUser(user))
            userPersistencePort.saveOwner(user);
        else throw new InvalidUserData(INVALID_USER_DATA);
    }

    @Override
    public void saveOwner(User user) {
        if (validUser(user))
            userPersistencePort.saveOwner(user);
        else throw new InvalidUserData(INVALID_USER_DATA);
    }

    public boolean validUser(User user) throws InvalidPhoneException {
        boolean isValid = true;
        if (!validateLegalAge(user.getBirthdate())) {
            throw new InvalidAgeException(INVALID_AGE_EXCEPTION);
        } else if (!validateEmail(user.getMail())) {
            throw new InvalidUserEmail(INVALID_USER_EMAIL);
        } else if (!validatePhone(user.getPhone())) {
            throw new InvalidPhoneException(INVALID_USER_PHONE);
        } else if (!validateDocumentNumber(user.getDocument_number())) {
            throw new InvalidDocumentNumberException(INVALID_USER_DOCUMENT_NUMBER);
        } else {
            isValid = false;
        }
        return isValid;
    }

    public boolean validateLegalAge(Date birthDate) {
        LocalDate date = LocalDate.ofInstant(birthDate.toInstant(), ZoneId.systemDefault());
        LocalDate actualDate = LocalDate.now();
        Period period = Period.between(date, actualDate);
        int age = period.getYears();
        return age >= 18;
    }

    public boolean validateEmail(String email) {
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public boolean validatePhone(String phone) {
        if (phone.length() > PHONE_MAX_SIZE)
            throw new InvalidPhoneException(INVALID_PHONE_MAX_SIZE);

        String regex = "^[+]?\\d{1,13}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
    }

    public boolean validateDocumentNumber(String document_number) {
        String regex = "^\\d+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(document_number);
        return matcher.matches();
    }
}
