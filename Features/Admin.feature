
Feature: Admin

  Scenario: Login with valid credentials
    Given user launch chrome browser
    When user open url "http://admin-demo.nopcommerce.com/login"
    When user enter email as "admin@yourstore.com" and password as "admin"
    When user click on login button
    Then close browser