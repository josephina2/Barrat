package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AboutUsstepdefs {

    WebDriver driver;

    @Given("^I navigate to the website$")
    public void iNavigateToTheWebsite() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        System.setProperty("webdriver.gecko.driver","C:\\Users\\acer\\IdeaProjects\\barratt\\src\\test\\resources\\geckodriver-v0.21.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("http://www.barrattdevelopments.co.uk");
    }

    @When("^I click on About Us$")
    public void iClickOnAboutUs() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        driver.findElement(By.id("nav-about-us-level1")).click();
        Thread.sleep(3000);
    }

    @Then("^the page opens$")
    public void thePageOpens() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();


    }

    @And("^I click on Who we are$")
    public void iClickOnWhoWeAre() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        driver.findElement(By.xpath("/html/body/form/div[5]/div[3]/div/div/div[1]/div/div[1]/ul/li[1]/a/span")).click();
        Thread.sleep(3000);
    }

    @And("^I click on Our Brand$")
    public void iClickOnOurBrand() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        driver.findElement(By.xpath("/html/body/form/div[5]/div[3]/div/div/div[2]/div[3]/ul/li[2]/a/span")).click();
        Thread.sleep(3000);
    }

    @And("^I click on geographic spread$")
    public void iClickOnGeographicSpread() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        driver.findElement(By.cssSelector(".content-tab > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1) > span:nth-child(1)")).click();
        Thread.sleep(3000);
    }

    @And("^I click on Our people$")
    public void iClickOnOurPeople() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        driver.findElement(By.xpath("/html/body/form/div[5]/div[3]/div/div/div[2]/div[3]/ul/li[4]/a/span")).click();
        Thread.sleep(3000);
    }

    @And("^I click on our suppliers$")
    public void iClickOnOurSuppliers() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        driver.findElement(By.cssSelector(".content-tab > ul:nth-child(1) > li:nth-child(5) > a:nth-child(1) > span:nth-child(1)")).click();
        Thread.sleep(3000);
    }

    @And("^I click on our partnership$")
    public void iClickOnOurPartnership() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        driver.findElement(By.xpath("/html/body/form/div[5]/div[3]/div/div/div[2]/div[3]/ul/li[6]/a/span")).click();
        Thread.sleep(3000);
    }

    @And("^I click on our award$")
    public void iClickOnOurAward() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        driver.findElement(By.xpath("/html/body/form/div[5]/div[3]/div/div/div[2]/div[3]/ul/li[7]/a/span")).click();
        Thread.sleep(3000);
    }

    @And("^I close$")
    public void iClose() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        driver.close();
    }
}
