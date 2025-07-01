package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class PayrollPage_VariableMaster extends BasePage{

    public PayrollPage_VariableMaster(WebDriver driver)
    {
        super(driver);
    }

    Select select;

    @FindBy(xpath = "//div[@class='css-19bb58m']")
    WebElement drpSelectBU;

    @FindBy(xpath = "//div[normalize-space()='BU']")
    List<WebElement> selectBUOption;

    @FindBy(xpath = "//button[normalize-space()='Add New Variable']")
    WebElement btnAddNewVariable;

    @FindBy(xpath = "//select[@id='demo-simple-select']")
    WebElement drpVariableType;

    @FindBy(xpath = "//input[@id='Taxcheckbox']")
    WebElement chkTAX;

    @FindBy(xpath = "//input[@placeholder='Auto Generate']")
    WebElement txtAutoVariableCode;

    @FindBy(xpath = "//p[normalize-space()='Variable Name']/following::input[@placeholder='Enter Here'][1]")
    WebElement txtVariableName;

    @FindBy(xpath = "//p[normalize-space()='Variable Description']/following::input[@placeholder='Enter Here'][1]")
    WebElement txtVariableDescription;

    @FindBy(xpath = "//button[normalize-space()='Save']")
    WebElement btnSave;

    public void clkSelectBU()
    {
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(drpSelectBU));

        drpSelectBU.click();
    }

    public void clkBUOption()
    {
        System.out.println("Number of options displaying: " +selectBUOption.size());

        for (WebElement select : selectBUOption)
        {
            if (select.isDisplayed())
            {
                select.click();
                System.out.println("Clicked on the BU option.");
                break;
            }
        }
    }

    public void clkAddNewVariable()
    {
        btnAddNewVariable.click();
        System.out.println("Clicked on the Add New Variable button");
    }

    public void clkVariableType()
    {
        select=new Select(drpVariableType);
        select.selectByVisibleText("Reimbursement");
        System.out.println("Variable Type is selected");
    }

    public void clkTAX()
    {
        chkTAX.click();
        System.out.println("TAX option is selected");
    }

    public void enterAutoVariableCode(String autoVariableGenerate)
    {
        txtAutoVariableCode.sendKeys(autoVariableGenerate);
        System.out.println("Variable Code entered");
    }

    public void enterVariableName(String variableName)
    {
        txtVariableName.sendKeys(variableName);
        System.out.println("Variable Name is entered");
    }

    public void enterVariableDescription(String variableDescription)
    {
        txtVariableDescription.sendKeys(variableDescription);
        System.out.println("Description entered");
    }

    public void clkSave()
    {
        btnSave.click();
        System.out.println("New Variable is saved");
    }
}
