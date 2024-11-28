import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity20Alerts {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/javascript-alerts");
        System.out.println(driver.getTitle());

        WebElement prompt=driver.findElement(By.id("prompt"));
        prompt.click();
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.sendKeys("Awesome!");
        alert.accept();
        driver.quit();
    }
}
