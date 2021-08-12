package net.Seamlessly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

@FindBy(xpath = "//input[@id='user']")

    public WebElement userName;

@FindBy(xpath = "//input[@id='password']")
    public  WebElement password;

@FindBy(xpath = "//input[@id='submit-form']")
    public WebElement loginButton;
@FindBy(xpath = "//p[@class='warning wrongPasswordMsg']")
    public  WebElement wrongWarningMessage;

@FindBy(css = "[src='/core/img/actions/toggle.svg']")
    public WebElement eyeIcon;

@FindBy(xpath = "//a[@id='lost-password']")
    public WebElement forgotPasswordIcon;

@FindBy(xpath = "//input[@id='user']")
    public WebElement forgotUserNameBox;

@FindBy(xpath = "//input[@id='reset-password-submit']")
    public WebElement resetPasswordIcon;


@FindBy(xpath = "//p[@class='update']")
    public WebElement resetMessage;

}
