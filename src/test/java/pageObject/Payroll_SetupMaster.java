package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Payroll_SetupMaster extends BasePage{

    public Payroll_SetupMaster(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//div[normalize-space()='Variable Master']")
    WebElement btnVariableMaster;

    @FindBy(xpath = "//div[normalize-space()='Statutory Components']")
    WebElement btnStatutoryComponents;

    @FindBy(xpath = "//div[normalize-space()='Payroll Cycle Setting']")
    WebElement btnPayrollCycleSetting;

    @FindBy(xpath = "//div[normalize-space()='Overtime Payment Setup']")
    WebElement btnOvertimePaymentSetup;

    @FindBy(xpath = "//div[normalize-space()='Payslip Header']")
    WebElement btnPayslipHeader;

    public void clkVariableMaster()
    {
        btnVariableMaster.click();
        System.out.println("Clicked on the Variable Master");
    }

    public void clkStatutoryComponents()
    {
        btnStatutoryComponents.click();
        System.out.println("Clicked on the Statutory Components");
    }

    public void clkPayrollCycleSetting()
    {
        btnPayrollCycleSetting.click();
        System.out.println("Clicked on the Payroll Cycle Setting");
    }

    public void clkOvertimePaymentSetup()
    {
        btnOvertimePaymentSetup.click();
        System.out.println("Clicked on the Payment Setup");
    }

    public void clkPayslipHeader()
    {
        btnPayslipHeader.click();
        System.out.println("Clicked on the Pay Slip Header");
    }

}
