@RegressionScenarions
Feature: Verifying the blog link

  @Regression
  Scenario: Title verfication of blog
    Given I Open blog link of gourav
    Then I Verify the title of page
    Then I click and verify the 2012 link

  @Regression
  Scenario Outline: Verfication of two links
    Given I Open blog link of gourav
    Then I Verify the title of page
    Then I click and verify the <old Blog> link
   
    Examples: 
      | old Blog |
      |     2013 |
      |     2015 |
