import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Africa {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/asmitakakshapati/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.justwatch.com/");

        WebElement africa= driver.findElement(By.xpath("//*[@id=\"base\"]/div/div/div/div[2]/div[5]/div/div[2]/div[4]"));


        List<WebElement> allContries=africa.findElements(By.tagName("a"));
        for(WebElement w:allContries){
            if(w.getText()==""){
                continue;
            }
            System.out.println(w.getText());
        }
    }
}
