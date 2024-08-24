Feature: Shopping cart feature

  Background:
    Given I am a user on Mega Image home page
    Then I validate cookie header and click accept cookie button

   Scenario: I can delet a product from shopping cart
     When I click on basket picture button with index: 0
     When I click on 'Alege mai tarziu' button
     # When I click on x button in 'Completeaza-ti cosul cu aceste produse' pop-up
     When I click 'Shopping Cart' button
     Then I validate shopping cart url is correct
     When I click on 'Remove product' button
     Then I validate empty basket message is displayed

   Scenario: I can add a single product to the shopping cart
     When I click on basket picture button with index: 3
     When I click on 'Alege mai tarziu' button
     When I click 'Shopping Cart' button
     Then I validate the product is added to the cart

   Scenario: I can add multiple products to the shopping cart
     When I click on basket picture button with index: 1
     When I click on basket picture button with index: 0
     When I click on 'Alege mai tarziu' button
     When I click 'Shopping Cart' button
     Then I validate all products are in the cart

   Scenario: I can empty the basket from the shopping cart
     When I click on basket picture button with index: 5
     When I click on basket picture button with index: 8
     When I click on 'Alege mai tarziu' button
     When I click 'Shopping Cart' button
     When I click 'Goleste cosul' button
     When I click on confirm empty basket button
     Then I validate empty basket message is displayed


  Scenario: I can increase the quantity of a product in the shopping cart
    When I click on basket picture button with index: 2
    When I click on 'Alege mai tarziu' button
    When I click on x button in 'Completeaza-ti cosul cu aceste produse' pop-up
    When I click 'Shopping Cart' button
    When I click twice on increase quantity button
    Then I validate the product quantity is 3
    
