import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity19Alerts {
    public static void main(String[] args) {
        WebDriver driver= new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/javascript-alerts");
        System.out.println(driver.getTitle());
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        //
        WebElement confirm=driver.findElement(By.xpath("//*[@id=\"confirm\"]"));
        confirm.click();

        // Wait for the alert to be displayed
        wait.until(ExpectedConditions.alertIsPresent());

// Store the alert in a variable
        Alert alert = driver.switchTo().alert();

// Print the text from the alert
        System.out.println(alert.getText());

// Click the OK button on the alert
        alert.accept();

        //alert.dismiss();
        driver.quit();
    }
}
