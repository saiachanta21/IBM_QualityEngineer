import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

public class filpkart {
    public static void main(String[] args) throws InterruptedException {

        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.flipkart.com/");

        Wait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);


        Actions builder = new Actions(driver);

        System.out.println("Main Window Title: " + driver.getTitle());

        WebElement searchbar = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[1]/div[1]/header/div[1]/div[2]/form/div/div/input"));
        searchbar.click();
        searchbar.sendKeys("Iphone16");
        builder.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")));
        WebElement iphonefound = driver.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]"));

        System.out.println(driver.getCurrentUrl() + iphonefound.getText());
        iphonefound.click();

        String originalWindow = driver.getWindowHandle();
        Thread.sleep(5000);
        Set<String> allWindows = driver.getWindowHandles();
        for (String windowHandle : allWindows) { if (!windowHandle.equals(originalWindow)) { driver.switchTo().window(windowHandle); break; }}
        System.out.println("Title of the new tab: " +driver.getTitle());

        wait.until(ExpectedConditions.urlContains("https://www.flipkart.com/apple-iphone-16-ultramarine-128-gb/p/"));
        WebElement addToCartButton = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button"));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button"))); // Adjust the locator if necessary
        System.out.println(addToCartButton.getText());
        addToCartButton.click();

        System.out.println("iPhone added to cart!");

        driver.quit();
    }
}


//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.*;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.io.File;
//import java.io.IOException;
//import java.time.Duration;
//import java.util.Iterator;
//import java.util.Set;
//
//public class filpkart {
//    public static void main(String[] args) {
//        // Setup instances for Firefox driver and options
//        // FirefoxOptions firefoxOptions = new FirefoxOptions();
//        // Set the option to run in headless mode
//        // firefoxOptions.addArguments("-headless");
//        FirefoxDriver driver = new FirefoxDriver();
//        driver.get("https://www.google.com/");
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//
//        WebElement search = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
//        search.click();
//
//        search.sendKeys("flipkart");
//
//        Actions builder = new Actions(driver);
//        builder.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
//        System.out.println(driver.getTitle());
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div[12]/div/div[1]/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3")));
//        WebElement weblink = driver.findElement(By.xpath("/html/body/div[3]/div/div[12]/div/div[1]/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3"));
//
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div/div[12]/div/div[1]/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3")));
//        weblink.click();
//
//
//        String mainWindowHandle = driver.getWindowHandle();
//        Set<String> allWindowHandles = driver.getWindowHandles();
//        Iterator<String> iterator = allWindowHandles.iterator();
//
//        while (iterator.hasNext()) {
//            String handle = iterator.next();
//            if (!handle.equals(mainWindowHandle)) {
//                driver.switchTo().window(handle);
//                System.out.println("New Window Title: " + driver.getTitle());
//                break;
//            }
//        }
//
//        // Search bar in new window
//        WebElement searchbar = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[1]/div[1]/header/div[1]/div[2]/form/div/div/input"));
//        searchbar.click();
//        searchbar.sendKeys("Iphone16");
//        builder.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
//
//        // Finding iPhone
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")));
//        WebElement iphonefound = driver.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]"));
//
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")));
//        iphonefound.click();
////add to cart
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")));
//        WebElement addtocart = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button"));
//
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")));
//        addtocart.click();

// Switch back to main window
//  driver.switchTo().window(mainWindowHandle);

// Close the browser
//  driver.quit();
//  }
//}

//Window handles
//
//        //addto cart
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"a-autoid-1-announce\"]")));
//
//        WebElement iphoneaddtocart= driver.findElement(By.xpath("//*[@id=\"a-autoid-1-announce\"]"));
//
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"a-autoid-1-announce\"]")));
//
//        iphoneaddtocart.click();
//
//        //find the cart location
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"nav-cart-text-container\"]")));
//
//        WebElement cart= driver.findElement(By.xpath("//*[@id=\"nav-cart-text-container\"]"));
//
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"nav-cart-text-container\"]")));
//
//        cart.click();
//        // WebElement cart=driver.findElement(By.xpath("//*[@id=\"a-autoid-1-announce\"]"));
//        // cart.click();
//
//
//        String fileName=System.currentTimeMillis() + "Test";
//        File screenshot=driver.getScreenshotAs(OutputType.FILE);
//        // File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        File outputFile=new File("LoggerScreenshots/" + fileName+".png");
//        System.out.println(outputFile.getAbsolutePath());
//        try{
//            FileUtils.copyFile(screenshot,outputFile);
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//
//
//        //procced to pay
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[1]/div[3]/div[5]/div/div[1]/div[1]/div/form/div/div[3]/span/span/span/input")));
//
//        WebElement pay= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[5]/div/div[1]/div[1]/div/form/div/div[3]/span/span/span/input"));
//
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[1]/div[3]/div[5]/div/div[1]/div[1]/div/form/div/div[3]/span/span/span/input")));
//
//        pay.click();
//
//        driver.quit();

//}//
//}
