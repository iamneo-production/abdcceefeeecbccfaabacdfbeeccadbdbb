package com.example.hp.order;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class HPPenDriveOrderStepDefinitions {

    @Given("User searches for HP Pen Drive")
    public void user_searches_for_HP_Pen_Drive() {
        // Implement code to perform the search for HP Pen Drive.
    }

    @When("Add the first result on the page with quantity {int}")
    public void add_the_first_result_with_quantity(int qty) {
        // Implement code to add the first search result to the cart with the specified quantity.
        // You can use qty as a parameter in your code.
    }

    @Then("Cart should display {int} pen drive")
    public void cart_should_display_pen_drive(int qty) {
        // Implement code to verify that the cart displays the expected quantity of pen drives.
        // You can use qty as a parameter in your code.
    }
}
