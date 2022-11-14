import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Ebay {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/asmitakakshapati/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String item ="Ipad pro 5th generation 12.9 in";

        WebElement searchBox= driver.findElement(By.xpath("//*[@id=\"gh-ac\"]"));
        searchBox.sendKeys(item);
        searchBox.submit();
        String price= String.valueOf(driver.findElement(By.xpath("//*[@id=\"srp-river-results\"]/ul/li[1]/div/div[2]/div[3]/div[1]/span")));
        price=price.replace(",","");
        System.out.println(price);
        double price1=Double.parseDouble(price);

        //for amazon
        System.setProperty("webdriver.chrome.driver","/Users/asmitakakshapati/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("https:/www.amazon.com");
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.manage().window().maximize();

        WebElement search= driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
        search.sendKeys(item);
        search.submit();

        String price2= String.valueOf(driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[1]/div/a/span[1]/span[2]/span[2]")));
        price2 =price2.replace(",","");
        System.out.println(price2);
        double price2a=Double.parseDouble(price2);

        if(price1<price2a){
            System.out.println("Ebay prize is low");
        }else if(price2a<price1){
            System.out.println("Amazon prize is low");
        }else if(price1 == price2a){
            System.out.println("Both are equal.");
        }else{
            System.out.println("Something went wrong.");
        }
    }
}
