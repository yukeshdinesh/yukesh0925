package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

public class LoginSteps {
    WebDriver driver;
    LoginPage loginPage;

    @Given("User is on Login Page")
    public void user_is_on_login_page() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
    }

    @When("User enters {string} and {string}")
    public void user_enters_credentials(String user, String pass) {
        loginPage.login(user, pass);
    }

    @Then("User should be logged in successfully")
    public void user_should_be_logged_in() {
        System.out.println("Login Successful");
        driver.quit();
    }
}
