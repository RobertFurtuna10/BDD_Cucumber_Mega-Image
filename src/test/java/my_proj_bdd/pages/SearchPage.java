package my_proj_bdd.pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SearchPage extends BasePage {

    private WebDriverWait wait;

    public SearchPage(WebDriver driver) {
        super(driver);
        this.wait = new WebDriverWait(driver, 10);
    }

    // Elements
    @FindBy(css = "[aria-autocomplete='list']")
    private WebElement searchInput;

    @FindBy(xpath = "//a[contains(text(), 'Lapte')]")
    private WebElement searchResults;

    @FindBy(css = "[data-testid='total-products-desktop-info']")
    private WebElement noResults;

    @FindBy(css = ".sc-jtuh2d-8 div")
    private WebElement selectFirstElemFromDroptown;

    @FindBy(css = "[title='Branduri proprii']")
    private WebElement filterBrand;

    @FindBy(css = "[data-testid='product-block-name-link']")
    private List<WebElement> productNameElements;

    // Actions
    public void fillSearchInput(String search) {
        // Așteaptă ca elementul să fie vizibil și interactiv
        wait.until(ExpectedConditions.elementToBeClickable(searchInput));
        searchInput.clear();
        searchInput.sendKeys(search);
    }

    public void pressEnterInSearchBar() {
        searchInput.sendKeys(Keys.ENTER);
    }

    public void clickFirstElemFromDroptown() {
        selectFirstElemFromDroptown.click();
    }

    public void clickFilterBrand() {
        filterBrand.click();
    }

    // Validations
    public void validateSearchResultsAreVisible() {
        wait.until(ExpectedConditions.visibilityOf(searchResults));
        Assert.assertTrue("Search results are not visible.", noResults.isDisplayed());
    }

    public void validateURLContainsSearchTerm(String searchTerm) {
        // Wait until the URL contains the search term or a timeout occurs
        WebDriverWait wait = new WebDriverWait(driver, 10); // waits up to 10 seconds
        wait.until(ExpectedConditions.urlContains(searchTerm));

        String currentURL = driver.getCurrentUrl();
        Assert.assertTrue("Expected URL to contain the word '" + searchTerm + "', but got: " + currentURL,
                currentURL.contains(searchTerm));
    }

    public void validateNoResults() {
        // Check for "No results found" message
        Assert.assertTrue("No results message is not visible.", noResults.isDisplayed());
    }

    public void validateAllProductsAreGusturiRomanestiBrand() {
        wait.until(ExpectedConditions.visibilityOfAllElements(productNameElements));

        for (WebElement productNameElement : productNameElements) {
            String productNameText = productNameElement.getText().trim();

            // Check if the product name starts with "Gusturi Românești"
            Assert.assertTrue("Expected product name to start with 'Gusturi Românești', but was: " + productNameText,
                    productNameText.toLowerCase().startsWith("gusturi romanesti"));
        }
    }
}