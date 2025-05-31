package com.e2e.base;

import com.e2e.utils.ConfigReader;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {

    protected static WebDriver driver;

    public WebDriver initialization() {
        String browser = ConfigReader.getProperties().getProperty("browser");
        String url = ConfigReader.getProperties().getProperty("BaseUrl");

        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver()
                    .cachePath(System.getProperty("user.dir") + "/wdm-cache")
                    .setup();
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(url);
        return driver;
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
