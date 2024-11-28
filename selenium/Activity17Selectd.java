import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity17Selectd {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/selects");
        System.out.println(driver.getTitle());
        // Store the select and make a new select object
        WebElement dropdown = driver.findElement(By.tagName("select"));
        Select select = new Select(dropdown);

// Selecting the second option based on visible text
        select.selectByVisibleText("Option 2");
        System.out.println(driver.findElement(By.xpath("//*[@id=\"single-value\"]")).getText());
// Select the third option based on Index
        select.selectByIndex(2);
        System.out.println(driver.findElement(By.xpath("//*[@id=\"single-value\"]")).getText());
// Selecting the fourth option based on it's value
        select.selectByValue("4");
        System.out.println(driver.findElement(By.xpath("//*[@id=\"single-value\"]")).getText());
// Selecting the third option based on visible text
        select.selectByVisibleText("Option 2");
        System.out.println(driver.findElement(By.xpath("//*[@id=\"single-value\"]")).getText());
        // Get all the options inside the select as a list
        List<WebElement> options = select.getOptions();
        for(WebElement cell : options) {
            System.out.println(cell.getText());
        }
        driver.quit();
    }
}
