import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

public class Activity6 {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/input-events");
        System.out.println(driver.getTitle());
        Actions builder=new Actions(driver);
        builder.keyDown("A").build().perform();
        builder.keyDown(Keys.CONTROL).keyDown("A").keyDown(Keys.CONTROL).keyDown("C").build().perform();
        builder.keyDown(Keys.CONTROL).keyDown("A").keyUp(Keys.CONTROL).keyUp("C").build().perform();
        driver.quit();
    }
}
