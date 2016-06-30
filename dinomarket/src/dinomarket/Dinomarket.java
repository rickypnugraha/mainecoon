package dinomarket;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author MONQY
 */

public class Dinomarket {    
    
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "D://SeleniumProject/chromedriver.exe"); // Location of chromedriver.exe in your computer
        WebDriver driver = new ChromeDriver(); // I use chrome browser
        driver.manage().window().maximize(); // to Maximize the page window
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
        
       
    //Scenario 1 - as a user I want to login using my registered account!
        System.out.println("SCENARIO 1");
        System.out.println("1. Go to Dinomarket site");
        driver.navigate().to("http://www.dinomarket.com");
        
        System.out.println("2. Select LOGIN button");
        driver.findElement(By.xpath("//img[contains(@src,'http://media.dinomarket.com/system/themes/th1/navup/bt_login_n_h5.png')]")).click();
        
        System.out.println("3. Login pop-up appear");    
        driver.findElement(By.xpath("/html/body/div[4]/div/div/table/tbody/tr[4]/td[2]/form/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr[4]/td[2]/table/tbody/tr[1]/td[3]/input"));
        
        System.out.println("4. Enter username/ e-mail");
        //driver.findElement(By.name("loginname")).clear();
        driver.findElement(By.name("loginname")).sendKeys("rickyselenium");
        Thread.sleep(2000);
       
        System.out.println("5. Enter Password");     
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("ja63rh");
        Thread.sleep(2000);
        
        System.out.println("6. Select LOGIN button");    
        driver.findElement(By.xpath("/html/body/div[4]/div/div/table/tbody/tr[4]/td[2]/form/table/tbody/tr/td/table/tbody/tr[3]/td/table/tbody/tr[4]/td[2]/table/tbody/tr[4]/td[3]/input")).click();
        System.out.println("7. If login is success, then it will redirect to My Profile page"); 
               
        
    //Scenario 2 - as a user I want to add product to the cart
        System.out.println("SCENARIO 2");
        System.out.println("1. select Dinomarket icon");
        driver.findElement(By.xpath("/html/body/table[1]/tbody/tr[1]/td/center/table/tbody/tr/td/center/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[2]/a/img")).click();
        
        System.out.println("2. select smartphone menu");        
        driver.findElement(By.xpath("/html/body/center/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr/td[1]/div/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/table/tbody/tr/td[2]/a")).click();
        Thread.sleep(2000);
        
        System.out.println("3. select galaxy s7 device");
        driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/center/table/tbody/tr[3]/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr/td[3]/table[3]/tbody/tr[5]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]/table/tbody/tr[1]/td[1]/table/tbody/tr/td/a/table/tbody/tr[3]/td/table/tbody/tr[5]/td/b")).click();
        Thread.sleep(2000);
        
        System.out.println("4. select Beli Sekarang button");
        driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td/center/table/tbody/tr[1]/td/table/tbody/tr[3]/td/table/tbody/tr[1]/td[4]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td[2]/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[3]/table/tbody/tr[11]/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr[13]/td[1]/img")).click();
        Thread.sleep(2000);
        
        System.out.println("5. close cart pop-up");
        driver.findElement(By.xpath("/html/body/div[7]")).click();
        Thread.sleep(2000);
       
        
        //Scenario 3 - as a user i want to go to LIVE Chat menu, so I can ask the Dinomarket CS
        System.out.println("SCENARIO 3");
        System.out.println("1. select LAYANAN LIVE CHAT menu");
        driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td/a/table/tbody/tr/td/center/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[5]/a/img[2]")).click();
        Thread.sleep(10000);
        
//Since the Dinomarket CS is not 24hrs ONLINE so I just stop the scenarios until this step.
        
       
        driver.quit();
    }
}
