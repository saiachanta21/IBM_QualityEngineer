import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGActivity3 {
    WebDriver driver=new FirefoxDriver();
    @BeforeClass
    void beforeclass(){
        driver.get("https://v1.training-support.net/selenium/login-form");
        System.out.println("Before class fired");
    }
    @Test
    void test1(){
        WebElement username=driver.findElement(By.xpath("//*[@id=\"username\"]"));
        WebElement password=driver.findElement(By.xpath("//*[@id=\"password\"]"));

        username.sendKeys("admin");
        password.sendKeys("password");
        driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/button")).click();
        WebElement con=driver.findElement(By.xpath("//*[@id=\"action-confirmation\"]"));
        con.getText();
        Assert.assertEquals(con.getText(),"Welcome Back, admin");
    }
    @AfterClass
    public void afterClass() {
        //Close browser
        driver.close();
    }
}
