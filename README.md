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

# Set up the Environment
# Installing Java and Maven

## Installing Java

### On Windows

1. **Download the JDK:**
   - Go to the [AdoptOpenJDK](https://adoptium.net/).
   - Download the installer for Windows.

2. **Install the JDK:**
   - Run the downloaded installer and follow the installation instructions.
   - During installation, take note of the installation directory (e.g., `C:\Program Files\Java\jdk-<version>`).

3. **Set Up Environment Variables:**
   - Open the Start Menu, search for "Environment Variables", and select "Edit the system environment variables".
   - Click on "Environment Variables".
   - In the "System variables" section, click "New" and add the following variables:
     - `JAVA_HOME` with the path to your JDK installation (e.g., `C:\Program Files\Java\jdk-<version>`).
     - Update the `Path` variable and add `%JAVA_HOME%\bin`.

4. **Verify Installation:**
   - Open Command Prompt and type:
     ```bash
     java -version
     ```
     and
     ```bash
     javac -version
     ```

### On macOS

1. **Install via Homebrew:**
   - Open Terminal and install Homebrew if you haven’t already by running:
     ```bash
     /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
     ```
   - Install Java using Homebrew:
     ```bash
     brew install openjdk
     ```

2. **Set Up Environment Variables:**
   - Add the following to your `.zshrc` or `.bash_profile` file:
     ```bash
     export JAVA_HOME=$(/usr/libexec/java_home)
     export PATH=$JAVA_HOME/bin:$PATH
     ```

3. **Verify Installation:**
   - In Terminal, type:
     ```bash
     java -version
     ```
     and
     ```bash
     javac -version
     ```

### On Linux

1. **Install via Package Manager:**
   - For Ubuntu/Debian-based systems:
     ```bash
     sudo apt update
     sudo apt install openjdk-11-jdk
     ```

   - For Red Hat/Fedora-based systems:
     ```bash
     sudo dnf install java-11-openjdk-devel
     ```

2. **Verify Installation:**
   - In Terminal, type:
     ```bash
     java -version
     ```
     and
     ```bash
     javac -version
     ```

## Installing Maven

### On Windows, macOS, and Linux

1. **Download Maven:**
   - Go to the [Apache Maven Downloads page](https://maven.apache.org/download.cgi).
   - Download the binary zip archive (e.g., `apache-maven-<version>-bin.zip`) for Windows or the tar.gz archive for macOS/Linux.

2. **Install Maven:**
   - **Windows:**
     - Extract the zip file to a directory (e.g., `C:\Program Files\Apache\maven`).
     - Add a `MAVEN_HOME` environment variable with the path to the Maven directory.
     - Update the `Path` variable to include `%MAVEN_HOME%\bin`.

   - **macOS/Linux:**
     - Extract the tar.gz file:
       ```bash
       tar xzvf apache-maven-<version>-bin.tar.gz
       ```
     - Move the extracted directory to `/usr/local/apache-maven`:
       ```bash
       sudo mv apache-maven-<version> /usr/local/apache-maven
       ```
     - Add Maven to your `PATH`:
       ```bash
       export M2_HOME=/usr/local/apache-maven/apache-maven-<version>
       export PATH=$M2_HOME/bin:$PATH
       ```

3. **Verify Installation:**
   - In Terminal or Command Prompt, type:
     ```bash
     mvn -version
     ```

This should display the installed Maven version along with Java details.


