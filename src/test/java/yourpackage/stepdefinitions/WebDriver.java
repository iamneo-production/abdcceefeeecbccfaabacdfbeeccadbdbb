package yourpackage.stepdefinitions;

public interface WebDriver {

    void get(String string);

    WebElement findElement(Object xpath);

    void quit();

}
