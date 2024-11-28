import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity16Dynamicattribute2 {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
        System.out.println(driver.getTitle());
        WebElement user=driver.findElement(By.cssSelector("input[class$='-username']"));
        user.sendKeys("saikrishna");
        WebElement pass=driver.findElement(By.cssSelector("input[class$='-password']"));
        pass.sendKeys("sai123");
        WebElement confirmPassword = driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following-sibling::input"));
        //WebElement email = driver.findElement(By.xpath("//label[contains(text(), 'email')]/following-sibling::input"));
       // WebElement confpass=driver.findElement(By.cssSelector("input[name^='name-'"));
        confirmPassword.sendKeys("sai123");
        WebElement email=driver.findElement(By.xpath("//input[starts-with(@class,'email-')]"));
        email.sendKeys("sai21@gmail.com");
        WebElement sign=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/button"));
        sign.click();
        System.out.println(driver.findElement(By.xpath("//*[@id=\"action-confirmation\"]")).getText());
        driver.quit();
    }
}
