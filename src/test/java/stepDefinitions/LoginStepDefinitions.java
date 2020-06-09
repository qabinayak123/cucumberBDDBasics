package stepDefinitions;



import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class LoginStepDefinitions {
    public WebDriver driver = null;

    @Given("^Open Browser$")
    public void open_Browser() {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @When("^Enter the url \"([^\"]*)\"$")
    public void enter_the_url(String url) {
        // Write code here that turns the phrase above into concrete actions
        driver.get(url);

    }

    @When("^click on My Account Menu$")
    public void click_on_My_Account_Menu() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.linkText("My Account")).click();
        Thread.sleep(10000);

    }
      //Passing hard coded values directly in code
    /*    @When("^Enter registered username and password$")
        public void enter_registered_username_and_password() {
            // Write code here that turns the phrase above into concrete actions
            driver.findElement(By.id("username")).sendKeys("abcd.1234@gmail.com");
            driver.findElement(By.id("password")).sendKeys("Zqfy4w@N8ecqs@P");

        }*/
      //Passing value through regular expression
/*    @When("Enter registered username {string} and password {string}")
    public void enter_registered_username_and_password(String usr, String pwd) {
        driver.findElement(By.id("username")).sendKeys(usr);
        driver.findElement(By.id("password")).sendKeys(pwd);
    }*/
/*      @When("Enter registered username and password")
      public void enter_registered_username_and_password(DataTable credentials) {
          // Write code here that turns the phrase above into concrete actions
          // For automatic transformation, change DataTable to one of
          // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
          // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
          // Double, Byte, Short, Long, BigInteger or BigDecimal.
          //
          // For other transformations you can register a DataTableType.
          List<List<String>> data=credentials.asLists();
          driver.findElement(By.id("username")).sendKeys(data.get(0).get(0));
          driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));
      }*/
    @When("Enter registered username and password")
    public void enter_registered_username_and_password(DataTable credentials) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        List<Map<String,String>> data=credentials.asMaps();
        driver.findElement(By.id("username")).sendKeys(data.get(0).get("username"));
        driver.findElement(By.id("password")).sendKeys(data.get(0).get("password"));
    }


    @When("^Click on login Button$")
    public void click_on_login_Button() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//*[@name='login']")).click();

    }

    @Then("^User Must successfully login to application$")
    public void user_Must_successfully_login_to_application() {
        // Write code here that turns the phrase above into concrete actions
        String capText = driver.findElement(By.xpath("//*[@id='page-36']/div/div[1]/div/p[1]/strong")).getText();
        Assert.assertEquals(capText, "abcd.1234");
        driver.close();

    }

    @Then("verify login")
    public void verifyLogin() {
        String CapText=driver.findElement(By.xpath("//*[@id='page-36']/div/div[1]/ul/li/strong[1]")).getText();
        if(CapText.contains("ERROR")){
            Assert.assertTrue(true, "Invalid input - Error Page");
        }else
            Assert.assertTrue(false);
    }

}
