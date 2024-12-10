import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGActivity2 {
    WebDriver driver = new FirefoxDriver();
    @BeforeClass
    public void beforeMethod(){
        driver.get("https://v1.training-support.net/selenium/target-practice");
        System.out.println("Before class fired ");
    }
    @Test
    void test1(){
        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getTitle().length()>0);
    }
    @Test
    void  test2(){
        WebElement button=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[3]"));
        System.out.println(button.getText());
        Assert.assertSame(button.getText(),null);
    }


    @Test(enabled = false)
    public void one() {
        System.out.println("This is the Test Case number one");
    }
    @Test
    void test4(){
        throw new SkipException("skippedtest");

    }
    @AfterClass
    void afterclass(){
        driver.quit();
    }

}
