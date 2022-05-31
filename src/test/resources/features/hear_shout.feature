# It's a good practise to have the same name for the feature file and the Feature.
Feature: Hear shout
  Scenario: Listener is within range
    Given Lucy is located 15 metres from Sean
    When Sean shouts "free bagels at Sean's"
    Then Lucy hears Sean's message

  Scenario: Listener is within range
    Given Lucy is located 15 metres from Sean
    When Sean shouts "Free coffee!"
    Then Lucy hears Sean's message

