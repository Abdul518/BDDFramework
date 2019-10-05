package Stepfolder;

import cucumber.api.java.en.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class Siasatsteps {


    @Given("User is on the website")
    public void user_is_on_the_website()
    {
        System.out.println("user open the website");
    }

    @When("User open the siasat URL")
    public void user_open_the_siasat_URL()
    {
        System.out.println("user open the siasat URL");
    }
    @Then("User should be displayed news homepage")
    public void user_should_be_displayed_news_homepage()
    {
        System.out.println("user should be displayed new homepage");
    }

    @Then("User closes the window")
    public void user_closes_the_window()
    {
        System.out.println("user should close the window");
    }

}
