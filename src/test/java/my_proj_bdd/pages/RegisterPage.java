package my_proj_bdd.pages;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    // Elements
    @FindBy(css = "[data-testid='submit-button']")
    private WebElement continueButton;

    @FindBy(css = "[data-testid='form-error-message']")
    private WebElement validationErrorMsg;

    @FindBy(css = "#emailOrPhoneNumber")
    private WebElement emailPhoneInput;

    @FindBy(css = "#new-password")
    private WebElement passwordInput;

    @FindBy(css = "[data-testid='welcome-confirmation-modal-create-an-account-button']")
    private WebElement registerButton;

    @FindBy(css = "[data-testid='create-account-title']")
    private WebElement registerHeader;

    @FindBy(css = "[data-testid='create-account-form-submit-button']")
    private WebElement newAccountButton;

    @FindBy(css = "[data-testid='password-error-message']")
    private WebElement passwordErrorMsg;

    @FindBy(css = "[data-testid='checkbox__error-message']")
    private WebElement termsBoxErrorMsg;


    // Actions
    public void clickContinueButton() {
        continueButton.click();
    }

    public void fillEmailPhoneInput(String emailPhone) {
        emailPhoneInput.sendKeys(emailPhone);
    }

    public void fillPasswordInput(String paswword) {
        passwordInput.sendKeys(paswword);
    }

    public void clickCreeazaCont() {
        registerButton.click();
    }

    public void clickCreeazaunContNou() {
        // Scroll into view and click using JavaScript Executor
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", newAccountButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", newAccountButton);
    }


    // Validations
    public void validateErrorMessage(String expectedMsg) {
        Assert.assertEquals("Validation msg is wrong", expectedMsg, validationErrorMsg.getText());
    }

    public void validateRegisterHeader() {
        Assert.assertEquals("Register header is wrong", "Creeaza un cont nou", registerHeader.getText());
    }

    public void validatePasswordErrorMessage(String expectedMsg) {
        Assert.assertEquals("Password error message is wrong", expectedMsg, passwordErrorMsg.getText());
    }

    public void validateTermsBoxErrorMessage(String expectedMsg) {
        Assert.assertEquals("Terms box error message is wrong", expectedMsg, termsBoxErrorMsg.getText());
    }

    public void validatePasswConditionsErrorMessage(String expectedMsg) {
        Assert.assertEquals("Password conditions error message is wrong", expectedMsg, passwordErrorMsg.getText());
    }
}
