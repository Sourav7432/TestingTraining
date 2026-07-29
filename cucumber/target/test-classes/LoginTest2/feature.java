Feature: Login Functionality

  Scenario: Invalid Password

    Given User opens browser
    When User enters valid username
    And User enters invalid password
    Then Error message should be displayed