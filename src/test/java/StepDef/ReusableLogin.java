package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReusableLogin {

    WebDriver driver;

    @Given("Open web url {string}")
    public void openWebUrl(String url) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
    }

    @And("Input username {string} and {string}")
    public void inputUsernameAnd(String username, String password) {
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @And("Click on Login button")
    public void clickOnLoginButton() {
        driver.findElement(By.xpath("//input [@class='submit-button btn_action']")).click();
    }

    @And("Successfully login and navigate to Homepage")
    public void successfullyLoginAndNavigateToHomepage() throws InterruptedException {
        driver.findElement(By.xpath("//div[@id='inventory_container']")).isDisplayed();
        Thread.sleep(15);
    }
}
