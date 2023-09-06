import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;

public class OrderPenDriveSteps {
    private WebDriver driver;

    @Given("User searches for HP Pen Drive")
    public void userSearchesForHPPenDrive() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.example.com"); // Replace with the actual website URL
        // Implement code to navigate to the website and search for HP Pen Drive.
    }

    @When("Add the first result on the page with quantity {int}")
    public void addPenDriveToCart(int qty) {
        // Implement code to click on the first result and add it to the cart with the specified quantity.
        WebElement firstResult = driver.findElement(By.xpath("//div[@class='product'][1]")); // Replace with actual XPath
        firstResult.click();

        WebElement quantityInput = driver.findElement(By.id("quantity")); // Replace with the actual quantity input field
        quantityInput.clear();
        quantityInput.sendKeys(String.valueOf(qty));

        WebElement addToCartButton = driver.findElement(By.id("add-to-cart")); // Replace with the actual Add to Cart button
        addToCartButton.click();
    }

    @Then("Cart should display {int} pen drive")
    public void cartShouldDisplayPenDrive(int qty) {
        // Implement code to verify that the cart displays the correct quantity of pen drives.
        WebElement cartQuantity = driver.findElement(By.id("cart-quantity")); // Replace with actual cart quantity element
        int actualQuantity = Integer.parseInt(cartQuantity.getText());
        assertEquals(qty, actualQuantity);
        
        driver.quit(); // Close the browser after the test
    }
}
