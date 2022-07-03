Feature:User should be able to add link, insert video, mention, quote, add tag in message.

  Background: Login and click message button
    Given user already login
    And user click message button

  Scenario: Verify user can add mentions about only department employees.
    When user click add mention button
    And user click employees and departments button
    And user click one of the employee for selection
    And user click send message button
    Then user should see mention in the message


  Scenario: Verify user can not add mentions about department.
    When user click add mention button
    And user click employees and departments button
    And user click one of the department for selection
    And user click send message button
    Then user should not see any mention in the message

  Scenario: Verify user can attach link to specified text.
    When user click link button
    And user enter both "link text" and "link URL"
    And user click save button
    And user click send message button
    Then user should see "expected link text" in the message as a "link"
    And user click this link
    Then user should see correct link open

  @Bug
  Scenario: Verify user can not attach link to specified text without link URL
    When user click link button
    And user enter only "link text"
    And user click save button
    Then user should not be able to save without link URL
    But user should see link text as if a link

  @Bug
  Scenario:Verify user should be able to insert YouTube and Vimeo video.
    When user click insert video button
    And user enters URL "link" from youtube or vimeo
      | www.youtube. |
      | www.vimeo.   |
    And user click save button
    And user click send message button
    Then user should see video in the message

  Scenario: Verify user should be able to add quotes.
    When user click quote text button
    And user enter "any text" in quote section
    And user click send message button
    Then user should see quote in the message

  Scenario: Verify user should be able to add tags in message
    When user click Add tag button
    And user enter "any tag" and click add button
    And user click add more button on tags bar
    And user enter "any tag" and click add button
    And user click send message button
    Then user should see quote in the message

  Scenario: Verify  user should be able remove tags before sending the message
    When user click Add tag button
    And user enter "any tag" and click add button
    And user click add more button on tags bar
    And user enter "any tag" and click add button
    And user click cross symbol on "any tag" that created before
    And user click send message button
    Then user should see quote in the message


















