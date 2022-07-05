package com.crmly.pages;

import com.crmly.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void getLink(String link){
        Driver.getDriver().findElement(By.partialLinkText(link)).click();

    }
    

    @FindBy(xpath = "//input[@type='text']")
    public WebElement uSERLOGINInput;

    @FindBy(name = "USER_PASSWORD")
    public WebElement uSERPASSWORDInput;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginbtnInput;

    public void login(){
        Driver.getDriver().get("https://login.crmly.net/");
        uSERLOGINInput.sendKeys("helpdesk61@cybertekschool.com");
        uSERPASSWORDInput.sendKeys("UserUser");
        loginbtnInput.click();
        
    }



}
