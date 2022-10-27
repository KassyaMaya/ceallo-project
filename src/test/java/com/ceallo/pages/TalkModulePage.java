package com.ceallo.pages;

import com.ceallo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
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

    @FindBy(xpath = "//button[@class='navigation__button navigation__button-right primary']")
    public WebElement addParticipantsBtn;

    @FindBy (xpath = "//button[@class='navigation__button navigation__button-right primary']")
    public WebElement createConversationBtn;
/*
    @FindBy(xpath = "//span[.='Employee1']")
    public WebElement employee1;

    @FindBy(xpath = "//span[.='Employee10']")
    public WebElement employee10;

    @FindBy(xpath = "//span[.='Employee100']")
    public WebElement employee100;

    @FindBy(xpath = "//span[.='Employee101']")
    public WebElement employee101;

    @FindBy(xpath = "//span[.='Employee102']")
    public WebElement employee102;

    @FindBy(xpath = "//span[.='Employee103']")
    public WebElement employee103;

    @FindBy(xpath = "//span[.='Employee104']")
    public WebElement employee104;

    @FindBy(xpath = "//span[.='Employee105']")
    public WebElement employee105;

 */

    // this list appears when you are choosing people ONLY while creating the chat
    @FindBy (xpath = "//li[@class='participant-row']")
    public List<WebElement> listOfParticipants;
    @FindBy (xpath = "//span[@class='acli__content__line-one__title']")
    public WebElement newGroupChat;

    @FindBy (xpath = "(//button[@class='icon action-item__menutoggle action-item__menutoggle--default-icon'])[1]")
    public WebElement conversationSettings;

    @FindBy(xpath = "//span[.='Delete conversation']")
    public WebElement deleleteConversationOption;

    @FindBy (xpath = "(//button[@aria-label='Participant settings'])[1]")
    public WebElement participantsSettings;

    @FindBy(xpath = "//li[@class='participant-row offline']")
    public List<WebElement> participantsIntheChat;

    @FindBy(xpath = "(//ul)[7]")
    public WebElement participantMenuBar;

    @FindBy (xpath = "//*[@id=\"menu-rjvxp\"]/li[2]/button/span[2]")
    public WebElement removeParticipantBtn;




}
