import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Jobs {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/asmitakakshapati/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.webdriveruniversity.com/Data-Table/index.html");

        WebElement allJobs= driver.findElement(By.xpath("/html/body/div/div[9]/div[1]/ul[3]"));

        List<WebElement> jobs=allJobs.findElements(By.tagName("li"));
         for (WebElement w:jobs){
             System.out.println(w.getText());
         }
    }
}
