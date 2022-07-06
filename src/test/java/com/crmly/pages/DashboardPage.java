package com.crmly.pages;

import com.crmly.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{
    
    @FindBy(id ="feed-add-post-form-tab-message")
    public WebElement messageButton;

    @FindBy(id = "bx-b-link-blogPostForm")
    public WebElement linkButton;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-text")
    public WebElement linkTextInput;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-href")
    public WebElement linkInput;

    @FindBy(xpath = "//input[@value='Save']")
    public WebElement SaveButton;

    @FindBy(xpath = "//input[@value='Cancel']")
    public WebElement CancelButton;

    @FindBy(id = "bx-b-video-blogPostForm")
    public WebElement videoButton;

    @FindBy(id = "video_idPostFormLHE_blogPostForm-source")
    public WebElement videoSourceInput;

    @FindBy(id = "video_idPostFormLHE_blogPostForm-size")
    public WebElement videoSize;

    @FindBy(id = "bx-b-quote-blogPostForm")
    public WebElement quoteButton;


    @FindBy(xpath = "//blockquote")
    public WebElement quoteInput;


    @FindBy(id = "bx-b-mention-blogPostForm")
    public WebElement mentionButton;

    @FindBy(xpath = "//a[@class='bx-finder-box-tab bx-lm-tab-department']")
    public WebElement employeesAndDepartmentsButton;

    @FindBy(xpath = "//a[@class='bx-finder-box-tab bx-lm-tab-last bx-finder-box-tab-selected']")
    public WebElement recentButton;

    public WebElement selectedEmployee(String anyEmployee ){
        return Driver.getDriver().findElement(By.xpath("//div[@class='bx-finder-company-department-employee-name' and .='"+anyEmployee+"']"));
    };

    @FindBy(xpath = "//div[@class='bx-finder-box-item-t7-name']")
    public WebElement recentEmployee;

    @FindBy(id = "bx-b-tag-input-blogPostForm")
    public WebElement tagButton;

    @FindBy(id = "TAGS_blogPostForm67abSn")
    public WebElement tagInput;

    @FindBy(xpath = "//span[.='Add']")
    public WebElement addButton;

    @FindBy(xpath = "//span[@id='post-tags-add-new-blogPostForm']")
    public WebElement addMoreButton;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendMessageButton;

    @FindBy(xpath = "//*[@class='play-icon']")
    public WebElement videoCheck;

    @FindBy(xpath = "//div[@id='post-tags-container-blogPostForm']//span[@class='feed-add-post-del-but']")
    public WebElement deleteTag;





}
