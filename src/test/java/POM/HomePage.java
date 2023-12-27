package POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to open MakeMyTrip website
    public void openMakeMyTrip() {
        driver.get("https://www.makemytrip.com/");
    }

    // Method to navigate to Flights page
    public void goToFlights() {
        driver.findElement(By.xpath("//li[@class='menu_Flights']//a[contains(.,'Flights')]")).click();
    }
}
