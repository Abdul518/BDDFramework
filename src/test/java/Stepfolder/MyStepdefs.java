package Stepfolder;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs
{
    @Given("User open the Chrome Browser")
    public void userOpenTheChromeBrowser()
    {
        System.out.println("User open the Chrome Browser");



    }

    @When("User open the Argos home page")
    public void userOpenTheArgosHomePage()
    {
        System.out.println("User open the Argos Website Home Page");

    }


    @Then("User verify title present on homepage")
    public void userVerifyLogoPresentOnHomepage()
    {
        System.out.println("User now verify the title of the webpage");

    }

    @And("User close browser")
    public void userCloseBrowser()
    {

        System.out.println("User now closes the Browser once confirmed.");


    }


}
