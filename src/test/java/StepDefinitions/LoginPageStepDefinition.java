package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginStepDefinition {
    WebDriver driver;
//    LoginPage login_page;

    @Then("Login with your browser")
    public void HitGoogleonyourbrowser() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "D:\\Venkat\\AutomationPractise\\src\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/v4");
    }

    @When("^Enter the Username and Password$")
    public void entertheUsernameandPassword() throws Throwable {
        login_page = new LoginPage(driver);
        login_page.loginpageisDisplayed();
        Assert.assertEquals(driver.getTitle(), "Guru99 Bank Home Page");
        login_page.login("mngr400140", "YpUnyhe");
    }

    @Then("^Reset the credential$")
    public void Resetthecredential() throws Throwable {
        driver.findElement(By.name("btnReset")).click();
    }

    @Then("Click login")
    public void clickLogin() {
        driver.findElement(By.name("btnLogin")).click();
        driver.close();
        driver.quit();
    }
}
