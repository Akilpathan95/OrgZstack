package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayrollStatutory_BonusAndLeaveWageAndGratuityPage extends BasePage{

    public PayrollStatutory_BonusAndLeaveWageAndGratuityPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//button[normalize-space()='Add New Component']")
    WebElement btnAddNewComponent;

    @FindBy(name = "code")
    WebElement txtBonusCode;

    @FindBy(name = "name")
    WebElement txtBonusName;

    @FindBy(name = "employeesContributionFormula")
    WebElement txtEmployeesContributionFormula;

    @FindBy(xpath = "//button[normalize-space()='Save']")
    WebElement btnSave;

    public void clkAddNewComponent()
    {
        btnAddNewComponent.click();
        System.out.println("Clicked on the Add New Component");
    }

    public void enterBonusCode(String bonusCode)
    {
        txtBonusCode.sendKeys(bonusCode);
        System.out.println("Code entered");
    }

    public void enterBonusName(String bonusName)
    {
        txtBonusName.sendKeys(bonusName);
        System.out.println("Name entered");
    }

    public void enterEmployeesContributionFormula(String employeesContributionFormula)
    {
        txtEmployeesContributionFormula.sendKeys(employeesContributionFormula);
        System.out.println("Employees Contribution Formula entered");
    }

    public void clkSave1()
    {
        btnSave.click();
        System.out.println("Clicked on the Save button");
    }
}

