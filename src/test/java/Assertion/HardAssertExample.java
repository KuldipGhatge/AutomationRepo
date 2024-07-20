package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample {



    @Test
    public void verifyHardassertstatment(){
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chromedriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//u[text()='Create a new account']")).click();
        String textTitle = driver.findElement(By.xpath("//td[text()='Create a Rediffmail account']")).getText();

        Assert.assertEquals(textTitle,  "create a Rediffmail account",  "Text should be Create a Rediffmail account");
        WebElement usernameTextbox = driver.findElement(By.xpath("//input[@name='namef6ed32cd']"));
        Assert.assertTrue(usernameTextbox.isDisplayed(),"User name text box should be displayed");
        
f
        driver.close();
    }
}
