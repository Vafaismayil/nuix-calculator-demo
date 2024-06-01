package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class CalculatorPage {
    public CalculatorPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@id='display']/div")
    public WebElement result;

    public WebElement getElementFor (String button){

        WebElement elem = Driver.getDriver().findElement(By.xpath("//input[@value='"+button+"']"));
        return elem;
    }
}
