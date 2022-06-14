Feature: Retail Page feature

  Background: 
    Given User is on Retail website
    And User click  on MyAccount
    When User click on Login
    And User enter username "jawid123@gmail.com" and  "123456789"
    And User click on Login button
    Then User should be logged in to MyAccount dashboard

  
  Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on Register for an Affiliate Account link
    And User fill affiliate form with below information
      | company   | website      | taxID  | paymentMethod | payeeName |
      | tekschool | tekschool.us | 123456 | Cheque        | test      |
    And User check on About us check box
    And User click on Continue button
    Then User should see a success message

  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click on Edit your affiliate informationlink
    And user click on Bank Transfer radio button
    And User fill Bank information with below information
      | bankName | abaNumber | swiftCode | accountName | accountNumber |
      | BOA      | 123456789 |    258963 | TEK         |     147852369 |
    And User click on Continue button
    Then User should see a success message
@test
  Scenario: Edit your account Information
    When User click on Edit your account information link
    And User modify below information
      | firstname | lastname | email            | telephone  |
      | mike      | lisa     | serena@gmail.com | 5713374355 |
    And User click on Continue button
    Then User should see a message 'Success: Your account has been successfully updated'
