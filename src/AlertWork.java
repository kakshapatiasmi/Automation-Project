import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWork {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/asmitakakshapati/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");
         //creating webelement
        WebElement alert=driver.findElement(By.id("button1"));
        alert.click();
        driver.switchTo().alert().accept();

        driver.close();
    }
}
