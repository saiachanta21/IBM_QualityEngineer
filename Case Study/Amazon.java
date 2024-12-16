import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Amazon {
    public static void main(String[] args) {
        //setup instances for firefox driver and options
       // FirefoxOptions firefoxOptions = new FirefoxOptions();
        //set the option to run in headless mode
     //   firefoxOptions.addArguments("-headless");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/");


        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
        //  driver.get("https://www.google.com/search?q=cheese&oq=cheese+&gs_lcrp=EgZjaHJvbWUyBggAEEUYOTIGCAEQRRg7MhAIAhAAGJECGMkDGIAEGIoFMg0IAxAAGJIDGIAEGIoFMg0IBBAAGJECGIAEGIoFMg0IBRAAGJECGIAEGIoFMg0IBhAAGJECGIAEGIoFMg0IBxAAGJECGIAEGIoFMgoICBAAGLEDGIAEMgwICRAuGAoYsQMYgATSAQk3NzIyajBqMTWoAgmwAgE&sourceid=chrome&ie=UTF-8");


        // Waiting 30 seconds for an element to be present on the page, checking

// for its presence once every 5 seconds.
//
//        Wait wait = new FluentWait(driver).
//                withTimeout(Duration.ofSeconds(30)).
//                pollingEvery(Duration.ofSeconds(5)).
//                ignoring(NoSuchElementException.class);


        WebElement search = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
        search.click();


        search.sendKeys("amazon");

        Actions builder = new Actions(driver);
        builder.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
        //builder.click(search).build().perform();
        System.out.println(driver.getTitle());
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div[12]/div/div/div[1]/div[2]/div/div[3]/div/div/div/div[1]/a/div[1]/span")));

        WebElement weblink= driver.findElement(By.xpath("/html/body/div[3]/div/div[12]/div/div/div[1]/div[2]/div/div[3]/div/div/div/div[1]/a/div[1]/span"));

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/div[12]/div/div/div[1]/div[2]/div/div[3]/div/div/div/div[1]/a/div[1]/span")));

        weblink.click();
        //search bar
        WebElement searchbar=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));

        searchbar.click();
        searchbar.sendKeys("Iphone16");
        builder.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
        //finding iphone
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/a/h2/span")));

        WebElement iphonefound= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/a/h2/span"));

       // wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/a/h2/span")));

        //iphonefound.click();

        //addto cart
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"a-autoid-1-announce\"]")));

        WebElement iphoneaddtocart= driver.findElement(By.xpath("//*[@id=\"a-autoid-1-announce\"]"));

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"a-autoid-1-announce\"]")));

        iphoneaddtocart.click();

        //find the cart location
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"nav-cart-text-container\"]")));

        WebElement cart= driver.findElement(By.xpath("//*[@id=\"nav-cart-text-container\"]"));

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"nav-cart-text-container\"]")));

        cart.click();
       // WebElement cart=driver.findElement(By.xpath("//*[@id=\"a-autoid-1-announce\"]"));
       // cart.click();


        String fileName=System.currentTimeMillis() + "Test";
        File screenshot=driver.getScreenshotAs(OutputType.FILE);
        // File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File outputFile=new File("LoggerScreenshots/" + fileName+".png");
        System.out.println(outputFile.getAbsolutePath());
        try{
            FileUtils.copyFile(screenshot,outputFile);
        }catch (IOException e){
            e.printStackTrace();
        }


        //procced to pay
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[1]/div[3]/div[5]/div/div[1]/div[1]/div/form/div/div[3]/span/span/span/input")));

        WebElement pay= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[5]/div/div[1]/div[1]/div/form/div/div[3]/span/span/span/input"));

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div[3]/div[5]/div/div[1]/div[1]/div/form/div/div[3]/span/span/span/input")));

        pay.click();

        driver.quit();

    }
}
