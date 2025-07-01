package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PayrollStatutory_LWFPage extends BasePage{

    public PayrollStatutory_LWFPage(WebDriver driver)
    {
        super(driver);
    }

    Select select;

    @FindBy(xpath = "//button[normalize-space()='Add State']")
    WebElement btnAddState;

    @FindBy(name = "state_name")
    WebElement drpStateName;

    @FindBy(name = "LWF_applicable")
    WebElement drpLWFApplicable;

    @FindBy(xpath = "(//*[normalize-space(text())='Effective Date']/following::div[contains(@class,'MuiOutlinedInput-root')]//button//*[name()='svg'])[2]")
    WebElement calLWFApplicableEffectiveDate;

    @FindBy(xpath ="(//div[contains(@class, 'MuiPickersModal-dialog')]//button)[2]//*[name()='svg']")
    WebElement btnforward;

    @FindBy(xpath = "//button[normalize-space()='Save']")
    WebElement btnSave;

    @FindBy(name = "frequency_type")
    WebElement drpFrequencyType;

    @FindBy(name = "emp_contribution_amount")
    WebElement txtEmpContributionAmount;

    @FindBy(name = "employers_contribution_amount")
    WebElement txtEmployersContributionAmount;

    @FindBy(name = "remark")
    WebElement txtRemark;

    public void clkAddState()
    {
        btnAddState.click();
        System.out.println("Clicked on Add State button");
    }

    public void selectStateName()
    {
        select=new Select(drpStateName);
        select.selectByVisibleText("Telangana");
        System.out.println("State Name selected");
    }

    public void selectLWFApplicable()
    {
        select=new Select(drpLWFApplicable);
        select.selectByVisibleText("Yes");
        System.out.println("LWF option gets selected");
    }

    public void selectLWFApplicableEffectiveDate()
    {
        calLWFApplicableEffectiveDate.click();
        System.out.println("Clicked on the LWF Applicable effective date");

        String expMonth="June 2025";
        String expDate="14";

        while (true)
        {
            String monthYear=driver.findElement(By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 MuiTypography-alignCenter']")).getText();
            System.out.println("Year and Month is : " + monthYear); //This will return actual year and month

            if (monthYear.equals(expMonth))
            {
                break;
            }
            btnforward.click();
            System.out.println("Clicked on the forward button");

            List<WebElement> date=driver.findElements(By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiPickersDay-day']"));

            for (WebElement allDate : date)
            {
                if (allDate.getText().equals(expDate))
                {
                    allDate.click();
                    System.out.println("Clicked on the Expected Date");
                    break;
                }
            }

            WebElement btnOK=driver.findElement(By.xpath("//span[normalize-space()='OK']"));
            btnOK.click();
        }

    }

    public void clkSave()
    {
        btnSave.click();
        System.out.println("Clicked on the Save button");
    }

    public void selectFrequencyType()
    {
        select=new Select(drpFrequencyType);
        select.selectByValue("Half_Yearly");
        System.out.println("Frequency type selected");
    }

    public void selectMonth()
    {
        driver.findElement(By.xpath("//div[10]//div[1]//span[1]//span[1]//input[1]")).click();
        System.out.println("Month selected");
    }

    public void enterEmpContributionAmount(String empContribution)
    {
        txtEmpContributionAmount.sendKeys(empContribution);
        System.out.println("Employee Contribution");
    }

    public void enterEmployersContributionAmount(String employersContribution)
    {
        txtEmployersContributionAmount.sendKeys(employersContribution);
        System.out.println("Employers Contribution");
    }

    public void enterRemark(String remark)
    {
        txtRemark.sendKeys(remark);
        System.out.println("Remark entered");
    }

    public void changeSave()
    {
        driver.findElement(By.xpath("(//button[normalize-space()='Save'])[2]")).click();
        System.out.println("Clicked on the Save button");
    }

}
