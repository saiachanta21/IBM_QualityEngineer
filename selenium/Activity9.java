import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity9 {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/ajax");
        System.out.println(driver.getTitle());
        WebElement d= driver.findElement(By.xpath("//*[@id=\"ajax-content\"]/button"));
        d.click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement b= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ajax-content\"]/h1")));
        System.out.println(b.getText());
        //WebDriverWait wait1=new WebDriverWait(driver, Duration.ofMinutes(3));
        WebElement e= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ajax-content\"]/h3")));
        System.out.println(e.getText());
        // Wait for the delayed text and print it
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("h3"), "I'm late!"));
        String lateText = driver.findElement(By.tagName("h3")).getText();
        System.out.println(lateText);
       driver.quit();
    }
}
