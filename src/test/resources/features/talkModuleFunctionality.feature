Feature: Talk Module Functionality
  User Story :
  As a user, I should be able to create/delete conversation groups
  and chat with other co-workers under Talk Module

  Acceptance Criteria
  1. User can create a new group conversation by adding other users
  2. User can can see the participants of the conversation on the right-hand menu under Participants
  3. User can remove any participant from the conversation as being moderator of the conversation
  4. User can send messages by typing inside the input box at the bottom of the middle screen on Talk Module page
  5. User can delete any group conversation previously created

  @CEA-955
  Scenario: User creates new group conversation
    Given user enters the talk module successfully
    When user clicks create group conversation
    And user provides a group name
    And user chooses participants
    And user clicks create conversation
    Then user sees the new group chat

    @wip
  Scenario: User can see the participants
    Given user enters the talk module successfully
    When user clicks the group chat
    Then participants are displayed on the menu bar


    