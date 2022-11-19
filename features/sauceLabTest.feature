Feature: Saucelab login scenarios

  @P1
  Scenario Template: :  Saucelab login with multiple users
    Given Open the saucelab page
    When user enters the  username as "<username>"
    And user enters the password as "<password>"
    And  click on login button
    Then user able to login and verify the home page
    And select a product from given list
    And user add product to the cart
    And user click on cart icon
    And user click on checkout button
    And user enter firstname lastname and zipcode
    And click on continue button
    And user click on finish and check order complete

    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |


