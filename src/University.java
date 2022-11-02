import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class University {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/asmitakakshapati/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();

        //open webdriver university website
        driver.get("https://webdriveruniversity.com/");
       //maximizing the window & creating webelement for login
        driver.manage().window().maximize();
         WebElement logIn= driver.findElement(By.xpath("//*[@id=\"login-portal\"]/div/div[1]/h1"));
      //wait time
         Thread.sleep(2000);
         logIn.click();
         //switching to new tab

        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());

        driver.switchTo().window(tabs.get(1));

        //logging in with username n password


        WebElement login= driver.findElement(By.id("text"));
        login.sendKeys("webdriver");

        //second for password
        WebElement pass= driver.findElement(By.id("password"));
        pass.sendKeys("webdriver123");

        //login click button
        WebElement submit= driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        submit.click();
    }
}
