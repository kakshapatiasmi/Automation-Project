import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
public class Multipletabs {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","/Users/asmitakakshapati/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();

        HashMap<String, String> website = new HashMap<String, String>();

        website.put("justwatch","https://justwatch.com");
        website.put("youtube","http://youtube.com");
        website.put("stackoverflow","http://stackoverflow.com");
        website.put("sephora","http://sephora.com");
        //using for loop

        for(String a:website.keySet()){
            System.out.println(website.get(a));
            driver.get(website.get(a));

            File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(src,new File("/Users/asmitakakshapati/Desktop/screenshot1/"+a+".png"));
        }

    }
}
