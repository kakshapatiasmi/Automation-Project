import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IMDbWork {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/asmitakakshapati/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://IMDb.com/");
        WebElement searchBox= driver.findElement(By.name("q"));
        searchBox.sendKeys("Black Swan");
        searchBox.submit();
        driver.quit();
    }
}
