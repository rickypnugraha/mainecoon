package dinomarket;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author MONQY
 */

public class Dinomarket {    
    
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D://SeleniumProject/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
    //Scenario 1
        System.out.println("1. Go to Dinomarket site");
        driver.navigate().to("http://www.dinomarket.com");
        
        System.out.println("2. Select LOGIN button");
        driver.findElement(By.xpath("//img[contains(@src,'http://media.dinomarket.com/system/themes/th1/navup/bt_login_n_h5.png')]")).click();
        
        System.out.println("3. Login pop-up appear");    
        driver.findElement(By.xpath("/html/body/div[4]/div/div/table/tbody/tr[4]/td[2]/form/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr[4]/td[2]/table/tbody/tr[1]/td[3]/input"));
        
        System.out.println("4. Enter username/ e-mail");
        //driver.findElement(By.name("loginname")).clear();
        driver.findElement(By.name("loginname")).sendKeys("kunyuk@gmail.com");
        
        System.out.println("5. Enter Password");     
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("kunyuk");
    
        System.out.println("6. Select LOGIN button");    
        driver.findElement(By.xpath("/html/body/div[4]/div/div/table/tbody/tr[4]/td[2]/form/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr[4]/td[2]/table/tbody/tr[4]/td[3]/input")).click();
       
        System.out.println("7. If login is success, then it will redirect to My Profile page");     
    }
}
