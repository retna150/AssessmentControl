@Smoke
  Feature: User - group code

    Scenario: User - group code - Alphanumeric and Special char
      Given I navigate to "registration" page
      And I type first name "test"
      And I type last name "test"
      And I type email "name@name.com"
      And I type group code "abc123#$"
      And I type password "12345"
      And I type confirm password "12345"
      Then I click Register me button.
      Then "You have been Registered." message appears

    Scenario Outline: User - group code - Field is required
      Given I navigate to "registration" page
      And I type first name "<FirstName>"
      And I type last name "<LastName>"
      And I type email "<Email>"
      And I type group code "<Groupcode>"
      And I type password "<Password>"
      And I type confirm password "<ConfirmPassword>"
      Then I click Register me button.
      Then "<Message>" message appears
      Examples:
      | FirstName | LastName | Email        | Groupcode   | Password | ConfirmPassword| Message                 |
      | abc       | abc      |test@test.com |asdefg&#     |12345     |12345           |You have been Registered. |
      | abc       | abc      |test@test.com |                |12345     |12345           |This field is required   |
      | abc       | abc      |test@test.com |asdefghijk      |12345     |12345           |You have been Registered. |
      | abc       | abc      |test@test.com |asdefghjklioutrv|12345     |12345           |Should no more than 10 characters|



