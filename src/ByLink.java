import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class ByLink {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/asmitakakshapati/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();

        //open webdriver university website
       // driver.get("https://webdriveruniversity.com/");
        driver.get("https://webdriveruniversity.com/To-Do-List/index.html");

        //driver.findElement(By.xpath("//*[@id=\"to-do-list\"]")).click();



        //driver.findElement(By.linkText("TO DO LIST"));

        String[] tasks={"Wake up","Drink water","Take freddie for walk","Prepare breakfast","Get ready for qa class"};
        for(int i=0;i< tasks.length;i++){
         WebElement textBox= driver.findElement(By.xpath("//*[@id=\"container\"]/input"));
         textBox.sendKeys(tasks[i]);
         textBox.sendKeys(Keys.ENTER);

         Thread.sleep(2000);
        }

    }
}
