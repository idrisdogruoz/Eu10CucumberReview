package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class VyTrackLoginTest {


    @Given("user in  on login page")
    public void user_in_on_login_page() {
        WebDriverManager.chromedriver().setup();
    }
    @When("user  enters {string} and {string} as credentials")
    public void user_enters_and_as_credentials(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user  is  on the  dashboard page")
    public void user_is_on_the_dashboard_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
