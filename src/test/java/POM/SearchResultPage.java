package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class SearchResultPage {
    public WebDriver driver;

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTopPrice(){
        return driver.findElement(By.xpath("//div[@class='clusterContent']//div[@class='priceSection priceLockPersuasionExists']//div[@class='textRight flexOne']/div[.='₹ 6,887per adult']")).getText();

    }
}
