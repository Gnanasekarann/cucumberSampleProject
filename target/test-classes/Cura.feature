Feature: Validate the login functionality of CURA website

  Scenario Outline: Validate the login of CURA with valid and invalid credentials
    Given User should launch the chrome browser
    When User should enter into the cura website
    And user should enter "<username>" and "<password>" and enter
    And User should enter into appointment page

    Examples: 
      | username    | password |
      | sekargnanas | admin    |
      | admin       | admin    |
