import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AutoComplete {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/asmitakakshapati/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");

        driver.manage().window().maximize();

        //creating webelement
        WebElement auto= driver.findElement(By.name("food-item"));
        auto.sendKeys("a");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

       //WebElement as= driver.findElement(By.xpath("//*[@id=\"myInputautocomplete-list\"]/div[1]"));
       //as.click();

       WebElement av=driver.findElement(By.cssSelector("#myInputautocomplete-list > div:nth-child(2)"));
       av.click();

        WebElement submit= driver.findElement(By.id("submit-button"));
        submit.click();

    }
}
