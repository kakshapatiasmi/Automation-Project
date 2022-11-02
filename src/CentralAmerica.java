import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CentralAmerica {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/asmitakakshapati/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.justwatch.com/");
        //creating webelement for central america
        WebElement central= driver.findElement(By.xpath("//*[@id=\"base\"]/div/div/div/div[2]/div[5]/div/div[2]/div[3]/div[2]"));
        //lsiting all countries of central america by using tagname i.e (a)
        List<WebElement> allCountries=central.findElements(By.tagName("a"));

        //using for loop to print names and also using break and continue loop to remove blank spaces
        for(WebElement w:allCountries){
            if(w.getText()==""){
                continue;
            }
            System.out.println(w.getText());
        }

    }
}
