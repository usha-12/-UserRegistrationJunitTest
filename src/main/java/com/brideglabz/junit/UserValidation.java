package com.brideglabz.junit;

import java.util.regex.Pattern;

public class UserValidation {
    public static final String VALIDATE_NAME="^[A-z]+[a-z]{2,}$";
    public static final String EMAIL_ID="^[A-Za-z]{3,}[.]?[A-Za-z]{2,}[@]{1}[a-z]{2,}[.]{1}[a-z]{2,}$";
    public boolean checkFirstName(String firstName) {
        return (Pattern.matches(VALIDATE_NAME, firstName));
    }
    public Boolean checkLastName(String lastName) {
        return (Pattern.matches(VALIDATE_NAME,lastName));
    }

    public Boolean checkEmailId(String emailId) {
        return (Pattern.matches(EMAIL_ID,emailId));
    }
}
/*As a User need to
enter a valid email - E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl
& co) and 2 optional (xyz & in) with
precise @ and . positions*/