Feature: Testing Reddit

  Scenario: Verify that homepage button is working
    Given Check that Home button is available in Top
    When Click on Home button
    Then Check that a navigation window is display
    And Check that Home icon is display
    And Check that Home Word is display beside Home icon
    When Click on Home Button from the Navigation bar
    Then Check the navigation bar is close
    And Check that Nothing is Changed