import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGActivity7 {
    WebDriver driver = new FirefoxDriver();
    @BeforeClass(alwaysRun = true)
    public void beforeMethod(){
        driver.get("https://v1.training-support.net/selenium/login-form");
        System.out.println("Before class fired ");
    }

    @DataProvider(name = "Authentication")
    public static Object[][] credentials() {
        return new Object[][] {
                { "admin", "password" },
                {"sai","krishna"}

        };
    }
    @Test(dataProvider = "Authentication")
    public void test(String Username, String Password) {
        //Statements that use sUsername and sPassword.
        WebElement username=driver.findElement(By.xpath("//*[@id=\"username\"]"));
        WebElement password=driver.findElement(By.xpath("//*[@id=\"password\"]"));
        WebElement login=driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/button"));
        username.sendKeys(Username);
        password.sendKeys(Password);
        login.click();

        //Assert Message
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println(loginMessage);
        Assert.assertEquals(loginMessage, "Welcome Back, admin");
        //Assert.assertFalse(loginMessage,"Invalid Credentials");
    }
    @AfterMethod()
        void aftermethod(){
        driver.navigate().refresh();
    }
    @AfterClass
    void afterclass(){
        driver.quit();
    }
}
