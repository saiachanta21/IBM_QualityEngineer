import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity15_dynamicattribute {
    public static void main(String[] args) {
        WebDriver driver =new FirefoxDriver();
        Actions builder=new Actions(driver);
        driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
        System.out.println(driver.getTitle());

        WebElement user=driver.findElement(By.xpath("//input[starts-with(@class,'username-')]"));
        user.sendKeys("admin");
        WebElement pass=driver.findElement(By.xpath("//input[starts-with(@class,'password-')]"));
        pass.sendKeys("password");
        WebElement login=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[1]/div/div/button"));
        login.click();
        System.out.println(driver.findElement(By.xpath("//*[@id=\"action-confirmation\"]")).getText());
        driver.quit();
    }
}
