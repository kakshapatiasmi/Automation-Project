import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Flipkart {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/asmitakakshapati/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        WebElement search= driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
        search.sendKeys("iphone xr 64GB");
        search.submit();

       // ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
       // driver.switchTo().window(tabs.get(1));

        driver.get("https://www.flipkart.com/apple-iphone-xr-product-red-64-gb-includes-earpods-power-adapter/p/itmf9z7zhydhtbn5?pid=MOBF9Z7ZRWGTX3FA&lid=LSTMOBF9Z7ZRWGTX3FAS9XTA1&marketplace=FLIPKART&q=iphone+xr&store=tyy%2F4io&srno=s_1_1&otracker=search&otracker1=search&fm=organic&iid=2b4aa608-1557-45cb-9a33-517d79550076.MOBF9Z7ZRWGTX3FA.SEARCH&ppt=hp&ppn=homepage&ssid=5l1cs82y1s0000001667263201603&qH=651153a0fac18d29");
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        WebElement price= driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[4]/div[1]/div/div[1]"));
        price.getText();
        System.out.println(price);
    }
}
