package com.ceallo.pages;

import com.ceallo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TalkModulePage {

    public TalkModulePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//button[@aria-label='Create a new group conversation']")
    public WebElement createGroupConversationBtn;

    @FindBy(xpath = "//input[@class='conversation-name']")
    public WebElement conversationNameInputBox;

    @FindBy (xpath = "//button[@class='navigation__button navigation__button-right primary']")
    public WebElement addParticipantsBtn;


}
