Feature: Order HP Pen Drive

  Scenario Outline: Add HP Pen Drive to Cart with Different Quantities
    Given User searches for HP Pen Drive
    When Add the first result on the page with quantity <qty>
    Then Cart should display <qty> pen drive

    Examples:
      | qty |
      | 1   |
      | 2   |
      | 5   |
