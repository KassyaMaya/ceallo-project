package com.ceallo.pages;

import com.ceallo.utilities.Driver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TalkModulePage {

    public TalkModulePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//button[@aria-label='Create a new group conversation']")
    public WebElement createGroupBtn;

    @FindBy(xpath = "//input[@class='conversation-name']")
    public WebElement nameTheConversation;

    @FindBy (xpath = "//button[@class='navigation__button navigation__button-right primary']")
    public WebElement createConversationBtn;

    // this list appears when you are choosing people ONLY while creating the chat
    @FindBy (xpath = "//li[@class='participant-row']")
    public List<WebElement> listOfParticipants;
    @FindBy (xpath = "//span[@class='acli__content__line-one__title']")
    public WebElement newGroupChat;

    @FindBy (xpath = "//button[@aria-label='Conversation settings']")
    public List<WebElement> conversationSettings;

    @FindBy(xpath = "//span[.='Delete conversation']")
    public WebElement deleteConversationOption;

    @FindBy (xpath = "//button[@aria-label='Participant settings']")
    public List <WebElement> participantsSettings;

    @FindBy (xpath = "(//button[@class='action-button focusable'])[2]")  // @FindBy (xpath = "//span[.='Remove participant']")
    public WebElement removeParticipantBtn;

    @FindBy(xpath = "//li[@class='participant-row offline']")
    public List<WebElement> participantsInTheChat;

    @FindBy(xpath = "(//ul)[7]")
    public WebElement participantMenuBar;

    @FindBy(xpath = "//button[@class='primary']")
    public WebElement confirmationBtn;





}
