import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity7 {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/drag-drop");
        System.out.println(driver.getTitle());
        WebElement drop=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
        WebElement drop1=driver.findElement(By.xpath(" //*[@id=\"dropzone2\"]"));

        Actions builder=new Actions(driver);
        WebElement ball=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
        builder.clickAndHold(ball).moveToElement(drop).release().build().perform();
        // Verify that the ball was dropped in dropzone 1

        String dropzone1Verify = drop.findElement(By.tagName("p")).getText();
        if(dropzone1Verify.equals("Dropped!")) {
            System.out.println("Ball was dropped in dropzone 1");
        }
        //builder.clickAndHold(drop1).release().build().perform();
        builder.clickAndHold(ball).moveToElement(drop1).release().build().perform();
        // Verify that the ball was dropped in dropzone 1
        String dropzone2Verify = drop1.findElement(By.tagName("p")).getText();
        if(dropzone2Verify.equals("Dropped!")) {
            System.out.println("Ball was dropped in dropzone 2");
        }
        driver.quit();
    }
}
