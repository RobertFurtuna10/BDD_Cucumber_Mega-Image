# Mega Image - Java BDD Automation Testing with Cucumber

## Project Overview
This project uses Selenium WebDriver for automated testing of the Mega Image website. It employs Cucumber for behavior-driven development (BDD) and follows a Page Object Model (POM) design pattern. The tests cover various functionalities, including home page interactions, user registration, search operations, and shopping cart management.

## Project Structure

### Pages
Contains the Page Object Model classes representing different pages of the Mega Image website.

- **BasePage.java**: Base class for all page objects providing common methods and WebDriver initialization.
- **HomePage.java**: Page object for the home page with methods for interacting with page elements and performing actions.
- **RegisterPage.java**: Page object for the registration page with methods for filling out registration forms and validating error messages.
- **SearchPage.java**: Page object for the search page with methods for performing searches and validating results.
- **ShoppingCartPage.java**: Page object for the shopping cart page with methods for managing cart items and validating cart content.

### Steps
Contains step definition classes corresponding to the Gherkin steps defined in the feature files.

- **HomeSteps.java**: Step definitions for actions and validations related to the home page.
- **RegisterSteps.java**: Step definitions for user registration actions and validations.
- **SearchSteps.java**: Step definitions for search operations and result validations.
- **ShoppingCartSteps.java**: Step definitions for shopping cart actions and validations.

### Driver
Contains the WebDriver manager for initializing and managing the WebDriver instance.

## Features

### Home Page
- Accept cookies
- Navigate to different sections
- Add products to the basket
- Interact with pop-ups

### Register Page
- Handle registration errors
- Validate registration fields and messages

### Search Page
- Perform searches
- Apply filters
- Validate search results

### Shopping Cart Page
- Manage products in the cart
- Validate cart contents and empty state
# Steps

## HomeSteps.java
- **@Given("I am a user on Mega Image home page")**: Opens the home page.
- **@Then("I validate cookie header and click accept cookie button")**: Validates and accepts cookies.
- **@When("I click on 'Contul meu' button")**: Clicks the 'Contul Meu' button.
- **@When("I click on basket picture button with index: (.*)$")**: Adds a product to the basket by index.
- **@When("I click on 'Alege mai tarziu' button")**: Clicks 'Alege Mai Tarziu'.
- **@When("I click on x button in 'Completeaza-ti cosul cu aceste produse' pop-up")**: Closes the basket pop-up.
- **@When("I click 'Shopping Cart' button")**: Clicks the shopping cart button.

## RegisterSteps.java
- **@When("I click twice on 'Continua' button")**: Clicks the continue button twice.
- **@When("I click three times on 'Continua' button")**: Clicks the continue button three times.
- **@When("I click on 'Continua' button")**: Clicks the continue button once.
- **@Then("I validate error message: (.*)$")**: Validates error messages.
- **@When("I fill email/phone input: (.*)$")**: Fills email/phone input.
- **@When("I fill password input: (.*)$")**: Fills password input.
- **@When("I click on 'Creeaza un cont nou' pop up button")**: Clicks the create account button.
- **@When("I validate register header is displayed")**: Validates the registration header.
- **@When("I click on 'Creeaza un cont nou' button")**: Clicks 'Creeaza un cont nou'.
- **@Then("I validate error messages for password and terms checkbox")**: Validates error messages for password and terms checkbox.
- **@Then("I validate password conditions error message: (.*)$")**: Validates password conditions error message.

## SearchSteps.java
- **@When("I enter {string} in the search bar")**: Enters text in the search bar.
- **@When("I press Enter in the search bar")**: Presses Enter in the search bar.
- **@Then("I validate I am redirected to the search results page for {string}")**: Validates the search results page URL.
- **@Then("I validate no results are displayed")**: Validates no results message.
- **@When("I select the first auto-suggestion from the list")**: Selects the first auto-suggestion.
- **@Then("I validate I am redirected to the product details page for the selected suggestion")**: Validates redirection to the product details page.
- **@Then("I apply the filter 'branduri proprii'")**: Applies the 'branduri proprii' filter.
- **@Then("I validate the search results page displays only 'Gusturi romanesti' brand products")**: Validates the presence of 'Gusturi romanesti' brand products.
- **@Then("I validate the search results page displays products related to 'ciocolata' regardless of case")**: Validates products related to 'ciocolata'.
- **@When("I press Enter in the search bar without entering any text")**: Presses Enter without text in the search bar.

## ShoppingCartSteps.java
- **@When("I click on 'Remove product' button")**: Clicks the remove product button.
- **@Then("I validate empty basket message is displayed")**: Validates the empty basket message.
- **@Then("I validate shopping cart url is correct")**: Validates the shopping cart URL.
- **@Then("I validate the product is added to the cart")**: Validates that the product is added to the cart.
- **@Then("I validate all products are in the cart")**: Validates all products are in the cart.
- **@Then("I click twice on increase quantity button")**: Clicks the increase quantity button twice.
- **@Then("I validate the product quantity is {int}")**: Validates the product quantity.
- **@When("I click 'Goleste cosul' button")**: Clicks the 'Goleste cosul' button.
- **@When("I click on confirm empty basket button")**: Clicks the confirm empty basket button.

# Project Dependencies and Requirements

## Dependencies

This project uses Maven for dependency management. The following dependencies and their versions are specified in the `pom.xml` file:

- **Cucumber Java**: `4.2.6`
  - For writing and running Cucumber tests in Java.
- **Cucumber JUnit**: `4.2.6`
  - For integrating Cucumber with JUnit.
- **JUnit**: `4.12`
  - For assertions and test framework.
- **Appium Java Client**: `4.1.2`
  - For mobile application testing (if applicable).
- **WebDriverManager**: `5.9.1`
  - For managing WebDriver binaries.

## Project Requirements

To set up and run this project, ensure you have the following installed:

1. **Java Development Kit (JDK)**:
   - Java 1.8 or later.

2. **Maven**:
   - Follow the [Maven installation guide](https://maven.apache.org/install.html) if Maven is not installed.

3. **WebDriver Binaries**:
   - Ensure you have the necessary WebDriver binaries for your browser (e.g., ChromeDriver for Chrome). These will be managed automatically by WebDriverManager.

## Installation Instructions

1. **Install Java**:
   - Download and install the JDK from the [official Java website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) or use an open-source distribution like [AdoptOpenJDK](https://adoptium.net/).

2. **Install Maven**:
   - Download and install Maven from the [Apache Maven website](https://maven.apache.org/download.cgi).
   - Follow the installation instructions for your operating system.

3. **Clone the Repository**:
   - Clone the repository containing the project files:
     ```bash
     git clone <repository-url>
     ```

4. **Navigate to Project Directory**:
   - Open Terminal or Command Prompt.
   - Change to the directory where your `pom.xml` file is located:
     ```bash
     cd path/to/project-directory
     ```

5. **Install Dependencies**:
   - Run Maven to download and install the required dependencies:
     ```bash
     mvn install
     ```

6. **Run Tests**:
   - Execute the tests using Maven:
     ```bash
     mvn test
     ```

This will build the project, install the necessary dependencies, and run the feature files using the specified WebDriver.


