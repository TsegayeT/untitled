package PracticeAprl25;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TutorialsNinja {
    public WebDriver driver;

        @BeforeMethod
            public void websiteTut() throws Exception{
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://tutorialsninja.com/demo/");
        }

        @Test
            public void loginTut() throws Exception{
            driver.findElement(By.xpath("//a[@title='My Account']")).click();
            driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
            driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("thmans@gmail.com");
            driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("jfa12nnd");

        }
        @AfterMethod
        public void tearDown(){
            driver.quit();
        }


}
