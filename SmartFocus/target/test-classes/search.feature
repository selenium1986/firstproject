
Feature: register with shop courts

As a user
I want to be 

Scenario: Verify user can register with shop courts 

Given I am on the homepage
When I click on the country
When I click on the signin link
When I click on register button
Then I enter all following details


@Signup
Scenario Outline: Login to the shop courts account

Given I m on page
When I enter <username> and <password> and submit
Then I can see my <messages>

Examples:
|username              |password      |messages|
|selenium1986@gmail.com|selenium1986  |Hi selenium|
           



