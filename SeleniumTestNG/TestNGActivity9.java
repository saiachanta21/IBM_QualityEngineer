import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

public class TestNGActivity9 {
    WebDriver driver = new FirefoxDriver();

    @BeforeMethod
    void beforemethod() {
        driver.switchTo().defaultContent();
    }

    @BeforeTest
    void beforetest() {
        driver.get("https://v1.training-support.net/selenium/javascript-alerts");
        System.out.println("Before class fired ");
        Reporter.log("Before class fire");
    }

    @Test
    void simpleAlerttest() {
        WebElement simple = driver.findElement(By.xpath("//*[@id=\"simple\"]"));
        simple.click();
// Store the alert in a variable
        Alert alert = driver.switchTo().alert();
// Print the text from the alert
        System.out.println(alert.getText());
// Click the OK button on the alert
        alert.accept();
        Assert.assertEquals(simple.getText(), "Simple Alert");
        Reporter.log("simple alert");
    }

    @Test
    public void confirmalerttest() {

        WebElement confirm = driver.findElement(By.xpath("//*[@id=\"confirm\"]"));
        confirm.click();

// Store the alert in a variable
        Alert alert1 = driver.switchTo().alert();

// Print the text from the alert
        System.out.println(alert1.getText());

// Click the OK button on the alert
        alert1.accept();
        Assert.assertEquals(confirm.getText(), "Confirmation");
        Reporter.log("conformation");
    }
    @Test
    public void promtalert() {
        WebElement prompt = driver.findElement(By.xpath("//*[@id=\"prompt\"]"));
        prompt.click();

        // Store the alert in a variable
        Alert alert2 = driver.switchTo().alert();
        alert2.sendKeys("saikrishna");


// Print the text from the alert
        System.out.println(alert2.getText());

// Click the OK button on the alert
        alert2.accept();
        Assert.assertEquals(prompt.getText(), "Prompt");

        Reporter.log("prompt");
    }




  @AfterTest
    void aftertest(){
        Reporter.log("Endingtest");
    driver.quit();
     }
}


