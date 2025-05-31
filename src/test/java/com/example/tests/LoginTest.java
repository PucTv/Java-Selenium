package com.example.tests;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.e2e.pages.LoginPage;
import com.e2e.base.BaseTest;

public class LoginTest {

    private LoginPage loginPage;
    private BaseTest baseTest;
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        baseTest = new BaseTest();
        driver = baseTest.initialization();
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testLoginFailure() {
        loginPage.login("invalidEmail@gmail.com", "invalidPassword");
        loginPage.loginFailure();
    }

    @Test
    public void testLoginSuccess() {
        loginPage.login("shino1@gmail.com", "123456");
        loginPage.loginSuccess();
    }

    @AfterMethod
    public void tearDown() {
        baseTest.tearDown();
    }
}
