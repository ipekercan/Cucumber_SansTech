Feature: Example Feature Functionality

  @Smoke @Regression
  Scenario: Login successfully
    Given Navigate to website
    When Click login button
    And Enter credentials and click login button
    Then Verify login successfully