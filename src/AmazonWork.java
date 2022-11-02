import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonWork {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/asmitakakshapati/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://amazon.com/");
        WebElement searchBox= driver.findElement(By.name("field-keywords"));
        searchBox.sendKeys("Alchemist");
        searchBox.submit();
        driver.quit();
    }
}
