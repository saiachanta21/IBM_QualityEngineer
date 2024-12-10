import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.annotation.processing.SupportedSourceVersion;
public class TestNGActivity1 {
    WebDriver driver = new FirefoxDriver();
    @BeforeClass
    public void beforeMethod(){

        driver.get("http://v1.training-support.net/");
        System.out.println("Before class fired ");
    }
    @Test
    void atitle(){
        String title=driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(driver.getTitle(),"Training Support");
    }
    @Test
    void babout(){
        WebElement about=driver.findElement(By.xpath("//*[@id=\"about-link\"]"));
        about.click();
        Assert.assertEquals(driver.getTitle(),"About Training Support");
    }
    @AfterClass
            public void closeBrowser() {
        System.out.println("After class fired");
        driver.quit();
    }
}
