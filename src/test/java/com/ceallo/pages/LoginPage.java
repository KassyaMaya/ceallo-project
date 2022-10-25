package com.ceallo.pages;

import com.ceallo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//input[@id='user']")
    public WebElement usernameInputBox;

    @FindBy (xpath = "//input[@id='password']")
    public WebElement passwordInputBox;

    @FindBy (xpath = "//input[@id='submit-form']")
    public WebElement signInButton;





}
