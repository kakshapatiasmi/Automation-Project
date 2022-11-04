import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PriceComapre {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/asmitakakshapati/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();

        String productName= "Apple iPhone 12 (64GB) - Blue";
        WebElement searchBox=driver.findElement(By.name("field-keywords"));
        searchBox.sendKeys(productName);
        searchBox.submit();

        String price1=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[1]/div[1]/a/span[1]/span[2]/span[2]")).getText();
        price1=price1.replace("," ,"");
        System.out.println(price1);
        double price1t= Double.parseDouble(price1);

        //for flipkart
        //System.setProperty("webdriver.chrome.driver","/Users/asmitakakshapati/Downloads/chromedriver");
       // driver = new ChromeDriver();
         driver.get("https://www.flipkart.com/");

         WebElement search= driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
        search.sendKeys(productName);
        search.submit();

        String price2=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[2]/div[1]/div[1]/div[1]")).getText();
        price2=price2.replace(",","");
        System.out.println(price2);
        double price2t=Double.parseDouble(price2);


        if(price1t<price2t){
            System.out.println("Amazon prize is low");
        }else if(price2t<price1t){
            System.out.println("Flipcart prize is low");
        }else if(price1t == price2t){
            System.out.println("Both are equal.");
        }else{
            System.out.println("Something went wrong.");
        }

    }
}
