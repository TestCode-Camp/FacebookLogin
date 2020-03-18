package Log;

import Login.LoginTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogTests {
    private WebDriver driver;

    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(5000);

        //1. maximize the window
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        driver.findElement(By.id("email")).sendKeys("08161115277");
        driver.findElement(By.id("pass")).sendKeys("Queenade123.");
        driver.findElement(By.id("loginbutton")).click();

    }
    public static void main(String args[]) throws InterruptedException {
        LoginTests test = new LoginTests();
        test.setUp();

    }
}
