import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class FindMulti {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/asmitakakshapati/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.justwatch.com/");

        List<WebElement> allCountries=driver.findElements(By.tagName("a"));
        for(WebElement w:allCountries){
            if(w.getText() == ""){
                continue;
            }
            System.out.println(w.getText());
        }

    }
}
