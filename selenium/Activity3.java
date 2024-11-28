import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) {
        WebDriver driver= new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/login-form");
        System.out.println(driver.getTitle());
//        WebElement e=driver.findElement(By.xpath("//*[@id=\"username\"]"));
        WebElement e=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div/div[1]/input")); //for abstraction xpath

        e.sendKeys("admin");
//        WebElement d=driver.findElement(By.xpath("//*[@id=\"password\"]"));
        WebElement d=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div/div[2]/input"));
        d.sendKeys("password");

        //xpath expression how we can do
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

        // Print the confirmation message
        String message = driver.findElement(By.xpath("//*[@id=\"action-confirmation\"]")).getText();
        System.out.println("Login message: " + message);
        driver.quit();
    }
}
//*[@id="action-confirmation"]