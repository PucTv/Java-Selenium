package com.e2e.resources.locators;

import org.openqa.selenium.By;

public class LoginPageLocators {

    public static final By BTN_MENU_LOGIN = By.xpath("//a[contains(text(),'Đăng nhập')]");
    public static final By TXT_USERNAME_INPUT = By.xpath("//input[@id='email']");
    public static final By TXT_PASSWORD_INPUT = By.xpath("//input[@id='password']");
    public static final By BTN_LOGIN_BUTTON = By.xpath("//button[contains(text(),'Đăng nhập')]");
    public static final By TXT_ERROR_MESSAGES = By.xpath("//div[@class='user-message-error']");
}
