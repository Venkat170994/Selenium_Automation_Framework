package StepDefinitions;

import PageObjects.HomePage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePageStepDefinition {
    WebDriver driver;
    HomePage home_page;
    @Then("Verify home page")
    public void Verify_home_page()
    {
        home_page=new HomePage(driver);
        String actual= home_page.getWelcomeText();
        Assert.assertEquals(actual,"Welcome To Manager's Page of Guru99 Bank");
        Assert.assertEquals(actual,"Manger Id : mngr400140");
    }
}
