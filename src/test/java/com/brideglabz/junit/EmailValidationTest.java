package com.brideglabz.junit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.regex.Pattern;

@RunWith(Parameterized.class)

public class EmailValidationTest {
    private String email;
    private Boolean expectedResult;
    public EmailValidationTest emailValidation;

    public EmailValidationTest(String email, Boolean expectedResult) {
        this.email = email;
        this.expectedResult = expectedResult;
    }
    public void EmailValidationTest(String email, Boolean expectedResult) {
        this.email = email;
        this.expectedResult = expectedResult;
    }
    @Before
    public void initialize(){
        emailValidation=new EmailValidationTest(email, expectedResult);
    }
    @Parameterized.Parameters
    public static Collection input(){
        return Arrays.asList(new Object[][]{{"abc@yahoo.com",true},{"abc-100@yahoo.com",true},{"abc.100@yahoo.com",true},{"abc111@abc.com",true},{"abc-100@abc.net",true},{"abc.100@abc.com.au",true},{"abc@1.com",true},{"abc@gmail.com.com",true},{"abc+100@gmail.com",true}});
    }
    @Test
    public void testEmailValidation(){
        System.out.println(email+ "======== is valid");
        Assert.assertEquals(expectedResult,emailValidation.checkEmail(email));
    }

    private Boolean checkEmail(String email) {
        return (Pattern.matches("^[A-Za-z]{3,}[.+-]?[A-Za-z0-9]*[@]{1}[a-z0-9]{1,}[.]{1}[a-z]{2,}[.]?[a-z]*$","abc-100@yahoo.com"));
    }
}