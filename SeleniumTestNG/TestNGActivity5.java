import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGActivity5 {
    WebDriver driver = new FirefoxDriver();
    @BeforeClass(alwaysRun = true)
    public void beforeMethod(){
        driver.get("https://v1.training-support.net/selenium/target-practice");
        System.out.println("Before class fired ");
    }
    @Test
    void test1(){
        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getTitle().length()>0);
    }
    @Test(groups = {"Header tests"})
    void  test2(){
        WebElement button=driver.findElement(By.xpath("//*[@id=\"third-header\"]"));
        System.out.println(button.getText());
        Assert.assertEquals(button.getText(),"Third header");
    }
    @Test(groups = {"Header tests"})
    void test3(){
        WebElement button1=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[1]/h5"));
        System.out.println(button1.getText());
        Assert.assertEquals(button1.getCssValue("color"),"rgb(33, 186, 69)");
    }
    @Test(groups = {"Button tests"})
    public void test4(){
        WebElement button2=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[1]/button[4]"));
        Assert.assertEquals(button2.getText(),"Olive");
    }
    @Test(groups = {"Button tests"})
    public void test5(){
        WebElement button3=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[1]"));
        Assert.assertEquals(button3.getCssValue("background-color"),"rgb(165, 103, 63)");
    }
    @AfterClass(alwaysRun = true)
    void afterclass(){
        driver.quit();
    }

}
