package yourpackage.stepdefinitions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderPenDriveSteps {
    // Constructor or @Before method for WebDriver setup
    public OrderPenDriveSteps() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        new ChromeDriver();
    } // Add this closing curly brace

    @Given("User searches for HP Pen Drive")
    public void userSearchesForHPPenDrive() {
        // Rest of your code...
    }

    @When("Add the first result on the page with quantity {int}")
    public void addPenDriveToCart(int qty) {
        // Rest of your code...
    }

    @Then("Cart should display {int} pen drive")
    public void cartShouldDisplayPenDrive(int qty) {
        // Rest of your code...
    }
}
