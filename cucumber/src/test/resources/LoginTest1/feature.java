Feature: Login Functionality

  Scenario: Valid Login

    Given User opens browser
    When User enters valid username
    And User enters valid password
    Then User should login successfully