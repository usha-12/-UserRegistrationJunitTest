package com.brideglabz.junit;

import java.util.regex.Pattern;

public class EmailValidation {

    public static final String SEPARATE_EMAIL_ID="^[A-Za-z]{3,}[.+-]?[A-Za-z0-9]*[@]{1}[a-z0-9]{1,}[.]{1}[a-z]{2,}[.]?[a-z]*$";
    public Boolean checkEmail(String email){
        Boolean expectedResult=(Pattern.matches(SEPARATE_EMAIL_ID,email));
        return expectedResult;
    }
}
