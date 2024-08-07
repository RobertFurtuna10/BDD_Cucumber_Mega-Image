package my_proj_bdd.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import my_proj_bdd.driver.DriverManager;
import my_proj_bdd.pages.ShoppingcartPage;

public class ShoppingCartSteps extends DriverManager {
    ShoppingcartPage shoppingcartPage = new ShoppingcartPage(driver);
    @When("I click on 'Remove product' button")
    public void clickRemoveProduc() {
        shoppingcartPage.clickDeleteProductButton();
    }


    @Then("I validate empty basket message is displayed")
    public void validateEmptyBasket() {
        shoppingcartPage.validateEmptyBasketMsg();
    }

    @Then("I validate shopping cart url is correct")
    public void validateUrl() {
        shoppingcartPage.validatePageURL("/checkout");
    }

    @Then("I validate the product is added to the cart")
    public void validateProductAddedToCart() {
        shoppingcartPage.validateProductInCart();
    }

    @Then("I validate all products are in the cart")
    public void validateProductsAddedToCart() {
        shoppingcartPage.validateProductInCart();
    }

    @Then("I click twice on increase quantity button")
    public void clickQtyBtn() {
        shoppingcartPage.clickIncreaseQtyButton();
    }

    @Then("I validate the product quantity is {int}")
    public void validateProductQuantity(int expectedQty) {
        shoppingcartPage.validateProductQuantity(expectedQty);
    }

    @When("I click 'Goleste cosul' button")
    public void clickGolesteCosul() {shoppingcartPage.clickEmptyBasketButton();}

    @When("I click on confirm empty basket button")
    public void clickConfirmEliminaProdusele(){shoppingcartPage.clickConfirmEmptyBasketButton();}




}
