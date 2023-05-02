package PracticeAprl25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class anothaOne {

    public WebDriver driver;


    @BeforeMethod
    public void nbaLogin(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.nba.com/");
    }

    @Test
    public void statsNBA() throws Exception{
        WebElement teamMenu = driver.findElement(By.xpath("//span[normalize-space()='Stats']"));//Stats
        Thread.sleep(1000);
        Actions actions = new Actions(driver);
        actions.moveToElement(teamMenu).perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Players')]")).click(); //Players
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@href='/stats/players/traditional/?SeasonType=Playoffs']")).click();//See Player Stats
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(),'Traditional')]")).click();//Traditional
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[normalize-space()='Advanced']")).click();//Advanced
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@title='Add a custom filter']//*[name()='svg']")).click();//Filter
        Thread.sleep(1000);
        driver.findElement(By.xpath("//option[@value='USG_PCT']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Value']")).sendKeys("15");
        driver.findElement(By.xpath("//div[@class='UxDropdown_uxdropdown__nrSC0 CromFiltersInput_ddOp___O4Pq']//select[@class='UxDropdown_uxdropdownSelect__V4e8G']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//option[contains(text(),'≥')]")).click();
        Thread.sleep(2000);


    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
