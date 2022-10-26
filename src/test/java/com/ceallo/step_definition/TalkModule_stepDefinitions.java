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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class TalkModule_stepDefinitions {

    DashboardPage dashboardPage = new DashboardPage();
    TalkModulePage talkModulePage = new TalkModulePage();
    Faker faker = new Faker();
    String groupName = faker.ancient().god();


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

        talkModulePage.employee1.click();
        talkModulePage.employee10.click();
        talkModulePage.employee100.click();
        talkModulePage.employee101.click();


    }

    @When("user clicks create conversation")
    public void user_clicks_create_conversation() {

        talkModulePage.createConversationBtn.click();

    }

    @Then("user sees the new group chat")
    public void user_sees_the_new_group_chat() {

        Assert.assertTrue(talkModulePage.newGroupChat.isDisplayed());

    }


}
