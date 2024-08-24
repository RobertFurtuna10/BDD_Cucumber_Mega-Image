package my_proj_bdd.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import my_proj_bdd.driver.DriverManager;
import my_proj_bdd.pages.RegisterPage;

public class RegisterSteps extends DriverManager {
    RegisterPage registerPage = new RegisterPage(driver);

    @When("I click on 'Continua' button")
    public void clickContinue() {
        registerPage.clickContinueButton();
    }

    @Then("I validate error message: (.*)$")
    public void validateMsg(String expectedMsg) {
        registerPage.validateErrorMessage(expectedMsg);
    }

    @When("I fill email/phone input: (.*)$")
    public void fillEmailPhone(String phoneEmail) {
        registerPage.fillEmailPhoneInput(phoneEmail);
    }

    @When("I fill password input: (.*)$")
    public void fillPassword(String passw) {
        registerPage.fillPasswordInput(passw);
    }

    @When("I click on 'Creeaza un cont nou' pop up button")
    public void clickRegister() {
        registerPage.clickCreeazaCont();
    }

    @When("I validate register header is displayed")
    public void headerTitle() {
        registerPage.validateRegisterHeader();
    }

    @When("I click on 'Creeaza un cont nou' button")
    public void clickCreeazaContNou() {
        registerPage.clickCreeazaunContNou();
        registerPage.clickCreeazaunContNou();
    }

    @Then("I validate error messages for password and terms checkbox")
    public void validateErrorMessages() {
        registerPage.validatePasswordErrorMessage("Te rugam sa introduci o parola");
        registerPage.validateTermsBoxErrorMessage("Te rugam sa accepti termenii si conditiile");
    }

    @Then("I validate password conditions error message: (.*)$")
    public void validatePasswordConditionsErrorMsg(String expectedMsg) {
        registerPage.validatePasswConditionsErrorMessage(expectedMsg);
    }

}
