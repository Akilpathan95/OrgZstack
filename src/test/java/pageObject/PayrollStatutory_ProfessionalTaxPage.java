package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PayrollStatutory_ProfessionalTaxPage extends BasePage{

    public PayrollStatutory_ProfessionalTaxPage(WebDriver driver)
    {
        super(driver);
    }

    Select select;

    @FindBy(xpath = "//button[normalize-space()='Add State']")
    WebElement btnAddState;

    @FindBy(xpath = "//select[@class='w-44 rounded']")
    WebElement drpStateName;

    @FindBy(xpath = "//select[@id='demo-simple-select']")
    WebElement drpStateApplicable;

    @FindBy(xpath = "//input[@id='date-picker-inline']")
    WebElement calEffectiveDate;

    @FindBy(xpath = "//button[normalize-space()='Save']")
    WebElement btnSave;

    @FindBy(xpath = "(//p[normalize-space()='State Name']/following::input[@placeholder='Enter Here'])[1]")
    WebElement txtStateName;

    @FindBy(xpath = "(//p[normalize-space()='Frequency']/following::select[@placeholder='Enter Here'])[1]")
    WebElement drpFrequency;

    public void selectFrequency()
    {
        select=new Select(drpFrequency);
        select.selectByVisibleText("Monthly");
    }

    public void clkAddState()
    {
        btnAddState.click();
        System.out.println("Clicked on the Add State button");
    }

    public void selectStateName(String name)
    {
        select=new Select(drpStateName);
        select.selectByVisibleText(name);
        System.out.println("State selected");
    }

    public void selectStateApplicable()
    {
        select=new Select(drpStateApplicable);
        select.selectByVisibleText("Yes");
        System.out.println("State Applicable value is selected");
    }

    public void selectEffectiveDate()
    {
        calEffectiveDate.sendKeys("30/05/2025");
        System.out.println("Effective date selected");
    }

    public void selectSave()
    {
        btnSave.click();
        System.out.println("Clicked on the save button");
    }

    public void enterStateName(String stateName)
    {
        txtStateName.sendKeys(stateName);
        System.out.println("State Name is entered");
    }
}
