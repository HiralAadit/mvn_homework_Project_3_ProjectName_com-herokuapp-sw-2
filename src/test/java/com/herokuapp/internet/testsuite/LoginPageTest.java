package com.herokuapp.internet.testsuite;

import com.herokuapp.internet.basetest.BaseTest;
import com.herokuapp.internet.pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginpage = new LoginPage();
    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {
        loginpage.getUserName("tomsmith");
        loginpage.getenterPassward("SuperSecretPassword!");
        loginpage.loginButton();
        String expecetdMessage = "Secure Area";
        Assert.assertEquals(loginpage.getVerifyMessage(), expecetdMessage, "No text found");

    }

    @Test
    public void verifyThePasswordErrorMessage() {
        loginpage.getUserName("tomsmith");
        loginpage.getenterPassward("SuperSecretPassword!");
        loginpage.loginButton();
        String expecetdMessage = "";
        Assert.assertEquals(loginpage.getVerifyErrorMessage(),expecetdMessage,"Not text found");

    }
}
