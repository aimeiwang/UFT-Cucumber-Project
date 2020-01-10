Feature: <feature title>

  Scenario: <scenario title>
    Given <pre-condition statement>
    When <action statement>
    Then <expectation statement>

  Scenario Outline: <scenario title>
    Given <pre-condition statement>
    When <action statement>
    Then <expectation statement>

    Examples:

      | arg1      | arg2     |
      | "value1"  | "value2" |
      #more values here