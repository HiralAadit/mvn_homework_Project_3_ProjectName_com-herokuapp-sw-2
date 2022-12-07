package com.herokuapp.internet.pages;

import com.herokuapp.internet.utility.Utility;
import org.openqa.selenium.By;

import javax.rmi.CORBA.Util;

public class LoginPage extends Utility {

    By usernameField = By.name("username");

    public void getUserName(String username) {
        sendTextToElement(usernameField, username);
    }

    By enterPassward = By.name("password");

    public void getenterPassward(String username) {
        sendTextToElement(enterPassward, username);
    }

    By clickLoginButton = By.xpath("//i[@class='fa fa-2x fa-sign-in']");

    public void loginButton() {
        clickOnElement(clickLoginButton);
    }

    By verifyMessage = By.xpath("//h2[text()=' Secure Area']");

    public String getVerifyMessage() {
        return getTextFromElement(verifyMessage);
    }

    By VerifyErrorMessage = By.xpath("//div[@class = 'flash error']");

    public String getVerifyErrorMessage() {
        return getTextFromElement(verifyMessage);
    }

}
