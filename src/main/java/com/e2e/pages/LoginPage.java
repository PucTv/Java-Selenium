package com.e2e.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2e.resources.locators.LoginPageLocators;
import com.e2e.pages.CommonFunctions;

public class LoginPage {

    private WebDriver driver;
    private WebDriverWait wait;
    private CommonFunctions common;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
        this.common = new CommonFunctions(this.driver);
    }

    public void tapToLoginButton() {
        common.click(LoginPageLocators.BTN_MENU_LOGIN);
    }

    public void enterEmail(String email) {
        common.inputTexttoElement(LoginPageLocators.TXT_USERNAME_INPUT, email);
    }

    public void enterPassword(String password) {
        common.inputTexttoElement(LoginPageLocators.TXT_PASSWORD_INPUT, password);
    }

    public void tapToLogin() {
        common.click(LoginPageLocators.BTN_LOGIN_BUTTON);
    }

    public void loginSuccess() {
        common.waitForElementNotVisible(LoginPageLocators.BTN_MENU_LOGIN);
    }

    public void loginFailure() {
        common.waitForElementVisible(LoginPageLocators.TXT_ERROR_MESSAGES);
    }

    public void login(String email, String password) {
        tapToLoginButton();
        enterEmail(email);
        enterPassword(password);
        tapToLogin();
    }
}
