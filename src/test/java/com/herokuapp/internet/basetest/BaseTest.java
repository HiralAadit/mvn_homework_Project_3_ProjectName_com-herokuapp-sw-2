package com.herokuapp.internet.basetest;

import com.herokuapp.internet.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {
    String browser ="chrome"; //PropertyReader.getInstance().getProperty("browser");
    //"chrome";


    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
    }





    @AfterMethod
    public void tearDown(){
        closerBrowser();
    }
}

