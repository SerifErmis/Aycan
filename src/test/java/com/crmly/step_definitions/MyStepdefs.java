package com.crmly.step_definitions;

import com.crmly.pages.ActivityStreamPage;
import com.crmly.pages.BasePage;
import com.crmly.pages.DashboardPage;
import com.crmly.utilities.BrowserUtils;
import com.crmly.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MyStepdefs {

    DashboardPage dashboardPage =new DashboardPage();
    ActivityStreamPage activityStreamPage = new ActivityStreamPage();

    @Given("user already login")
    public void userAlreadyLogin() {
    dashboardPage.login();
    }

    @And("user click message button")
    public void userClickMessageButton() {
    dashboardPage.messageButton.click();
    BrowserUtils.waitFor(2);
    }

    @When("user click add mention button")
    public void userClickAddMentionButton() {
    dashboardPage.mentionButton.click();
    }

    @And("user click employees and departments button")
    public void userClickEmployeesAndDepartmentsButton() {
     dashboardPage.employeesAndDepartmentsButton.click();
    }



    @And("user click one of the {string} for selection")
    public void userClickOneOfTheMentionForSelection(String Employee) {
         dashboardPage.selectedEmployee(Employee).click();
    }


    @And("user click send message button")
    public void userClickSendMessageButton() {
    dashboardPage.sendMessageButton.click();
    BrowserUtils.waitFor(2);
    }

    @Then("user should see {string} in the message")
    public void userShouldSeeMentionInTheMessage(String Employee) {

    Assert.assertTrue(activityStreamPage.sentMention(Employee).isDisplayed());
    }

    @And("user click one of the department for selection")
    public void userClickOneOfTheDepartmentForSelection() {

    }

    @Then("user should not see any mention in the message")
    public void userShouldNotSeeAnyMentionInTheMessage() {
    }

    @When("user click link button")
    public void userClickLinkButton() {
       dashboardPage.linkButton.click();
    }

    @And("user enter both {string} and {string}")
    public void userEnterBothAnd(String linkText, String link) {
        dashboardPage.linkTextInput.sendKeys(linkText);
        dashboardPage.linkInput.sendKeys(link);
    }

    @And("user click save button")
    public void userClickSaveButton() {
        dashboardPage.SaveButton.click();

    }

    @Then("user should see {string} in the message as a {string}")
    public void userShouldSeeInTheMessageAsA(String linkText, String link) {
        BrowserUtils.waitForVisibility(activityStreamPage.sentLink(linkText),10);
       Assert.assertTrue(activityStreamPage.sentLink(linkText).isDisplayed());
       Assert.assertEquals(link, activityStreamPage.sentLink(linkText).getAttribute("href"));

    }




    @And("user enter only {string}")
    public void userEnterOnly(String linkText) {
        dashboardPage.linkTextInput.sendKeys(linkText);
    }


    @Then("user should not be able to save without {string} URL")
    public void userShouldNotBeAbleToSaveWithoutURL(String linkText) {
        BrowserUtils.waitForVisibility(activityStreamPage.nullSentLink(linkText), 10);
        Assert.assertFalse(activityStreamPage.nullSentLink(linkText).isDisplayed());
    }


    @When("user click insert video button")
    public void userClickInsertVideoButton() {
        dashboardPage.videoButton.click();
    }


    @And("user enters URL link {string} from youtube or vimeo")
    public void userEntersURLLinkFromYoutubeOrVimeo(String URLLink) {
        dashboardPage.videoSourceInput.sendKeys(URLLink);
        BrowserUtils.waitForVisibility(dashboardPage.videoCheck, 30);
    }


    @Then("user should see video in the message")
    public void userShouldSeeVideoInTheMessage() {
        Assert.assertTrue(activityStreamPage.sentVideo.isDisplayed());
    }

    @When("user click quote text button")
    public void userClickQuoteTextButton() {
        dashboardPage.quoteButton.click();
    }

    @And("user enter {string} in quote section")
    public void userEnterInQuoteSection(String quote) {
        Driver.getDriver().switchTo().frame(0);
        dashboardPage.quoteInput.sendKeys(quote);
        Driver.getDriver().switchTo().parentFrame();

    }



    @Then("user should see {string} quote in the message")
    public void userShouldSeeQuoteInTheMessage(String quote) {
        BrowserUtils.waitForVisibility(activityStreamPage.sentQuote(quote),10);
        Assert.assertTrue(activityStreamPage.sentQuote(quote).isDisplayed());
    }

    @When("user click Add tag button")
    public void userClickAddTagButton() {
        dashboardPage.tagButton.click();
    }

    @And("user enter {string} and click add button")
    public void userEnterAndClickAddButton(String tag) {
        dashboardPage.tagInput.sendKeys(tag);
        dashboardPage.addButton.click();
        Faker faker = new Faker();
        Driver.getDriver().switchTo().frame(0);
        Driver.getDriver().findElement(By.xpath("//body")).sendKeys(faker.letterify("????????"));
        Driver.getDriver().switchTo().parentFrame();
    }

    @And("user click add more button on tags bar")
    public void userClickAddMoreButtonOnTagsBar() {
        dashboardPage.addMoreButton.click();
    }

    @And("user click cross symbol on {string} that created before")
    public void userClickCrossSymbolOnThatCreatedBefore(String tag) {
        dashboardPage.deleteTag.click();
    }


    @Then("user should see {string} tag in the message")
    public void userShouldSeeTagInTheMessage(String tag) {
        BrowserUtils.waitForVisibility(activityStreamPage.sentTag,10);
        Assert.assertEquals(tag, activityStreamPage.sentTag.getText());
    }




    @But("user see error on the screen")
    public void userSeeErrorOnTheScreen() {
        System.out.println("Unexpected VD403 error seen on the screen");
    }
}
