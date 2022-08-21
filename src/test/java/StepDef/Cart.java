package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cart {
    WebDriver driver;
    //private Login login = new Login();
//    @Given("User in the homepage")
//    public void userInTheHomepage() {
//        new Login();
//    }
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

    @When("Click on Login button")
    public void clickOnLoginButton() {
        driver.findElement(By.xpath("//input [@class='submit-button btn_action']")).click();
    }

    @Then("Successfully login and navigate to Homepage")
    public void successfullyLoginAndNavigateToHomepage() {
        driver.findElement(By.xpath("//div[@id='inventory_container']")).isDisplayed();
    }

    @When("Click on Cart Icon")
    public void clickOnCartIcon() {
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).sendKeys();
    }

    @Then("Cart page displayed")
    public void cartPageDisplayed() {
        driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]")).isDisplayed();
    }

    @When("Click on Add To Cart button")
    public void clickOnAddToCartButton() {
    }

    @Then("Count number on Cart Icon appears")
    public void countNumberOnCartIconAppears() {
    }

    @Then("Product appears on Cart List")
    public void productAppearsOnCartList() {
    }

    @When("Click on Remove button")
    public void clickOnRemoveButton() {
    }

    @Then("Product removed from Cart List")
    public void productRemovedFromCartList() {
    }
}
