import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class RadioButton {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/asmitakakshapati/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();

        //open webdriver university website
        driver.get("https://webdriveruniversity.com/");
        driver.manage().window().maximize();

        WebElement radio= driver.findElement(By.cssSelector("#dropdown-checkboxes-radiobuttons > div > div.section-title > h1"));
        radio.click();

        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());

        driver.switchTo().window(tabs.get(1));

        WebElement green= driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]/input[1]"));
        green.click();

        Thread.sleep(5000);

        WebElement yellow= driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]/input[3]"));
        yellow.click();

        Thread.sleep(5000);

        driver.close();
    }
}
