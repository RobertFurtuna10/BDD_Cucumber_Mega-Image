package my_proj_bdd.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import my_proj_bdd.driver.DriverManager;
import my_proj_bdd.pages.SearchPage;

public class SearchSteps extends DriverManager {
    SearchPage searchPage = new SearchPage(driver);

    @When("I enter {string} in the search bar")
    public void i_enter_in_the_search_bar(String searchText) {
        searchPage.fillSearchInput(searchText);
    }

    @When("I press Enter in the search bar")
    public void i_press_enter_in_the_search_bar() {
        searchPage.pressEnterInSearchBar();
    }

    @Then("I validate I am redirected to the search results page for {string}")
    public void i_validate_i_am_redirected_to_search_results_page(String searchTerm) {
        searchPage.validateURLContainsSearchTerm(searchTerm);
        searchPage.validateSearchResultsAreVisible();
    }

    @Then("I validate no results are displayed")
    public void i_validate_the_search_results_page_displays_zero_results() {
        searchPage.validateNoResults();
    }

    @When("I select the first auto-suggestion from the list")
    public void i_select_first_elem_from_droptown(){
        searchPage.clickFirstElemFromDroptown();
    }

    @Then("I validate I am redirected to the product details page for the selected suggestion")
    public void i_validate_product_page(){
        searchPage.validateSearchResultsAreVisible();
    }
}












