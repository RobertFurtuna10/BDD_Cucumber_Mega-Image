Feature: Register feature

  Background:
    Given I am a user on Mega Image home page
    Then I validate cookie header and click accept cookie button
    When I click on 'Contul meu' button

  Scenario: Negative: Missing phone/email
    When I click on 'Continua' button
    Then I validate error message: Te rugam sa introduci adresa de e-mail sau numarul de telefon


  Scenario Outline: Negative: Invalid phone/email
    When I fill email/phone input: <email_phone>
    When I click on 'Continua' button
    Then I validate error message: Te rugam sa introduci un format valid
    Examples:
      | email_phone |
      | 123         |
      | abcd@       |

  Scenario Outline: Positive: Valid phone/email
    When I fill email/phone input: <email_phone>
    When I click on 'Continua' button
#    When I click twice on 'Continua' button
#    When I click three times on 'Continua' button
    When I click on 'Creeaza un cont nou' pop up button
    Then I validate register header is displayed

    Examples:
    | email_phone    |
    | email1234@email.com |

  Scenario: Register with password and terms checkbox left empty
    When I fill email/phone input: email1234@email.com
    When I click on 'Continua' button
    When I click on 'Creeaza un cont nou' pop up button
    When I click on 'Creeaza un cont nou' button
    Then I validate error messages for password and terms checkbox

  Scenario: Register with wrong password
    When I fill email/phone input: email1234@email.com
    When I click on 'Continua' button
#    When I click twice on 'Continua' button
    When I click on 'Creeaza un cont nou' pop up button
    When I fill password input: passw123
    When I click on 'Creeaza un cont nou' button
    Then I validate password conditions error message: Te rugam sa introduci o parola care indeplineste conditiile