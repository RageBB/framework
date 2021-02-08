package com.ant.framework.utils;

import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomDriver implements DriverSource {

    @Override
    public WebDriver newDriver() {
        //return newSafariDriver();
        return newChromeDriver();
    }

    public WebDriver newChromeDriver() {
        return new ChromeDriver();
    }

    public boolean takesScreenshots() {
        return false;
    }
}
