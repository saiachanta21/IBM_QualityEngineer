import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.SocketOption;
import java.time.Duration;

public class Activity8 {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        System.out.println(driver.getTitle());
        WebElement removecheckbox=driver.findElement(By.xpath("//*[@id=\"toggleCheckbox\"]"));
        removecheckbox.click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"dynamicCheckbox\"]/label")));
       // WebElement d=driver.findElement(By.xpath("//*[@id=\"toggleCheckbox\"]"));
        removecheckbox.click();
        WebElement box=driver.findElement(By.xpath("//*[@id=\"dynamicCheckbox\"]/input"));
        box.click();
        driver.quit();

    }
}
