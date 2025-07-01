package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class BusinessUnit_LeavesPage extends BasePage{

    public BusinessUnit_LeavesPage(WebDriver driver)
    {
        super(driver);
    }

    Select select;

    @FindBy(xpath = "//span[normalize-space()='Add New']")
    WebElement btnAddNew;

    @FindBy(xpath = "//p[normalize-space()='Name :']/following::input[@placeholder='Enter text'][1]")
    WebElement txtName;

    @FindBy(xpath = "//p[normalize-space()='Leave code :']/following::select[1]")
    WebElement clkLeaveCode;

    @FindBy(xpath = "//p[normalize-space()='Leave Type :']/following::select[1]")
    WebElement clkLeaveType;

    @FindBy(xpath = "//input[@value='FullDay']")
    WebElement clkUnit;

    @FindBy(xpath = "//input[@value='true']")
    WebElement clkPenalty;

    @FindBy(xpath = "//p[contains(text(),'Applicable Validity')]/preceding::input[@type='checkbox'][1]")
    WebElement clkApplicableValidity;

    @FindBy(xpath = "//p[contains(text(),'Applicable Validity')]/following::input[@id='fullWidth'][1]")
    WebElement txtValidatyDays;

    @FindBy(xpath = "//input[@placeholder='Enter Description here']")
    WebElement txtDescription;

    @FindBy(xpath = "//p[contains(text(),'If more than')]/preceding::input[@type='checkbox'][1]")
    WebElement clkIfMoreThan;

    @FindBy(xpath = "//p[contains(text(),'If more than')]/following::input[@id='fullWidth'][1]")
    WebElement txtIfMoreThan;

    @FindBy(xpath = "//p[normalize-space()='If more than']/following::select[1]")
    WebElement drpIfMoreThan;

    @FindBy(xpath = "//p[contains(text(),'Max Leave')]/preceding::input[@type='checkbox'][1]")
    WebElement clkMaxLeave;

    @FindBy(xpath = "//p[contains(text(),'Max Leave')]/following::input[@id='fullWidth'][1]")
    WebElement txtMaxLeave;

    @FindBy(xpath = "//p[contains(text(),'file Upload')]/preceding::input[@type='checkbox'][1]")
    WebElement clkFileUpload;

    @FindBy(xpath = "//p[contains(text(),'file Upload')]/following::input[@id='fullWidth'][1]")
    WebElement txtFileUpload;

    @FindBy(xpath = "//p[contains(text(),'Past Dates')]/preceding::input[@type='checkbox'][1]")
    WebElement clkPastDatesUpto;

    @FindBy(xpath = "//p[contains(text(),'Past Dates')]/following::input[@id='fullWidth'][1]")
    WebElement txtPastDatesUpto;

    @FindBy(xpath = "//p[contains(text(),'Future Dates')]/preceding::input[@type='checkbox'][1]")
    WebElement clkFutureDatesUpto;

    @FindBy(xpath = "//p[contains(text(),'Future Dates')]/following::input[@id='fullWidth'][1]")
    WebElement txtFutureDatesUpto;

    @FindBy(xpath = "//p[contains(text(),'Employee Cannot')]/preceding::input[@type='checkbox'][1]")
    WebElement clkEmployeeCannot;

    @FindBy(xpath = "//p[contains(text(),'Employee Cannot')]/following::input[@id='fullWidth'][1]")
    WebElement txtEmployeeCannot;

    @FindBy(xpath = "//p[contains(text(),'Minimum leave')]/preceding::input[@type='checkbox'][1]")
    WebElement clkMinimumleave;

    @FindBy(xpath = "//p[contains(text(),'Minimum leave')]/following::input[@id='fullWidth'][1]")
    WebElement txtMinimumleave;

    @FindBy(xpath = "//p[contains(text(),'Maximum leave')]/preceding::input[@type='checkbox'][1]")
    WebElement clkMaximumleave;

    @FindBy(xpath = "//p[contains(text(),'Maximum leave')]/following::input[@id='fullWidth'][1]")
    WebElement txtMaximumleave;

    @FindBy(xpath = "//p[contains(text(),'limit')]/preceding::input[@type='checkbox'][1]")
    WebElement clkLimit;

    @FindBy(xpath = "//p[contains(text(),'limit')]/following::input[@id='fullWidth'][1]")
    WebElement txtLimit;

    @FindBy(xpath = "//p[normalize-space()='limit']/following::select[1]")
    WebElement drpLimit;

    @FindBy(xpath = "//p[contains(text(),'Starting Month')]/preceding::input[@type='checkbox'][1]")
    WebElement clkStartingMonth;

    @FindBy(xpath = "//p[contains(text(),'Starting Month')]/following::input[@id='fullWidth'][1]")
    WebElement txtStartingMonth;

    @FindBy(xpath = "//p[contains(text(),'Starting Month')]/following::input[@id='fullWidth'][2]")
    WebElement txtStartingMonthLeaveCount;

    @FindBy(xpath = "//p[contains(text(),'Initial Leave')]/preceding::input[@type='checkbox'][1]")
    WebElement clkInitialLeave;

    @FindBy(xpath = "//p[normalize-space()='Initial Leave']/following::select[1]")
    WebElement drpInitialLeave;

    @FindBy(xpath = "//p[contains(text(),'Initial Leave')]/following::input[@type='text'][1]")
    WebElement txtInitialLeave;

    @FindBy(xpath = "//p[normalize-space()='Effective After']/following::select[1]")
    WebElement drpEffectiveAfter;

    @FindBy(xpath = "//p[contains(text(),'Effective After')]/following::input[@type='text'][1]")
    WebElement txtEffectiveAfter;

    @FindBy(xpath = "//p[normalize-space()='Effective After']/following::select[2]")
    WebElement drpEffectiveAfterFrom;

    @FindBy(xpath = "//p[contains(text(),'leaves in year *')]/following::input[@id='fullWidth'][1]")
    WebElement txtNoOfLeavesYear;

    @FindBy(xpath = "//p[contains(text(),'Accrual')]/preceding::input[@type='checkbox'][1]")
    WebElement clkAccural;

    @FindBy(xpath = "//p[normalize-space()='Accrual']/following::select[1]")
    WebElement drpAccural;

    @FindBy(xpath = "//p[normalize-space()='Accrual']/following::select[2]")
    WebElement drpAccuralDate;

    @FindBy(xpath = "//p[normalize-space()='Starting month']/following::select[1]")
    WebElement drpStartingMonth;

    @FindBy(xpath = "//input[@value='male']")
    WebElement rdoGender;

    @FindBy(xpath = "//p[contains(text(),'Carry Forward')]/preceding::input[@type='checkbox'][1]")
    WebElement clkCarryForward;

    @FindBy(xpath = "//p[normalize-space()='Carry Forward']/following::select[1]")
    WebElement drpCarryForwardYear;

    @FindBy(xpath = "//p[normalize-space()='Carry Forward']/following::select[2]")
    WebElement drpCarryForwardBalanceLeave;

    @FindBy(xpath = "(//input[@aria-labelledby='enhanced-table-checkbox-0'])")
    WebElement chkSelectEmployee;

    @FindBy(xpath = "//button[normalize-space()='Save']")
    WebElement btnSave;

    public void clkAddNew()
    {
        btnAddNew.click();
        System.out.println("Add New button clicked");
    }

    public void enterName(String name)
    {
        txtName.sendKeys(name);
        System.out.println("Name Entered");
    }

    public void selectLeaveCode()
    {
        select=new Select(clkLeaveCode);
        select.selectByVisibleText("Sick Leave");
        System.out.println("Sick Leave Selected");
    }

    public void selectLeaveType()
    {
        select=new Select(clkLeaveType);
        select.selectByVisibleText("Unpaid");
        System.out.println("Leave Type Selected");
    }

    public void selectUnit()
    {
        clkUnit.click();
        System.out.println("Unit Selected");
    }

    public void selectPenalty()
    {
        clkPenalty.click();
        System.out.println("Penalty Selected");
    }

    public void selectApplicableValidity()
    {
        clkApplicableValidity.click();
        System.out.println("Validaty Days Selected");
    }

    public void enterValidatyDays(String days)
    {
        txtValidatyDays.sendKeys(days);
        System.out.println("Validaty Days Entered");
    }

    public void enterDescription(String description)
    {
        txtDescription.sendKeys(description);
        System.out.println("Description Entered");
    }

    public void selectIfMoreThan()
    {
        clkIfMoreThan.click();
        System.out.println("If More Than Selected");
    }

    public void enterIfMoreThan(String days)
    {
        txtIfMoreThan.sendKeys(Keys.CONTROL+"a");
        txtIfMoreThan.sendKeys(Keys.DELETE);
        txtIfMoreThan.sendKeys(days);
        System.out.println("If More Than Days Entered");
    }

    public void selectdrpIfMoreThan()
    {
        select=new Select(drpIfMoreThan);
        select.selectByVisibleText("Unpaid Leave");
        System.out.println("Unpaid Option selected");
    }

    public void selectMaxLeave()
    {
        clkMaxLeave.click();
        System.out.println("Max Leave Selected");
    }

    public void enterMaxLeaveDays(String days)
    {
        txtMaxLeave.sendKeys(days);
        System.out.println("Max Leave Days Entered");
    }

    public void selectfileUpload()
    {
        clkFileUpload.click();
        System.out.println("If More Than Selected");
    }

    public void enterfileUpload(String days)
    {
        txtFileUpload.sendKeys(Keys.CONTROL+"a");
        txtFileUpload.sendKeys(Keys.DELETE);
        txtFileUpload.sendKeys(days);
        System.out.println("If More Than Days Entered");
    }

    public void selectPastDates()
    {
        clkPastDatesUpto.click();
        System.out.println("Past Dates Selected");
    }

    public void enterPastDates(String days)
    {
        txtPastDatesUpto.sendKeys(days);
        System.out.println("Past Dates Days Entered");
    }

    public void selectFutureDates()
    {
        clkFutureDatesUpto.click();
        System.out.println("Future Dates Selected");
    }

    public void enterFutures(String days)
    {
        txtFutureDatesUpto.sendKeys(days);
        System.out.println("Future Days Entered");
    }

    public void selectEmployeeCannot()
    {
        clkEmployeeCannot.click();
        System.out.println("Employee Cannot apply leave more than Selected");
    }

    public void enterEmployeeCannot(String days)
    {
        txtEmployeeCannot.sendKeys(Keys.CONTROL+"a");
        txtEmployeeCannot.sendKeys(Keys.DELETE);
        txtEmployeeCannot.sendKeys(days);
        System.out.println("Employee Cannot apply leave more than Days Entered");
    }

    public void selectMinimumLeave()
    {
        clkMinimumleave.click();
        System.out.println("Minimum leave that can be availed per application Selected");
    }

    public void enterMinimumLeave(String days)
    {
        txtMinimumleave.sendKeys(days);
        System.out.println("Minimum leave that can be availed per application Days Entered");
    }

    public void selectMaximumLeave()
    {
        clkMaximumleave.click();
        System.out.println("Maximum leave that can be availed per application Selected");
    }

    public void enterMaximumLeave(String days)
    {
        txtMaximumleave.sendKeys(days);
        System.out.println("Maximum leave that can be availed per application Days Entered");
    }

    public void selectLimit()
    {
        clkLimit.click();
        System.out.println("Limit Selected");
    }

    public void enterLimit(String days)
    {
        txtLimit.sendKeys(Keys.CONTROL+"a");
        txtLimit.sendKeys(Keys.DELETE);
        txtLimit.sendKeys(days);
        System.out.println("Limit Days Entered");
    }

    public void selectdrpLimit()
    {
        select=new Select(drpLimit);
        select.selectByVisibleText("Year");
        System.out.println("Limit selected");
    }

    public void selectStartingMonth()
    {
        clkStartingMonth.click();
        System.out.println("Starting Month Selected");
    }

    public void enterStartingMonth(String days)
    {
        txtStartingMonth.sendKeys(Keys.CONTROL+"a");
        txtStartingMonth.sendKeys(Keys.DELETE);
        txtStartingMonth.sendKeys(days);
        System.out.println("Starting Month Days Entered");
    }

    public void enterStartingMonthLeaveCount(String days)
    {
        txtStartingMonthLeaveCount.sendKeys(Keys.CONTROL+"a");
        txtStartingMonthLeaveCount.sendKeys(Keys.DELETE);
        txtStartingMonthLeaveCount.sendKeys(days);
        System.out.println("Starting Month Leave Count Days Entered");
    }

    public void selectInitialLeave()
    {
        clkInitialLeave.click();
        System.out.println("Initial Leave Selected");
    }

    public void selectdrpInitialLeave()
    {
        select=new Select(drpInitialLeave);
        select.selectByVisibleText("Manually");
        System.out.println("Initial Leave selected");
    }

    public void enterInitialLeave(String days)
    {
        txtInitialLeave.sendKeys(days);
        System.out.println("Initial Leave Entered");
    }

    public void selectdrpEffectiveAfter()
    {
        select=new Select(drpEffectiveAfter);
        select.selectByVisibleText("10");
        System.out.println("Effective After selected");
    }

    public void enterEffectiveAfter(String days)
    {
        txtEffectiveAfter.sendKeys(days);
        System.out.println("Effective After Entered");
    }

    public void selectdrpEffectiveAfterFrom()
    {
        select=new Select(drpEffectiveAfterFrom);
        select.selectByValue("dateOfConfirmation");
        System.out.println("Effective After from selected");
    }

    public void enterNoOfLeavesYear(String days)
    {
        txtNoOfLeavesYear.sendKeys(days);
        System.out.println("Total no. of leaves in year* Entered");
    }

    public void selectAccural()
    {
        clkAccural.click();
        System.out.println("Accural Selected");
    }

    public void selectdrpAccural()
    {
        select=new Select(drpAccural);
        select.selectByVisibleText(" Monthly");
        System.out.println("Accural Year selected");
    }

    public void selectdrpAccuralDate()
    {
        select=new Select(drpAccuralDate);
        select.selectByVisibleText("14");
        System.out.println("Accural Date selected");
    }

    public void selectdrpStartingMonth()
    {
        select=new Select(drpStartingMonth);
        select.selectByVisibleText("August");
        System.out.println("Starting Month selected");
    }

    public void selectrdoGender()
    {
        rdoGender.click();
        System.out.println("Gender selected");
    }

    public void selectCarryForward()
    {
        clkCarryForward.click();
        System.out.println("Carry Forward selected");
    }

    public void selectdrpCarryForwardYear()
    {
        select=new Select(drpCarryForwardYear);
        select.selectByVisibleText("Monthly");
        System.out.println("Carry Forward Year selected");
    }

    public void selectCarryForwardBalanceLeave()
    {
        select=new Select(drpCarryForwardBalanceLeave);
        select.selectByVisibleText("Carry Forward With Encashment");
        System.out.println("Carry Forward Balance Leave selected");
    }

    public void enterCarryForwardBalanceLeave()
    {
        WebElement input1=driver.findElement(By.xpath("//p[contains(text(),'Carry Forward')]/following::input[@type='text'][1]"));
        input1.sendKeys(Keys.CONTROL + "a");
        input1.sendKeys(Keys.DELETE);
        input1.sendKeys("10");

        WebElement select1=driver.findElement(By.xpath("//p[normalize-space()='Carry Forward']/following::select[3]"));
        select=new Select(select1);
        select.selectByVisibleText("Percentage");

        WebElement input2=driver.findElement(By.xpath("//p[contains(text(),'Carry Forward')]/following::input[@type='text'][2]"));
        input2.sendKeys(Keys.CONTROL + "a");
        input2.sendKeys(Keys.DELETE);
        input2.sendKeys("3");

        WebElement input3=driver.findElement(By.xpath("//p[contains(text(),'Carry Forward')]/following::input[@type='text'][3]"));
        input3.sendKeys(Keys.CONTROL + "a");
        input3.sendKeys(Keys.DELETE);
        input3.sendKeys("20");

        WebElement select2=driver.findElement(By.xpath("//p[normalize-space()='Carry Forward']/following::select[4]"));
        select=new Select(select2);
        select.selectByVisibleText("Percentage");

        WebElement input4=driver.findElement(By.xpath("//p[contains(text(),'Carry Forward')]/following::input[@type='text'][4]"));
        input4.sendKeys(Keys.CONTROL + "a");
        input4.sendKeys(Keys.DELETE);
        input4.sendKeys("5");

    }

    public void selectEmployee()
    {
        chkSelectEmployee.click();
    }

    public void clkSave()
    {
        btnSave.click();
        System.out.println("Leave data is saved");
    }
}
