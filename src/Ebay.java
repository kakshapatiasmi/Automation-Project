import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/asmitakakshapati/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();

        String item ="Ipad pro 5th generation 12.9 in";

        WebElement searchBox= driver.findElement(By.xpath("//*[@id=\"gh-ac\"]"));
        searchBox.sendKeys(item);
        searchBox.submit();
        String price= String.valueOf(driver.findElement(By.xpath("//*[@id=\"srp-river-results\"]/ul/li[1]/div/div[2]/div[3]/div[1]/span")));
        price=price.replace(",","");
        System.out.println(price);
        double price1=Double.parseDouble(price);

        //for amazon
        driver.get("https:/www.amazon.com");
        driver.manage().window().maximize();

        WebElement search= driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
        search.sendKeys(item);
        search.submit();

        String price2= String.valueOf(driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[1]/div/a/span[1]/span[2]/span[2]")));
        price2 =price2.replace(",","");
        System.out.println(price2);
        double price2a=Double.parseDouble(price2);
    }
}
