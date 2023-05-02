package PracticeAprl25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MorePractice {
    public WebDriver driver;
    public Actions actions;

        @BeforeMethod
        public void redTest() throws Exception {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            actions = new Actions(driver);
            driver.get("https://www.nba.com/");
        }
        @Test
        public void nbaStats() {
            driver.findElement(By.xpath("//span[normalize-space()='Stats']"));
           // actions.moveToElement(element).perform();
            //driver.findElement(By.linkText("Players")).click();
            driver.findElement(By.xpath("//a[@href='/stats/players/traditional/?SeasonType=Playoffs']")).click();
            driver.findElement(By.xpath("//span[contains(text(),'Traditional')]")).click();
            driver.findElement(By.xpath("//a[normalize-space()='Advanced']")).click();
            driver.findElement(By.xpath("//button[@title='Add a custom filter']//*[name()='svg']")).click();
            driver.findElement(By.cssSelector("div[class='UxDropdown_uxdropdown__nrSC0 CromFiltersInput_ddField__Bj3fq'] select[class='UxDropdown_uxdropdownSelect__V4e8G']")).click();
            driver.findElement(By.xpath("//option[@value='USG_PCT']")).click();
        }

        @AfterMethod
        public void tearDown() {
            driver.quit();
        }



}
