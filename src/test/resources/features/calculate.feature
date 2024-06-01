Feature: Calculator Operations As a user I would like to verify the web-based calculator functionality for basic arithmetic operations

  @smoke
  Scenario Outline: Verify calculator performs basic arithmetic operations as expected
    Given the calculator application is open
    When I enter <number1>
    When I press <operation>
    When I enter <number2>
    Then the result should be <result>

    Examples:
      | number1 | number2 | operation | result |
      | 5       | 3       | "+"       | 8      |
      | 9       | 4       | "-"       | 5      |
      | 7       | 6       | "×"       | 42     |
      | 8       | 2       | "÷"       | 4      |
      | 1       | 5       | "+"       | 6      |
      | 1       | 7       | "-"       | -6     |
      | 3       | 5       | "×"       | 15     |
      | 80      | 4       | "÷"       | 20     |
      | 8.1     | 4       | "+"       | 12.1   |





