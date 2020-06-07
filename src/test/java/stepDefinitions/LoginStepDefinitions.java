package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginStepDefinitions {
    public WebDriver driver=null;
    @Given("^Open Browser$")
    public void open_Browser() {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\drivers\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();

    }

    @When("^Enter the url \"([^\"]*)\"$")
    public void enter_the_url(String string) {
        // Write code here that turns the phrase above into concrete actions
        driver.get("http://practice.automationtesting.in/");

    }

    @When("^click on My Account Menu$")
    public void click_on_My_Account_Menu() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.linkText("My Account")).click();
        Thread.sleep(10000);

    }

    @When("^Enter registered username and password$")
    public void enter_registered_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.id("username")).sendKeys("abcd.1234@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Zqfy4w@N8ecqs@P");

    }

    @When("^Click on login Button$")
    public void click_on_login_Button() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//*[@name='login']")).click();

    }

    @Then("^User Must successfully login to application$")
    public void user_Must_successfully_login_to_application() {
        // Write code here that turns the phrase above into concrete actions
        String capText=driver.findElement(By.xpath("//*[@id='page-36']/div/div[1]/div/p[1]/strong")).getText();
        Assert.assertEquals(capText,"abcd.1234");

    }
}
