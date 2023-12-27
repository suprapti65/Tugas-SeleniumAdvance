package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightsPage {
    private WebDriver driver;

    // Constructor
    public FlightsPage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to select one-way trip
    public void selectOneWay() {
        driver.findElement(By.xpath("//li[.='One Way']")).click();
    }

    // Method to set the departure city
    public void setFromCity(String fromCity) {
        driver.findElement(By.cssSelector(".searchCity")).sendKeys(fromCity);
        // Add wait or other steps if needed
    }

    // Method to set the destination city
    public void setToCity(String toCity) {
        driver.findElement(By.cssSelector(".searchToCity")).sendKeys(toCity);
        // Add wait or other steps if needed
    }

    // Method to click the search button
    public void clickSearchButton() {
        driver.findElement(By.cssSelector(".primaryBtn")).click();
        // Add wait or other steps if needed
    }
}
