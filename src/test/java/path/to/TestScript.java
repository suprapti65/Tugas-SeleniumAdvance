package path.to;

import POM.FlightsPage;
import POM.HomePage;
import POM.SearchResultPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestScript {
    private WebDriver driver;
    private HomePage homePage;
    private FlightsPage flightsPage;
    private SearchResultPage searchResultsPage;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new FirefoxDriver();
        homePage = new HomePage(driver);
        flightsPage = new FlightsPage(driver);
        searchResultsPage = new SearchResultPage(driver);
    }

    @Test
    public void testFlightSearch() {
        homePage.openMakeMyTrip();
        homePage.goToFlights();

        flightsPage.selectOneWay();
        flightsPage.setFromCity("DepartureCity");
        flightsPage.setToCity("DestinationCity");
        flightsPage.clickSearchButton();

        String topPrice = searchResultsPage.getTopPrice();
        System.out.println("Top Price: " + topPrice);

        // Add assertions or validations as needed
        Assert.assertTrue(!topPrice.isEmpty(), "Top price is not empty");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
