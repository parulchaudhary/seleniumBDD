Feature: Registration
   

  Scenario Outline: User should be able to do a successful registration
    Given User navigates to the application
    And user clicks on register link
    When user enters the details "<firstname>", "<lastname>", "<email>", "<password>", "<confirmPassword>",
    And user clicks on register button
    Then user should be able to see message "Your registration completed" 

    Examples: 
      | firstname | lastname | email                | password    | confirmPassword |
      | abcd      | efgh     | abcd.efgh@gmail.com   | 1234@test   | 1234@test       |
      | donna     | paul     | donna1@gmail.com      | pass@123    | pass@123        |
