Feature: HomePage of Website

    Background:
    Given: User navigates to the application
    
    Scenario: Verify Home Page Menu Validation
    And the logo of website should be displayed
    
    Scenario: Verify Home Page Search icon Validation
    And the search box should be present
    When user enter in the search box "laptop"
    And user click the search icon
    
    Scenario: Verify Home Page Logo Validation
    Then user can see the demo logo
    
    Scenario: User should be able to verify Home Page Header Validation
     Then user should see the home page header