package com.ceallo.pages;

import com.ceallo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
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

    @FindBy (xpath = "//span[.='Employee1']")
    public WebElement employee1;

    @FindBy (xpath = "//span[.='Employee10']")
    public WebElement employee10;

    @FindBy (xpath = "//span[.='Employee100']")
    public WebElement employee100;

    @FindBy (xpath = "//span[.='Employee101']")
    public WebElement employee101;

    @FindBy (xpath = "//span[.='Employee102']")
    public WebElement employee102;

    @FindBy (xpath = "//span[.='Employee103']")
    public WebElement employee103;

    @FindBy (xpath = "//span[.='Employee104']")
    public WebElement employee104;

    @FindBy (xpath = "//span[.='Employee105']")
    public WebElement employee105;




}
