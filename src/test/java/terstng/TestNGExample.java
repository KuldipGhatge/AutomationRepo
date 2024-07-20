package terstng;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestNGExample {
    @Test
    public void testcase1() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chromedriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.close();
    }

    @Test
    public void testcase2() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chromedriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        driver.close();
    }
}
