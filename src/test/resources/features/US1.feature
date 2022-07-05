@REM-1320
Feature:User should be able to add link, insert video, mention, quote, add tag in message.


  Background: Login and click message button
    Given user already login
    And user click message button

  @REM-1313 @REM-1312
  Scenario: Verify user can add mentions about only department employees.
    When user click add mention button
    And user click employees and departments button
    And user click one of the "hr61@cybertekschool.com" for selection
    And user click send message button
    Then user should see "hr61@cybertekschool.com" in the message


  @REM-1314 @REM-1312
  Scenario: Verify user can attach link to specified text.
    When user click link button
    And user enter both "GOOGLE" and "www.google.com"
    And user click save button
    And user click send message button
    Then user should see "GOOGLE" in the message as a "https://www.google.com/"


  @REM-1319 @REM-1312
  Scenario: Verify user can not attach link to specified text without link URL
    When user click link button
    And user enter only "link text"
    And user click save button
    And user click send message button
    Then user should not be able to save without "link text" URL

  @REM-1315 @REM-1312
  Scenario:Verify user should be able to insert YouTube and Vimeo video.
    When user click insert video button
    And user enters URL link "https://vimeo.com/500827697/"from youtube or vimeo
    And user click save button
    And user click send message button
    Then user should see video in the message

  @REM-1316 @REM-1312
  Scenario: Verify user should be able to add quotes.
    When user click quote text button
    And user enter "This is quote" in quote section
    And user click send message button
    Then user should see "This is quote" quote in the message

  @REM-1317 @REM-1312
  Scenario: Verify user should be able to add tags in message
    When user click Add tag button
    And user enter "Urgent" and click add button
    And user click send message button
    Then user should see "urgent" tag in the message

  @REM-1318 @REM-1312
  Scenario: Verify  user should be able remove tags before sending the message
    When user click Add tag button
    And user enter "Urgent" and click add button
    And user click add more button on tags bar
    And user enter "Attention" and click add button
    And user click cross symbol on "Urgent" that created before
    And user click send message button
    Then user should see "Attention" tag in the message


















