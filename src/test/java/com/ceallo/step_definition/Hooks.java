package com.ceallo.step_definition;

import com.ceallo.pages.DashboardPage;
import com.ceallo.pages.LoginPage;
import com.ceallo.utilities.ConfigurationReader;
import com.ceallo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    @Before
    public void setupLogin(){


        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        loginPage.usernameInputBox.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.passwordInputBox.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.signInButton.click();

        dashboardPage.talkModuleButton.click();



    }

    @After
    public void teardownScenario(Scenario scenario){

        if(scenario.isFailed()){
            byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        Driver.closeDriver();


    }

}
