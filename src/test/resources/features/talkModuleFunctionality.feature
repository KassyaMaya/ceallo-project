Feature: Talk Module Functionality
  User Story :
  As a user, I should be able to create/delete conversation groups
  and chat with other co-workers under Talk Module

  Acceptance Criteria
  User can create a new group conversation by adding other users

  @CEA-955
  Scenario: User creates new group conversation
    Given user enters the talk module successfully
    When user clicks create group conversation
    And user provides a group name
    And user chooses participants
    And user clicks create conversation
    Then user sees the new group chat

  @CEA-964
  Scenario: User can see participants in the menu bar
    Given user enters the talk module successfully
    When user clicks the group chat
    Then participants are displayed on the menu bar

  @CEA-966
  Scenario: User ser as a moderator can delete any participant
    Given user is in a group chat
    When user clicks the participant's settings
    And user clicks remove participant
    Then participant is removed from the chat


  @CEA-968
  Scenario: User can delete any group conversation
    Given user enters the talk module successfully
    When user clicks the chat settings
    And user clicks delete conversation option
    And user confirms deletion of the chat
    Then the chat is deleted

