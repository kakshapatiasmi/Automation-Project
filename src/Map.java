import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Map {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/asmitakakshapati/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https:www.google.com/maps");
        driver.manage().window().maximize();

        WebElement search=  driver.findElement(By.xpath("//*[@id=\"searchboxinput\"]"));
        search.sendKeys("Dentist near me");

    }
}
