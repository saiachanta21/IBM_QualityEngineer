import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Activity21multipletabs {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        // Store the handle of the current tab in a variable
// This will help you find the newly opened tab later.
        String parentHandle = driver.getWindowHandle();
        driver.get("https://v1.training-support.net/selenium/tab-opener");
        System.out.println(driver.getTitle());
        // Print the handle of the parent window
        System.out.println("Current tab: " + driver.getWindowHandle());
        // Find button to open new tab
        driver.findElement(By.id("launcher")).click();
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
        // Wait for the second tab to open
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        // Print all window handles
        System.out.println("Currently open windows: " + driver.getWindowHandles());

        // Switch focus
        for(String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }

        // Wait for the new page to load
        wait.until(ExpectedConditions.elementToBeClickable(By.id("actionButton")));
        // Print the handle of the current tab
        System.out.println("Current tab: " + driver.getWindowHandle());
        // Print the title and heading of the new page
        System.out.println("Page title: " + driver.getTitle());
        String pageHeading = driver.findElement(By.className("content")).getText();
        System.out.println("Page Heading: " + pageHeading);
        // Find and click the button on page to open another tab
        driver.findElement(By.id("actionButton")).click();

        // Wait for new tab to open
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
        // Switch focus
        for(String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }

        // Wait for the new page to load
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("content")));
        // Print the handle of the current tab
        System.out.println("Current tab: " + driver.getWindowHandle());
        // Print the title and heading of the new page
        System.out.println("Page title: " + driver.getTitle());
        pageHeading = driver.findElement(By.className("content")).getText();
        System.out.println("Page Heading: " + pageHeading);

        // Close the browser
        driver.quit();
    }
}

