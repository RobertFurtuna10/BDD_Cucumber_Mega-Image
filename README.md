# Mega Image - Java BDD Automation Testing with Cucumber

## Project Overview

This project utilizes **Selenium WebDriver** for automated testing of the Mega Image website, implementing **Cucumber** for behavior-driven development (BDD). It follows a **Page Object Model (POM)** design pattern to manage interactions with different pages efficiently. The tests cover a wide range of functionalities, including home page interactions, user registration, product search operations, and shopping cart management.

By leveraging BDD, this project enhances communication between technical and non-technical stakeholders, making test scenarios understandable for all parties involved.

## Project Dependencies and Requirements

### Dependencies

This project uses **Maven** for dependency management, and the following key dependencies are specified in the `pom.xml` file:

- **Cucumber Java**: `4.2.6`
  - For writing and running Cucumber tests in Java.
- **Cucumber JUnit**: `4.2.6`
  - For integrating Cucumber with JUnit for test execution.
- **JUnit**: `4.12`
  - For assertions and managing test cases.
- **Selenium WebDriver**: To interact with web elements on the Mega Image website.
- **WebDriverManager**: `5.9.1`
  - Automatically manages WebDriver binaries for different browsers.


### Project Requirements

To set up and run this project, ensure you have the following installed:

1. **Java Development Kit (JDK)**:
   - Java 1.8 or later.

2. **Maven**:
   - [Maven installation guide](https://maven.apache.org/install.html) for assistance.

3. **WebDriver Binaries**:
   - WebDriver binaries (e.g., ChromeDriver) will be automatically managed by **WebDriverManager**.

## Installation Instructions

Follow the steps below to set up and run the project:

1. **Install Java**:
   - Download and install the JDK from the [official Java website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) or use an open-source distribution like [AdoptOpenJDK](https://adoptium.net/).

2. **Install Maven**:
   - Download and install Maven from the [Apache Maven website](https://maven.apache.org/download.cgi).
   - Follow the installation instructions for your operating system.

3. **Clone the Repository**:
   - Open your terminal or command prompt and run:
     ```bash
     git clone https://github.com/RobertFurtuna10/BDD_Cucumber_Mega-Image.git
     ```

4. **Navigate to Project Directory**:
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

To execute the tests, you need to run the specific runner files depending on the test suite you want to execute. Here are the available runners:

1. **Home Page Tests**:
   - Navigate to `HomePageRunner` and run the test directly.

2. **User Registration Tests**:
   - Navigate to `RegisterRunner` and run the test directly.

3. **Regression Tests**:
   - Navigate to `RegressionTestsRunner` and run the test directly.

4. **Search Functionality Tests**:
   - Navigate to `SearchRunner` and run the test directly.

5. **Shopping Cart Tests**:
   - Navigate to `ShoppingCartRunner` and run the test directly.

To run a specific test suite, open the runner file in your IDE (e.g., `Visual Studio Code` or `IntelliJ IDEA`) and run the file using the integrated test runner. Each runner corresponds to a different suite of tests for various functionalities of the Mega Image website.


This will build the project, install the necessary dependencies, and execute the feature files with the specified WebDriver.

## Project Structure

### Pages

This folder contains the **Page Object Model (POM)** classes representing different pages of the Mega Image website.

- **BasePage.java**: Base class providing common methods and WebDriver initialization for all page objects.
- **HomePage.java**: Page object for the home page with methods for interacting with elements like the cookie banner and navigation buttons.
- **RegisterPage.java**: Contains methods for filling out registration forms and validating error messages.
- **SearchPage.java**: Handles search operations, including applying filters and validating search results.
- **ShoppingCartPage.java**: Manages actions related to the shopping cart, such as adding/removing items and validating contents.

### Steps

This folder contains step definition classes corresponding to the **Gherkin** steps defined in the feature files.

- **HomeSteps.java**: Step definitions for actions related to the home page.
- **RegisterSteps.java**: Step definitions for the registration process.
- **SearchSteps.java**: Step definitions for search functionalities.
- **ShoppingCartSteps.java**: Step definitions for shopping cart management.

### Driver

Contains the WebDriver manager class responsible for initializing and managing the WebDriver instance. **WebDriverManager** simplifies browser driver management by automatically downloading and configuring the necessary binaries.

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

## Step Definitions

Here are a few examples of step definitions used in the project:

### HomeSteps.java

- **@Given("I am a user on Mega Image home page")**: Opens the home page.
- **@Then("I validate cookie header and click accept cookie button")**: Validates and accepts cookies.
- **@When("I click on 'Contul meu' button")**: Clicks the 'Contul Meu' button to log in.

### RegisterSteps.java

- **@When("I fill email/phone input: (.*)$")**: Fills the email/phone input field.
- **@Then("I validate error message: (.*)$")**: Validates the error message for invalid input.

### SearchSteps.java

- **@When("I enter {string} in the search bar")**: Enters a search term in the search bar.
- **@Then("I validate I am redirected to the search results page for {string}")**: Validates the search results.

### ShoppingCartSteps.java

- **@Then("I validate shopping cart url is correct")**: Validates the shopping cart URL.
- **@When("I click on 'Remove product' button")**: Removes a product from the cart.

## Conclusion

The Mega Image Automation Testing project demonstrates a robust implementation of automated testing using **Selenium WebDriver** and **Cucumber BDD** with Java. The project structure is designed to cover essential functionalities of the Mega Image website, ensuring scalability and ease of maintenance.

### Key Achievements

- **Behavior-Driven Development (BDD)**: Leveraged Cucumber and Gherkin syntax to write understandable test scenarios for all stakeholders.
- **Page Object Model (POM)**: Implemented POM to streamline test development and enhance maintainability.
- **Comprehensive Test Coverage**: Covered crucial functionalities such as product search, user registration, and shopping cart management.
- **Automated Reporting**: Integrated reporting to visualize test results and streamline issue identification.

## Future Work

- **Test Enhancements**: Add more test cases for edge scenarios and additional functionalities.
- **Cross-Browser Testing**: Expand tests to support multiple browsers for greater compatibility.
- **Performance Testing**: Integrate performance testing tools to evaluate the site's responsiveness under varying loads.
- **Continuous Integration (CI/CD)**: Implement CI/CD pipelines to automate test execution and deployment processes.

## Test Reports

Screenshots and detailed test execution reports will be added to provide insights into the effectiveness of the test cases and to assist in identifying areas for improvement.

Thank you for reviewing the Mega Image Automation Testing project. For further queries, refer to the documentation and the provided test reports.





