import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.annotation.processing.SupportedSourceVersion;

public class Activity2 {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://v1.training-support.net/selenium/login-form");
        System.out.println(driver.getTitle());// title of a web page
        WebElement e=driver.findElement(By.id("username"));
        e.sendKeys("admin");
        WebElement d=driver.findElement(By.name("Password"));
        d.sendKeys("password");

        //xpath expression how we can do
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        // Print the confirmation message
        String message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + message);
        driver.quit();
        //System.out.println(driver.getTitle());

        //driver.close();//it will close sepecfic tab
        //driver.quit(); //it will close everything
        //driver.navigate().to("https://v1.training-support.net");
        // Perform testing and assertions

        // Close the browser
        // Feel free to comment out the line below
        // so it doesn't close too quickly

    }
}