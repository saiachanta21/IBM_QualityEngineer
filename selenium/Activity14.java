import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity14 {
    public static void main(String[] args) {
        WebDriver driver= new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/tables");
        System.out.println(driver.getTitle());
        List<WebElement> rows=driver.findElements(By.xpath("//table[contains(@class, 'ui sortable celled table')]/tbody/tr"));
        System.out.println("Number of rows:"+rows.size());
        List<WebElement> cols=driver.findElements(By.xpath("//table[contains(@class, 'ui sortable celled table')]/tbody/tr[1]/td"));
        System.out.println("Number of columns:"+cols.size());
        WebElement cellValue = driver.findElement(By.xpath("//table[contains(@class, 'ui sortable celled table')]/tbody/tr[2]/td[2]"));
        System.out.println("Second row, second cell value: " + cellValue.getText());
        WebElement head=driver.findElement(By.xpath("//*[@id=\"sortableTable\"]/thead/tr/th[1]"));
        head.click();
        WebElement Storedname = driver.findElement(By.xpath("//table[contains(@class, 'ui sortable celled table')]/tbody/tr[2]/td[2]"));
        System.out.println("Second row, second cell value: " +Storedname.getText());
        // Print the cell values of the footer
        List<WebElement> footer = driver.findElements(By.xpath("//table[@id='sortableTable']/tfoot/tr/th"));
        System.out.println("Cell values of the footer: ");
        for(WebElement cell : footer) {
            System.out.println(cell.getText());
        }
        driver.quit();
    }
}
