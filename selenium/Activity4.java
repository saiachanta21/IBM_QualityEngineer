import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/target-practice");
        System.out.println(driver.getTitle());
//        String e=driver.findElement(By.xpath("//*[@id=\"third-header\"]")).getText();
//        System.out.println();
        System.out.println(driver.findElement(By.xpath("//*[@id=\"third-header\"]")).getText());
        String f= driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[1]/h5")).getCssValue("color");
        System.out.println(f);
        WebElement d=driver.findElement(By.cssSelector(".ui.violet.button"));
        System.out.println(d.getAttribute("class"));
        String r=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
        System.out.println(r);
        driver.quit();
    }
}
