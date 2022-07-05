package com.crmly.pages;

import com.crmly.step_definitions.MyStepdefs;
import com.crmly.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActivityStreamPage extends BasePage{

    public WebElement sentMention(String mention){
        return Driver.getDriver().findElement(By.xpath("(//div[contains(@id,'blg-post-' )]//a[.='"+mention+"'])[2]"));};


    public WebElement sentQuote(String quote){
        return Driver.getDriver().findElement(By.xpath("//div[@class='blog-post-quote']//td[.='"+quote+"']"));
    };



    public WebElement sentLink(String linkText){
        return Driver.getDriver().findElement(By.xpath("//div[contains(@id,'blg-post-' )]//a[.='"+linkText+"']"));
    }

    @FindBy(xpath = "//div[contains(@id,'blg-post-' )]//iframe")
    public WebElement sentVideo;

    @FindBy(xpath = "//div[contains(@id,'blogpost-tags-')]/a")
    public WebElement sentTag;

    public WebElement nullSentLink(String link){
        return Driver.getDriver().findElement(By.xpath("//div[.='"+link+"']"));
    }







    }



    // public WebElement getProductElement(String product){
    //        return Driver.getDriver().findElement(By.xpath("//td[.='"+product+"']"));
    //    }
















