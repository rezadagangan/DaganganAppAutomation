@Login
Feature: Login

  @InvalidLogin
  Scenario Outline: User unable login with invalid phone number
    Given User navigate to input phone number page
    When User insert invalid <phone> number
    And User select missedcall option
    And User click Daftar or Login button
    Then Warning message invalid phone number appear

    Examples: 
      | phone           |
      | nama            |
      |             123 |
      |           08583 |
      | 085-879-214-397 |
      | 085hgkdk        |
