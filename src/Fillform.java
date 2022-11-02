import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fillform {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/asmitakakshapati/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");

        WebElement firstName= driver.findElement(By.name("first_name"));
        firstName.sendKeys("Salu");

        WebElement lastName= driver.findElement(By.name("last_name"));
        lastName.sendKeys("Sharma");

        WebElement email= driver.findElement(By.name("email"));
        email.sendKeys("sharma.salu@mail.com");

        WebElement message= driver.findElement(By.name("message"));
        message.sendKeys("Hello from Nepal");

        WebElement submit= driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]"));
        submit.click();

    driver.close();



    }
}
