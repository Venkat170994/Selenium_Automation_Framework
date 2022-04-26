package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    @FindBy(xpath = "//tr[2]/td/marquee")
    WebElement welcometext;

    @FindBy(xpath="//tr[3]/td")
    WebElement managerinfo;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getWelcomeText()
    {
        return welcometext.getText().toString();
    }

    public String getManagerInfo()
    {
        return managerinfo.getText().toString();
    }
}
