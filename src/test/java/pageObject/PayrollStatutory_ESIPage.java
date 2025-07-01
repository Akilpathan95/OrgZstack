package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayrollStatutory_ESIPage extends BasePage{

    public PayrollStatutory_ESIPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//button[normalize-space()='Add New Component']")
    WebElement btnAddNewComponent;

    @FindBy(xpath = "(//input[@placeholder='Enter Here'])[1]")
    WebElement txtCode;

    @FindBy(xpath = "(//input[@placeholder='Enter Here'])[2]")
    WebElement txtName;

    @FindBy(xpath = "(//input[@placeholder='Enter Here'])[3]")
    WebElement txtEmployeesContributionFormula;

    @FindBy(xpath = "(//input[@placeholder='Enter Here'])[4]")
    WebElement txtEmployersContributionFormula;

    @FindBy(xpath = "//button[normalize-space()='Save']")
    WebElement btnSave;

    public void clkAddNewComponentESI()
    {
        btnAddNewComponent.click();
        System.out.println("Clicked on the Add New Component button");
    }

    public void enterCodeESI(String code)
    {
        txtCode.sendKeys(code);
        System.out.println("Code is entered");
    }

    public void enterNameEpfESI(String name)
    {
        txtName.sendKeys(name);
        System.out.println("Name is entered");
    }

    public void enterEmployeesContributionFormulaESI(String employeesContributionFormula)
    {
        txtEmployeesContributionFormula.sendKeys(employeesContributionFormula);
        System.out.println("Employees Contribution Formula is entered");
    }

    public void enterEmployersContributionFormula(String employersContributionFormula)
    {
        txtEmployersContributionFormula.sendKeys(employersContributionFormula);
        System.out.println("Employers Contribution Formula is entered");
    }

    public void clkSave()
    {
        btnSave.click();
        System.out.println("Clicked on the Save button");
    }
}
