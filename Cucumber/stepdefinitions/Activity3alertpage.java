package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.bouncycastle.crypto.tls.ContentType.alert;

public class Activity3alertpage {
    WebDriver driver;
    WebDriverWait wait;
    Alert alert;


    @Given("^User is on the page$")
    public void loginpage() throws Throwable {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        //Open the browser
        driver.get("https://v1.training-support.net/selenium/javascript-alerts");
    }
    @When("^User clicks the Simple Alert button$")
    public void simplealert() throws Throwable {
        WebElement simple = driver.findElement(By.xpath("//*[@id=\"simple\"]"));
        simple.click();

    }
    @When("^User clicks the Confirm Alert button$")
    public void confirmalert() throws Throwable {
        WebElement confirm = driver.findElement(By.xpath("//*[@id=\"confirm\"]"));
        confirm.click();

    }
    @When("^User clicks the Prompt Alert button$")
    public void promptalert() throws Throwable {
        WebElement prompt = driver.findElement(By.xpath("//*[@id=\"prompt\"]"));
        prompt.click();

    }
    @Then("^Alert opens$")
    public void alertsimple() throws Throwable {
// Store the alert in a variable
        alert = driver.switchTo().alert();

    }


    @And("^Read the text from it and print it$")
    public void textfrom() throws Throwable {
        // Print the text from the alert
        System.out.println(alert.getText());
    }
    @And("^Write a custom message in it$")
    public void customfrom() throws Throwable {
        alert.sendKeys("saikrishna");


// Print the text from the alert
        System.out.println(alert.getText());
    }

    @And("^Close the alert$")
    public void closealert() throws Throwable {
        // Click the OK button on the alert
        alert.accept();

    }
    @And("^Close the alert with Cancel$")
    public void cancelealert() throws Throwable {
        // Click the OK button on the alert
        alert.accept();

    }

    @And("^Close Browser$")
    public void close() throws Throwable {
        // Click the OK button on the alert
        driver.close();

    }


}
