import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGActivity6 {
    WebDriver driver = new FirefoxDriver();
    @BeforeClass(alwaysRun = true)
    public void beforeMethod(){
        driver.get("https://v1.training-support.net/selenium/login-form");

        System.out.println("Before class fired ");
    }
    @Test
    @Parameters({ "sUsername", "sPassword" })
    public void test( String sUsername, String sPassword) {
        //Statements that use sUsername and sPassword.
        WebElement username=driver.findElement(By.xpath("//*[@id=\"username\"]"));
        WebElement password=driver.findElement(By.xpath("//*[@id=\"password\"]"));
        WebElement login=driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/button"));
        username.sendKeys(sUsername);
        password.sendKeys(sPassword);
        login.click();

        //Assert Message
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println(loginMessage);
        Assert.assertEquals(loginMessage, "Welcome Back, admin");
    }
    @AfterClass
    void afterclass(){
        driver.quit();
    }
}
