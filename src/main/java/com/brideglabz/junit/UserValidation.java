package com.brideglabz.junit;

import java.util.regex.Pattern;

public class UserValidation {
    public static final String VALIDATE_NAME="^[A-Z]+[a-z]{2,}$";
    public static final String EMAIL_ID="^[A-Za-z]{3,}[.-]?[A-Za-z]{2,}[@]{1}[a-z]{2,}[.]{1}[a-z]{2,}$";
    public static final String PHONE_NUMBER="^[0-9]+\s[0-9]{10}$";
    public static final String PASSWORD_RULE1="^[a-z]{8,}$";
    public static final String PASSWORD_RULE2="^[A-Z]+[a-z]{7,}$";
    public static final String PASSWORD_RULE3="^[A-Z]+[a-z0-9]{7,}$";
    public static final String PASSWORD_RULE4="^[A-Z]+[a-z0-9]{7,}[!@#$%&*]+$";
    public static final String SEPERATE_EMAIL_ID="^[A-Za-z]{3,}[.+-]?[A-Za-z0-9]*[@]{1}[a-z0-9]{1,}[.]{1}[a-z]{2,}[.]?[a-z]*$";

    public Boolean checkFirstName(String firstName) throws UserValidationException {
        if (Pattern.matches(VALIDATE_NAME, firstName))
            return true;
        else
            throw new UserValidationException("Invalid FirstName , Please Enter Valid FirstName");
    }

    public Boolean checkLastName(String lastName) throws UserValidationException {
        if (Pattern.matches(VALIDATE_NAME,lastName))
            return true;
        else
            throw new UserValidationException("Invalid Last Name , Please Enter Valid LastName");
    }

    public Boolean checkemailId(String emailId) throws UserValidationException {
        if (Pattern.matches(EMAIL_ID,emailId))
            return true;
        else
            throw new UserValidationException("Invalid Email ID, Please Enter Valid Email ID");
    }

    public Boolean phoneNumber(String phoneNumber) throws UserValidationException {
        if (Pattern.matches(PHONE_NUMBER,phoneNumber))
            return true;
        else
            throw new UserValidationException("Invalid PhoneNumber, Please Enter Valid PhoneNumber");
    }

    public Boolean password(String password) throws UserValidationException {
        if (Pattern.matches(PASSWORD_RULE1,password))
            return true;
        else
            throw new UserValidationException("Invalid PasswordRule1, Please Enter Valid Password");
    }

    public Boolean password2(String password1) throws UserValidationException {
        if(Pattern.matches(PASSWORD_RULE2,password1))
            return true;
        else
            throw new UserValidationException("Invalid PasswordRule2, Please Enter Valid Password");
    }

    public Boolean password3(String password2) throws UserValidationException {
        if (Pattern.matches(PASSWORD_RULE3,password2))
            return true;
        else
            throw new UserValidationException("Invalid PasswordRule3, Please Enter Valid Password");
    }

    public Boolean password4(String password3) throws UserValidationException {
        if (Pattern.matches(PASSWORD_RULE4,password3))
            return true;
        else
            throw new UserValidationException("Invalid PasswordRule4, Please Enter Valid Password");
    }

    public Boolean checkEmailSeperate(String checkEmailSeperate) throws UserValidationException {
        if (Pattern.matches(SEPERATE_EMAIL_ID,checkEmailSeperate))
            return true;
        else
            throw new UserValidationException("Invalid Email, Please Enter Valid Email");
    }
}