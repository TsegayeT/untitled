package automation_30Aprl;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTables_Dynamic {
        String companyName = "Jetmall Spices";

        public WebDriver driver;

        @Test
        public void getTable(){
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://money.rediff.com/gainers");
            List<WebElement> names =  driver.findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr/td[1]"));
            List<WebElement> prices = driver.findElements(By.xpath("//table[@class=\"dataTable\"]/tbody/tr/td[4]"));

            System.out.println(names.size()+ "____"+ prices.size());

            //printnames of all the companies along with their current prices
            for (int i =0; i< names.size(); i++){
                if(companyName.equals(names.get(i).getText())){
                System.out.println(names.get(i).getText()+ "_______"+ prices.get(i).getText());
            }}
        }
    }


