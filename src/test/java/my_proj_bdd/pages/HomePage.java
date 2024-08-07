package my_proj_bdd.pages;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.NoSuchElementException;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    // Elements
    @FindBy(css = "[data-testid='cookie-popup-accept']")
    private WebElement cookieAcceptButton;

    @FindBy(css = "[data-testid='cookie-popup-title']")
    private WebElement cookieHeader;

    @FindBy(css = "[data-testid='header-myhub-toggle']")
    private WebElement contulMeuButton;

    @FindBy(css = "[data-testid='product-block-add']")
    private List<WebElement> addToBasketButtonAsList;

    @FindBy(css = "[data-testid='header-minibasket']")
    private WebElement shoppingCartButton;

    @FindBy(css = ".sc-dyjemn-11")
    private WebElement alegeMaiTarziuButton;

    @FindBy(css = ".sc-xnh8i-16")
    private WebElement completeBasketXButton;



    // Actions
    public void clickAcceptCookiesButton() {
        cookieAcceptButton.click();
    }

    public void openHomePage() {
        driver.get("https://www.mega-image.ro/");
    }

    public void clickContulMeuButton() {
        contulMeuButton.click();
    }

    public void clickShoppingCartButton() {
        shoppingCartButton.click();
    }


    public void clickAddToBasketButtonByIndex(String index) {
        // transformam index din string in int
        int index_as_int = Integer.valueOf(index);
        //gasim elementul
        WebElement elem = addToBasketButtonAsList.get(index_as_int);
        // mai facem un scroll mic in jos
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0,700)", "");
        // dam click pe button
        executor.executeScript("arguments[0].click();", elem);
        // asteptam o secunda sa se adauge produsul in cod
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    

    public void clickAlegeMaiTarziuButton() {
        try {
            // incearca sa dai click daca gasesti element
            alegeMaiTarziuButton.click();
        } catch (NoSuchElementException e) {
            // testul trece mai departe si daca nu am gasit acel element
        }
    }

    public void clickCompleteBasketXButton() {
        try {
            // incearca sa dai click daca gasesti element
            completeBasketXButton.click();
        } catch (NoSuchElementException e) {
            // testul trece mai departe si daca nu am gasit acel element
        }
    }

    // Validations
    public void validateCookieHeader() {
        Assert.assertEquals("Cookie Header title is incorrect", "Cookie-uri pe mega-image.ro", cookieHeader.getText());
    }
}
