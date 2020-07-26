@tag
Feature: Title of your feature
  I want to use this template for my feature file to validate login

  @tag1
  Scenario Outline: Title of your scenario
    Given launch fb
    When user enters credentials "<username>" "<password>"
    And hits login button
    Then goes to home page

    Examples: 
      | username                 | password    |
      | shalomdaniel13@gmail.com | jehovajireh |
      | joel@gmail.com           |     1231131 |
