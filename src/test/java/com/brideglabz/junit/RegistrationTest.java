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
        Boolean result = validation.checkFirstName("Usha");
        Assertions.assertEquals(result, true);
    }
    @Test
    void given_last_name_should_returnTrue() {
        UserValidation validation = new UserValidation();
        Boolean result1 = validation.checkLastName("Ahirwar");
        Assertions.assertEquals(result1, true);
    }
    @Test
    void given_email_id_should_returnTrue() {
        UserValidation validation = new UserValidation();
        Boolean result2 = validation.checkEmailId("UshaAhirwar@gmail.com");
        Assertions.assertEquals(result2, true);
    }
    @Test
    void given_phoneNumber_should_returnTrue() {
        UserValidation validation = new UserValidation();
        Boolean result3 = validation.phoneNumber("91 9919819801");
        Assertions.assertEquals(result3, true);
    }
    @Test
    void given_password_should_returnTrue() {
        UserValidation validation = new UserValidation();
        Boolean result4 = validation.password("ussaahir");
        Assertions.assertEquals(result4, true);
    }
    @Test
    void given_password1_should_returnTrue() {
        UserValidation validation = new UserValidation();
        Boolean result5 = validation.password2("Ussaahir");
        Assertions.assertEquals(result5, true);
    }
}
/*Rule2
– Should
have at least 1
Upper Case - NOTE – All rules must be passed*/