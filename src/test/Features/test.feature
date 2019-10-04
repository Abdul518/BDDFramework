Feature: Test Website functionality
  Scenario: Logo present on the webpage
    Given Client is on the Chrome Browser
    When Type the website address and click
    Then Client should see the logo displayed on homepage
    And  Client should close the browser

