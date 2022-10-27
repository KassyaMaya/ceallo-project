package com.ceallo.step_definition;

import com.ceallo.pages.DashboardPage;
import com.ceallo.pages.TalkModulePage;
import com.ceallo.utilities.BrowserUtils;
import com.ceallo.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TalkModule_stepDefinitions {

    DashboardPage dashboardPage = new DashboardPage();
    TalkModulePage talkModulePage = new TalkModulePage();
    Faker faker = new Faker();
    String groupName = faker.dune().planet();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @Given("user enters the talk module successfully")
    public void user_enters_the_talk_module_successfully() {
        dashboardPage.talkModuleButton.click();
    }

    @When("user clicks create group conversation")
    public void user_clicks_create_group_conversation() {
        talkModulePage.createGroupBtn.click();
    }

    @When("user provides a group name")
    public void user_provides_a_group_name() {

        talkModulePage.nameTheConversation.sendKeys(groupName);
        talkModulePage.nameTheConversation.sendKeys(Keys.ENTER);

    }

    @When("user chooses participants")
    public void user_chooses_participants() {

//        talkModulePage.employee1.click();
//        talkModulePage.employee10.click();
//        talkModulePage.employee100.click();
//        talkModulePage.employee101.click();



        for (WebElement eachParticipant : talkModulePage.listOfParticipants) {
            eachParticipant.click();
        }

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='acli__content__line-one__title']")));

    }

    @When("user clicks create conversation")
    public void user_clicks_create_conversation() {

        talkModulePage.createConversationBtn.click();

        BrowserUtils.sleep(5);


    }

    @Then("user sees the new group chat")
    public void user_sees_the_new_group_chat() {

        Assert.assertTrue(talkModulePage.newGroupChat.isDisplayed());

    }

    //==========================================================

    @When("user clicks the group chat")
    public void user_clicks_the_group_chat() {
        talkModulePage.newGroupChat.click();
    }


    @Then("participants are displayed on the menu bar")
    public void participants_are_displayed_on_the_menu_bar() {

        // created this assertion to check if the chat menu bars is displayed
        Assert.assertTrue(talkModulePage.participantMenuBar.isDisplayed());

        // this assertion is checking if participants are displayed in the chat menu
        for (WebElement eachParticipant : talkModulePage.participantsIntheChat) {
            Assert.assertTrue(eachParticipant.isDisplayed());

        }


    }

}
