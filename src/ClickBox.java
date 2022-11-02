import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClickBox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/asmitakakshapati/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

        //creating webelement for option 3
        WebElement clickBox= driver.findElement(By.cssSelector("#checkboxes > label:nth-child(5)"));
        clickBox.click();

       // Thread.sleep(5000);

        //creating webelement for option 4
        WebElement clickBox1= driver.findElement(By.cssSelector("#checkboxes > label:nth-child(7)"));
        clickBox1.click();
        Select select = new Select(driver.findElement(By.id("dropdowm-menu-1")));
        select.selectByValue("sql");
    }
}
