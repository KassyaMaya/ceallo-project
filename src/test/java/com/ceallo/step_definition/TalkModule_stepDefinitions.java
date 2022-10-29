package com.ceallo.step_definition;

import com.ceallo.pages.DashboardPage;
import com.ceallo.pages.TalkModulePage;
import com.ceallo.utilities.BrowserUtils;
import com.ceallo.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

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



        for (WebElement eachParticipant : talkModulePage.listOfParticipants) {
            eachParticipant.click();
        }

    }

    @When("user clicks create conversation")
    public void user_clicks_create_conversation() {

        talkModulePage.createConversationBtn.click();

        // wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='acli__content__line-one__title']")));
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
        for (WebElement eachParticipant : talkModulePage.participantsInTheChat) {
            Assert.assertTrue(eachParticipant.isDisplayed());

        }
    }

    //=======================================================


    @Given("user is in a group chat")
    public void user_is_in_a_group_chat() {
        dashboardPage.talkModuleButton.click();
        talkModulePage.newGroupChat.click();

        BrowserUtils.sleep(3);
    }

    @When("user clicks the participant's settings and clicks remove participant")
    public void userClicksTheParticipantSSettingsAndClicksRemoveParticipant() {

        for (WebElement eachParticipant : talkModulePage.participantsSettings) {
            eachParticipant.click();
            BrowserUtils.sleep(3);

            talkModulePage.removeParticipantBtn.click();
            BrowserUtils.sleep(3);

        }

    }


    @Then("participant is removed from the chat")
    public void participant_is_removed_from_the_chat() {


        for (WebElement eachParticipant : talkModulePage.participantsSettings) {
            Assert.assertFalse(eachParticipant.isDisplayed());

        }

        try{
            for (WebElement eachParticipant : talkModulePage.participantsSettings) {
                Assert.assertFalse(eachParticipant.isDisplayed());

            }
        } catch (NoSuchElementException e){
            System.out.println("The participant was deleter or there are no participants in the chat");
        }




    }


    //=========================================================
    @When("user clicks the chat settings")
    public void user_clicks_the_chat_settings() {
        talkModulePage.conversationSettings.click();
    }

    @And("user clicks delete conversation option")
    public void userClicksDeleteConversationOption() {
        talkModulePage.deleteConversationOption.click();
    }

    @And("user confirms deletion of the chat it")
    public void userConfirmsDeletionOfTheChatIt() {
        talkModulePage.confirmationBtn.click();
    }

    @Then("the chat is deleted")
    public void the_chat_is_deleted() {
        WebElement firstChatInTheMenu = Driver.getDriver().findElement(By.xpath("(//span[@class='acli__content__line-one__title'])[1]"));
        WebElement secondChatInTheMenu = Driver.getDriver().findElement(By.xpath("(//span[@class='acli__content__line-one__title'])[2]"));

        String nameOfTheChat = firstChatInTheMenu.getText();

        Assert.assertFalse(nameOfTheChat.equals(secondChatInTheMenu.getText()));


    }


    //=========================================================

    @Given("user is in the group chat")
    public void user_is_in_the_group_chat() {
        talkModulePage.newGroupChat.click();
    }


    @When("user types a message within the input box and sends it")
    public void userTypesAMessageWithinTheInputBoxAndSendsIt() {
        talkModulePage.chatInputBox.click();
        talkModulePage.chatInputBox.sendKeys(faker.bothify("##?-??##???????######-##?-??##???????######-##?-??##?"));
        talkModulePage.sendMessageBtn.click();
        talkModulePage.chatInputBox.sendKeys(faker.bothify("?????????????????????????????????????????????????????"));
        talkModulePage.sendMessageBtn.click();
        talkModulePage.chatInputBox.sendKeys(faker.bothify("#####################################################"));
        talkModulePage.sendMessageBtn.click();
    }

    @Then("the message is sent inside the chat")
    public void the_message_is_sent_inside_the_chat() {

        List <WebElement> textInsideTheChat = Driver.getDriver().findElements(By.xpath("//div[contains(@id,'message')]"));

        for (WebElement eachMessage : textInsideTheChat) {
            Assert.assertTrue(eachMessage.isDisplayed());
        }

    }



}

