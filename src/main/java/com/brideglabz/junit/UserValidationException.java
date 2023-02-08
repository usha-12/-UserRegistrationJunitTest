package com.brideglabz.junit;

public class UserValidationException extends Exception {
    public UserValidationException(String invalid_firstName) {
        super(invalid_firstName);
    }
}