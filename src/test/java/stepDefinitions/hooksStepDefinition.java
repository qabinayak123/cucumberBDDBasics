package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class hooksStepDefinition {
    @Before
    public void setUp(){
        System.out.println("Lauch chrome browser");
        System.out.println("Launch application url");
    }
    @After
    public void tearDown(){
        System.out.println("close url application ");
        System.out.println("close browser");
    }
    @Given("User is on add Customer page")
    public void user_is_on_add_Customer_page() {
        System.out.println("User is in  addition page");
    }

    @When("User fills the customer details")
    public void user_fills_the_customer_details() {
        System.out.println("User filled customer details");
    }

    @Then("Customer is added")
    public void customer_is_added() {
        System.out.println("User is added");
    }

    @Given("User is on edit Customer page")
    public void user_is_on_edit_Customer_page() {
        System.out.println("User is in contact update page");
    }

    @When("User edits contact details")
    public void user_edits_contact_details() {
        System.out.println("User contact details edited");
    }

    @Then("contact details updated")
    public void contact_details_updated() {
        System.out.println("User contact deatils updated");
    }

    @Given("User is on delete Customer page")
    public void user_is_on_delete_Customer_page() {
        System.out.println("User in delete customer page");
    }

    @When("User delete customer")
    public void user_delete_customer() {
        System.out.println("User delete Customer");
    }

    @Then("Customer is deleted")
    public void customer_is_deleted() {
       System.out.println("User deleted");
    }
}
