package my_proj_bdd.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import my_proj_bdd.driver.DriverManager;
import my_proj_bdd.pages.HomePage;

public class HomeSteps extends DriverManager{
    HomePage homePage = new HomePage(driver);

    @Given("I am a user on Mega Image home page")
    public void openHomePage() {
        homePage.openHomePage();
    }

    @Then("I validate cookie header and click accept cookie button")
    public void acceptCookies() {
        homePage.validateCookieHeader();
        homePage.clickAcceptCookiesButton();
    }

    @When("I click on 'Contul meu' button")
    public void clickContulMeu() {
        homePage.clickContulMeuButton();
    }

    @When("I click on basket picture button with index: (.*)$")
    public void clickAdauga(String index) {
        homePage.clickAddToBasketButtonByIndex(index);
        
    }

    @When("I click on 'Alege mai tarziu' button")
    public void clickAlegeMaiTarziuBtn() {
        homePage.clickAlegeMaiTarziuButton();
    }

    @When("I click on x button in 'Completeaza-ti cosul cu aceste produse' pop-up")
    public void clickCompleteBasketXBtn() {
        homePage.clickCompleteBasketXButton();
    }

    @When("I click 'Shopping Cart' button")
    public void clickShoppingCart() {
        homePage.clickShoppingCartButton();
    }
}