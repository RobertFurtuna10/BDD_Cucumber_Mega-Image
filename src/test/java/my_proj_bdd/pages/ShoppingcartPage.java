package my_proj_bdd.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Optional;

public class ShoppingcartPage extends BasePage{
    public ShoppingcartPage(WebDriver driver) {
        super(driver);
    }

    // Elements
    @FindBy(css = "[data-testid='basket-icon-to-remove-product']")
    private WebElement deleteProductBtn;

    @FindBy(xpath = "//div[@data-testid='text-container']/p/following-sibling::p")
    private WebElement emptyBasketMsg;

    @FindBy(css = "[data-testid='products-block']")
    private WebElement productContainer;

    @FindBy(css = "[data-testid='product-block-quantity-increase']")
    private WebElement qtyBtn;

    @FindBy (css = "[data-testid='product-block-quantity-input']")
    private WebElement productQty;

    @FindBy (css = "[data-testid='checkout-empty-basket']")
    private WebElement emptyBasketBtn;

    @FindBy (css = "[data-testid='checkout-empty-basket-modal-confirm']")
    private WebElement confirmEmptyBasketBtn;


    // Actions
    public void clickDeleteProductButton() {
        deleteProductBtn.click();
    }

    public void clickIncreaseQtyButton() {
        qtyBtn.click();
        qtyBtn.click();
    }

    public void clickEmptyBasketButton() {
        emptyBasketBtn.click();
    }

    public void clickConfirmEmptyBasketButton() {
        confirmEmptyBasketBtn.click();
    }



    // Validations
    public void validateEmptyBasketMsg() {
        Assert.assertEquals("Empty Basket Msg is incorrect", "Cosul tau este gol", emptyBasketMsg.getText());
    }

    public void validateProductInCart() {
        // Assert that the product container is visible or contains the product
        Assert.assertTrue("Product not found in the cart", productContainer.isDisplayed());
    }

    public void validateProductQuantity(Integer expectedQty) {
        String quantityValue = productQty.getAttribute("value");
        int actualQty = Integer.parseInt(quantityValue);
        Assert.assertEquals("Product quantity is incorrect", expectedQty, Integer.valueOf(actualQty));
    }


}
