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

    