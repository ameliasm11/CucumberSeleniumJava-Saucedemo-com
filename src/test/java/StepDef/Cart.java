package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cart {
    WebDriver driver;

    @Given("User open web url {string}")
    public void userOpenWebUrl(String url) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
    }

    @And("User input username {string} and {string}")
    public void userInputUsernameAnd(String username, String password) {
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @When("User click on Login button")
    public void userClickOnLoginButton() {
        driver.findElement(By.xpath("//input [@class='submit-button btn_action']")).click();
    }

    @Then("User successfully login and navigate to Homepage")
    public void userSuccessfullyLoginAndNavigateToHomepage() throws InterruptedException {
        driver.findElement(By.xpath("//div[@id='inventory_container']")).isDisplayed();
        //Thread.sleep(15);
    }

    @When("Click on Cart Icon")
    public void clickOnCartIcon() {
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]")).click();
    }

    @Then("Cart page displayed")
    public void cartPageDisplayed() {
        driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]")).isDisplayed();
    }
}
