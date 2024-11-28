import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity18Multipleselects {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/selects");
        System.out.println(driver.getTitle());
       // WebDriver mulselect= (WebDriver) driver.findElement(By.id("multi-select"));
       // Select select=new Select((WebElement) mulselect);
        WebElement dropdown = driver.findElement(By.id("multi-select"));
        Select select = new Select(dropdown);

        select.selectByVisibleText("Javascript");
        System.out.println(driver.findElement(By.xpath("//*[@id=\"multi-value\"]")).getText());

        select.selectByIndex(4);
        System.out.println(driver.findElement(By.xpath("//*[@id=\"multi-value\"]")).getText());
        select.selectByIndex(5);
        System.out.println(driver.findElement(By.xpath("//*[@id=\"multi-value\"]")).getText());
        select.selectByIndex(6);
        System.out.println(driver.findElement(By.xpath("//*[@id=\"multi-value\"]")).getText());
        select.selectByValue("node");
        System.out.println(driver.findElement(By.xpath("//*[@id=\"multi-value\"]")).getText());
        select.deselectByIndex(5);
        System.out.println(driver.findElement(By.xpath("//*[@id=\"multi-value\"]")).getText());
        List<WebElement>list=select.getAllSelectedOptions();
        for(WebElement muse:list){
            System.out.println(muse.getText());
        }
        driver.quit();



    }
}
