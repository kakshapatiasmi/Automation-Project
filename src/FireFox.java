import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class FireFox {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","/Users/asmitakakshapati/Downloads/geckodriver");
        WebDriver driver=new org.openqa.selenium.firefox.FirefoxDriver();
        driver.get("https:www.google.com/");

        WebElement search= driver.findElement(By.name("q"));
        search.sendKeys("Dentist near me");
        search.submit();
    }
}
