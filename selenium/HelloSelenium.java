import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.annotation.processing.SupportedSourceVersion;

public class HelloSelenium {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("http://v1.training-support.net/");
        System.out.println(driver.getTitle());// title of a web page
        WebElement e=driver.findElement(By.id("about-link"));
        e.click();
        System.out.println(driver.getTitle());

        //driver.close();//it will close sepecfic tab
        //driver.quit(); //it will close everything
        //driver.navigate().to("https://v1.training-support.net");
        // Perform testing and assertions

        // Close the browser
        // Feel free to comment out the line below
        // so it doesn't close too quickly
        driver.quit();
    }
}