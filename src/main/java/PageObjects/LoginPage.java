package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    @FindBy(name = "uid")
    WebElement userName;

    @FindBy(name = "password")
    WebElement pwd;

    @FindBy(name = "btnReset")
    WebElement reset;

    @FindBy(name = "btnLogin")
    WebElement submit;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setUserName(String strUserName) {
        userName.sendKeys(strUserName);
    }

    public void setPassword(String strPassword) {
        pwd.sendKeys(strPassword);
    }


    public void clickLogin() {
        submit.click();
    }


    public void clickReset() {
        reset.click();
    }

    public void login(String strUserName, String strPassword) {
        this.setUserName(strUserName);
        this.setPassword(strPassword);
    }

    public boolean loginpageisDisplayed()
    {
        userName.isDisplayed();
        pwd.isDisplayed();
        reset.isDisplayed();
        submit.isDisplayed();

        return true;
    }

}