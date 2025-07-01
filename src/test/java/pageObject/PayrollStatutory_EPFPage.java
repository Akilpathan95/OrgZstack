package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayrollStatutory_EPFPage extends BasePage{

    public PayrollStatutory_EPFPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//button[normalize-space()='Add New Component']")
    WebElement btnAddNewComponent;

    @FindBy(name = "code")
    WebElement txtCode;

    @FindBy(name = "name")
    WebElement txtName;

    @FindBy(name = "employeesContributionFormula")
    WebElement txtEmployeesContributionFormula;

    @FindBy(name = "employersContributionFormula")
    WebElement txtEmployersContributionFormula;

    @FindBy(xpath = "//button[normalize-space()='Save']")
    WebElement btnSave;

    public void clkAddNewComponent()
    {
        btnAddNewComponent.click();
        System.out.println("Clicked on the Add New Component button");
    }

    public void enterCode(String code)
    {
        txtCode.sendKeys(code);
        System.out.println("Code is entered");
    }

    public void enterNameEpf(String name)
    {
        txtName.sendKeys(name);
        System.out.println("Name is entered");
    }

    public void enterEmployeesContributionFormula(String employeesContributionFormula)
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
