package SignUp;


import com.sun.jdi.ByteValue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Wait;

import java.util.List;
import java.util.stream.Collectors;

public class SignUpTests {
    private WebDriver driver;

    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(5000);


        //1. maximize the window
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        //Locate the firstname
        driver.findElement(By.name("firstname")).sendKeys("Testify");
        driver.findElement(By.name("lastname")).sendKeys("Nigeria");
        driver.findElement(By.name("reg_email__")).sendKeys("testifytesters@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("password");

    }
}