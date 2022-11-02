import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/asmitakakshapati/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Login-Portal/index.html");

        String username="";
        String password="";
       WebElement login= driver.findElement(By.id("text"));
       login.sendKeys(username);
       WebElement pass= driver.findElement(By.id("password"));
       pass.sendKeys(password);

        WebElement submit= driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        submit.click();

        String text=driver.switchTo().alert().getText();
        //System.out.println(text);

     if(text .equals("Validation failed")){
         System.out.println("Test case fail");
     }else{
         System.out.println("Test case pass");
     }

    }
}
