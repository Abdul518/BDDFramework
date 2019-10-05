package Stepfolder;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyStepdefs {

    WebDriver driver;

    @Given("User open the Chrome Browser")

    public void userOpenTheChromeBrowser() {
        System.out.println("User open the Chrome Browser");


    }
    @When("User open the Argos home page")
    public void userOpenTheArgosHomePage() {
        System.out.println("User open the Argos Website Home Page");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Qadeeer\\Documents\\jar libraries\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.argos.co.uk/");
        driver.manage().window().maximize();
        driver.findElement(By.id("searchTerm")).click();
        driver.findElement(By.id("searchTerm")).sendKeys("Printers");
        driver.findElement(By.id("searchTerm")).click();

    }
    @Then("User verify title present on homepage")
    public void userVerifyLogoPresentOnHomepage() throws InterruptedException {
        System.out.println("User now verify the title of the webpage");
        Thread.sleep(5000);
      //  driver.findElement(By.xpath("//input[@id='searchTerm']")).sendKeys("printer");
        //driver.findElement(By.xpath("//input[@id='searchTerm']")).click();
        // boolean b = true;
        //Assert.assertTrue(b);
        //System.out.println("b");

    }

    @And("User close browser")
    public void userCloseBrowser() {

        System.out.println("User now closes the Browser once confirmed.");


    }


}
