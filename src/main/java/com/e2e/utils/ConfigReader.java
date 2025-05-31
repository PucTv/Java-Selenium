package com.e2e.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties prop;

    public static Properties getProperties() {
        if (prop == null) {
            prop = new Properties();
            try {
                FileInputStream ip = new FileInputStream("src/main/resources/config/config.properties");
                prop.load(ip);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return prop;
    }
}
