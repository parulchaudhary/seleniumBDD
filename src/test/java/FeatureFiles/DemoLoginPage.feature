
      int zeroIndex = 0;Feature: Login Page of Website

Background:
    User navigates to the application
    
    
Scenario: Verify user should able to see Login button
    Then: user should see login button on the home page
    
Scenario: Verify Login With Valid Data
When user clicks on the login icon
When user enters the email "abcd.efgh@gmail.com" and password "1234@test"
And  user clicks on the login button
And user should be logged in successfully

 
Scenario: Verify Login With InValid Data
When user clicks on the login icon
When user enters the email "abcd.efgh@gmail.com" and password "ttest@123"
When user clicks on the login button
Then User should see the error message "Login was unsuccessful. Please correct the errors and try again.No customer account found"

 
Scenario: Verify Forget Link Validation
When user clicks on the login icon
When user clicks on forgot password link

 
Scenario: Verify Remember me Link
When user clicks on the login icon
When user enters the email "abcd.efgh@gmail.com" and password "test@123" 
And user checks the remember me checkbox
When user clicks on the login button
