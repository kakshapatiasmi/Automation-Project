import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/asmitakakshapati/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://thulotechnology.github.io/SampleTestWebsite/");
        driver.manage().window().maximize();

        driver.switchTo().frame("ourframe");

        WebElement intro= driver.findElement(By.xpath("//*[@id=\"content-wrapper\"]/ul/li[1]/a"));
        intro.click();

        WebElement dart= driver.findElement(By.xpath("//*[@id=\"body-inner\"]/div[1]/ul/li[1]/a"));
        dart.click();
         Thread.sleep(2000);

        WebElement install= driver.findElement(By.xpath("//*[@id=\"content-wrapper\"]/ul/li[1]/ul/li[2]/a"));
        install.click();

        driver.switchTo().defaultContent();
        WebElement num1 = driver.findElement(By.id("num1"));
                num1.sendKeys("23");
                WebElement num2 = driver.findElement(By.id("num2"));
                        num2.sendKeys("10");
                WebElement button = driver.findElement(By.tagName("button"));
                button.click();

        driver.close();

    }
}
