import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class PenDriveStepDefinitions {
    // You may need to set up WebDriver or any other tools for your testing framework
    
    @Given("^User searches for HP Pen Drive$")
    public void userSearchesForHPPenDrive() {
        // Code to navigate to the search page and search for HP Pen Drive
    }

    @When("^Add the first result on the page with quantity (\\d+)$")
    public void addFirstResultWithQuantity(int qty) {
        // Code to click on the first search result and add the specified quantity to the cart
    }

    @Then("^Cart should display (\\d+) pen drive$")
    public void cartShouldDisplayPenDrive(int qty) {
        // Code to verify that the cart displays the expected quantity of pen drives
        int actualQty = // Get the actual quantity from the cart
        Assert.assertEquals(qty, actualQty);
    }
}
