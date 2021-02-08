package com.ant.framework.pages;

import net.thucydides.core.pages.PageObject;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class BasePage extends PageObject {

    public void test1(){
        getDriver().get("https://www.google.ru/");
    }

}
