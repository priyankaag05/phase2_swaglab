Feature: Login saucedemo scenario

  #Background:
  #  Given I have launched the application
  # And I click on the Login link
  @sanity
  Scenario: This senario is to define the login page with positive test
    Given I have launched the application
    When I enter the correct username and password
    And I clicked on Login Button
    Then I should land on home page

  @sanity
  Scenario: This senario is to define the failure
    Given I have launched the application
    When I enter the incorrect username as "standard_user" and password as "Abc@1234"
    And I clicked on Login Button
    Then I should get the error message "Epic sadface: Username and password do not match any user in this service"

  @regression
  Scenario Outline: This scenario is to test different usernames and password combination
    Given I have launched the application
    When I enter the correct username as "<Username>" and password as  "<password>"
    Then I should land on home page

    Examples: 
      | Username        | password     |
      | problem_user    | secret_sauce |
      | locked_out_user | secret_sauce |
