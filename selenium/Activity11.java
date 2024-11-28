import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11 {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        System.out.println(driver.getTitle());
        WebElement e=driver.findElement(By.xpath("//*[@id=\"dynamicCheckbox\"]/input"));
        e.isSelected();
        System.out.println(e.isSelected());
        e.click();
        e.isSelected();
        System.out.println(e.isSelected());
        driver.quit();

    }
}
