import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Instant;

public class GoogleActivity {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        //  driver.get("https://www.google.com/search?q=cheese&oq=cheese+&gs_lcrp=EgZjaHJvbWUyBggAEEUYOTIGCAEQRRg7MhAIAhAAGJECGMkDGIAEGIoFMg0IAxAAGJIDGIAEGIoFMg0IBBAAGJECGIAEGIoFMg0IBRAAGJECGIAEGIoFMg0IBhAAGJECGIAEGIoFMg0IBxAAGJECGIAEGIoFMgoICBAAGLEDGIAEMgwICRAuGAoYsQMYgATSAQk3NzIyajBqMTWoAgmwAgE&sourceid=chrome&ie=UTF-8");
        driver.get("https://www.google.com/");

        WebElement search= driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
        search.click();

        search.sendKeys("Cheese");

        Actions builder=new Actions(driver);
        builder.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
        //builder.click(search).build().perform();
        System.out.println(driver.getTitle());

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id=\"hdtb-tls\"]")));

        WebElement e= driver.findElement(By.xpath("//*[@id=\"hdtb-tls\"]"));

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id=\"hdtb-tls\"]")));
        
        e.click();

        System.out.println(e.getText());

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"result-stats\"]")));
        WebElement d= driver.findElement(By.xpath("//*[@id=\"result-stats\"]"));

        System.out.println(d.getText());

        driver.quit();
    }
}
