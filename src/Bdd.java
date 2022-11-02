import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bdd {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/asmitakakshapati/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.webdriveruniversity.com/Accordion/index.html");

        WebElement cucmber= driver.findElement(By.xpath("//*[@id=\"cucumber-accordion\"]"));
        cucmber.click();

        WebElement text= driver.findElement(By.xpath("//*[@id=\"cucumber-testing-description\"]"));
        text.getText();

        System.out.print(text.getText());
    }
}
