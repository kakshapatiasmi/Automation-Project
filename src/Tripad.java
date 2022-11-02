import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Tripad {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/asmitakakshapati/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.tripadvisor.in/");
        //driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement search= driver.findElement(By.cssSelector("#lithium-root > main > div.QvCXh.cyIij.fluiI > div > div > div.slvrn.Z0.Wh.EcFTp > form > input.qjfqs._G.B-.z._J.Cj.R0"));
        search.sendKeys("Club Mahindra");
        search.submit();
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("https://www.tripadvisor.in/Hotel_Review-g641714-d1156207-Reviews-Club_Mahindra_Madikeri_Coorg-Madikeri_Kodagu_Coorg_Karnataka.html");


        //js.executeScript("window.scrollBy(0,2000)");
        //driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
       // ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        //driver.switchTo().window(tabs.get(1));

        driver.get("https://www.tripadvisor.in/UserReviewEdit-g641714-d1156207-Club_Mahindra_Madikeri_Coorg-Madikeri_Kodagu_Coorg_Karnataka.html");


       // WebElement title= driver.findElement(By.xpath("//*[@id=\"ReviewTitle\"]"));
       // title.sendKeys("Good Service");
        //title.submit();



       // WebElement stars= driver.findElement(By.xpath("//*[@id=\"MAIN_COL\"]/div/fieldset[1]/div[2]/div/div/div[1]/div[2]"));
        //stars.click();





        WebElement review= driver.findElement(By.xpath("//*[@id=\"ReviewText\"]"));
        review.sendKeys("The service was really good.Good staff and would recommend to my friends");
        review.submit();

        js.executeScript("window.scrollBy(0,5000)");

        WebElement sure= driver.findElement(By.xpath("//*[@id=\"SUBMIT\"]/span"));
        sure.click();




    }


    }

