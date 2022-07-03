package com.crmly.pages;

import com.crmly.step_definitions.MyStepdefs;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActivityStreamPage extends BasePage{

    @FindBy(xpath = "//div[contains(@id,'blg-post-' )]//div[@class='blog-post-quote']//td")
    public WebElement sentQuote;

    //change google
    @FindBy(xpath = "//div[contains(@id,'blg-post-' )]//a[.='Google']")
    public WebElement sentLink;

    @FindBy(xpath = "//div[contains(@id,'blg-post-' )]//iframe")
    public WebElement sentVideo;

    String selectedEmployee;
    @FindBy(xpath = "(//div[contains(@id,'blg-post-' )]//a[.=''])[2]")
    public WebElement sentLink;











}
