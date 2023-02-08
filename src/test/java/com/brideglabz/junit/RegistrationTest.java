package com.brideglabz.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
public class RegistrationTest {
    @BeforeAll
    static void Msg(){
        System.out.println("Welcome to User Registration Problem");
    }
    @AfterEach
    public void afterMsg(){
        System.out.println("Passed");
    }
    @Test
    void given_first_name_should_returnTrue() {
        UserValidation validation = new UserValidation();
        Boolean result = validation.checkFirstName("Aditya");
        Assertions.assertEquals(result, true);
    }
}
