package com.ant.framework.features;

import com.ant.framework.steps.UserSteps;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class CommonStepDefinition {

    @Steps(shared = true)
    protected UserSteps user;

    @Before
    public void setupStage(){
        final WebDriver driver = ((WebDriverFacade) user.getDriver()).getProxiedDriver();
        OnStage.setTheStage(Cast.ofStandardActors());
    }

    @When("test1")
    public void test1(){
        user.test1();
    }
}
