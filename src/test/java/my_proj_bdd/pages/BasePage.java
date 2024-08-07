package my_proj_bdd.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void validatePageURL(String expectedURL) {
        Assert.assertTrue("Url is not correct", driver.getCurrentUrl().contains(expectedURL));
    }
}
