import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.ArrayList;
//import java.util.concurrent.TimeUnit;

public class Hover {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/asmitakakshapati/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Actions/index.html#");
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


      //creating webelements
        WebElement hover= driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[1]/button"));
        hover.click();
        WebElement link=driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[1]/div/a"));
        link.click();

        Thread.sleep(2000);
    //switch to alert box
        driver.switchTo().alert().dismiss();
        driver.close();



    }
}
