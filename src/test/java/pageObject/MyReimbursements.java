package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MyReimbursements extends BasePage{

    public MyReimbursements(WebDriver driver)
    {
        super(driver);
    }

    @FindBy (xpath = "//p[normalize-space()=\"Advance\"]")
    WebElement btnAdvance;

    @FindBy(xpath = "//div[normalize-space()=\"Travel Advance\"]")
    WebElement btnTravelAdvance;

    @FindBy (xpath = "(//button[contains(@aria-label,'change date')])[1]")
    WebElement drpTravelDateFrom;

    @FindBy(xpath = "(//button[contains(@aria-label,'change date')])[2]")
    WebElement drpTravelDateTo;

    @FindBy(xpath = "//input[@name=\"locnFrom\"]")
    WebElement txtlocationFrom;

    @FindBy(xpath = "//input[@name=\"locnTo\"]")
    WebElement txtlocationTo;

    @FindBy(xpath = "//input[@placeholder=\"Amount\"]")
    WebElement txtAmount;

    @FindBy(xpath = "//textarea[@id=\"fullWidth\"]")
    WebElement txtAddRemark;

    @FindBy(xpath = "//button[normalize-space()=\"Submit\"]")
    WebElement btnSubmit;

    @FindBy(xpath = "//button[normalize-space()=\"submit\"]")
    WebElement btnSubmitOtherExpense;

    @FindBy(xpath = "//span[normalize-space()=\"OK\"]")
    WebElement btnOK;

    @FindBy(xpath = "//div[contains(@class,'MuiPickersCalendarHeader')]//button[2]//*[name()='svg']")
    WebElement nextArrow;

    @FindBy(xpath = "(//button[contains(@class, 'MuiPickersCalendarHeader-iconButton')]//*[name()='svg'])[2]")
    WebElement calArrow;

    @FindBy(xpath = "//div[normalize-space()=\"Other Advance\"]")
    WebElement btnOtherAdvance;

    @FindBy(xpath = "//div[@id=\"demo-select-small-outlined\"]")
    WebElement drpAdvanceType;

    @FindBy(xpath = "//p[normalize-space()='Expense Claim']")
    WebElement btnExpenseClaim;

    @FindBy(xpath = "//span[contains(text(),'+ Add Details')]")
    WebElement btnAddDetails;

    @FindBy(xpath = "//input[@id='date-picker-inline']")
    WebElement selectBillDate;

    @FindBy(xpath = "//input[@type='file']")
    WebElement selectFile;

    @FindBy(xpath = "//button[normalize-space()='Add Expense']")
    WebElement btnAddExpense;

    @FindBy(xpath = "//input[@name='trip_name']")
    WebElement txtTripName;

    @FindBy(xpath = "//input[@name='purpose']")
    WebElement txtPurpose;

    @FindBy(xpath = "//div[normalize-space()='Travel Expense']")
    WebElement btnTravelExpense;

    public void addFile()
    {
        String path=System.getProperty("user.dir") + "/src/test/resources/foundit_Sanket-profile.pdf";
        try {
            selectFile.sendKeys(path);
        }
        catch (Exception e)
        {
            System.out.println("File is not upload : " + e.getMessage());
        }

        System.out.println("File added successfully");
    }

    public void clkAdvance()
    {
        btnAdvance.click();
    }

    public void clkTravelAdvance()
    {
        btnTravelAdvance.click();
    }

    public void selectTravelDateFrom() throws InterruptedException {
        String expMonthYear="July 2025";
        String expDate="26";

        drpTravelDateFrom.click();

        //Select Month and year

        while (true)
        {
            String yearMonth=driver.findElement(By.xpath("//div//p[@class='MuiTypography-root MuiTypography-body1 MuiTypography-alignCenter']")).getText();
            System.out.println("Year and Month is : " + yearMonth); //This will return actual year and month

            if (yearMonth.equals(expMonthYear))
            {
                break;
            }

            calArrow.click();
        }

        //Select the Date
        List<WebElement> date=driver.findElements(By.xpath("//div//button[@class='MuiButtonBase-root MuiIconButton-root MuiPickersDay-day']"));

        for (WebElement alldates : date)
        {
            if (alldates.getText().equals(expDate))
            {
                alldates.click();
                break;
            }
        }
        btnOK.click();
    }

    public void selectTravelDateTo() throws InterruptedException {
        String expMonthYear="July 2025";
        String expDate="31";

        drpTravelDateTo.click();

        //Select Month and year

        while (true)
        {
            String yearMonth=driver.findElement(By.xpath("//div//p[@class='MuiTypography-root MuiTypography-body1 MuiTypography-alignCenter']")).getText();
            System.out.println("Year and Month is : " + yearMonth); //This will return actual year and month

            if (yearMonth.equals(expMonthYear))
            {
                break;
            }

            calArrow.click();
        }

        //Select the Date
        List<WebElement> date=driver.findElements(By.xpath("//div//button[@class='MuiButtonBase-root MuiIconButton-root MuiPickersDay-day']"));

        for (WebElement alldates : date)
        {
            if (alldates.getText().equals(expDate))
            {
                alldates.click();
                break;
            }
        }
        btnOK.click();
    }

    public void clkOK()
    {
        btnOK.click();
    }

    public void enterLocationFrom(String from)
    {
        txtlocationFrom.sendKeys(from);
    }

    public void enterLocationTo(String to)
    {
        txtlocationTo.sendKeys(to);
    }

    public void enterAmount(String amount)
    {
        txtAmount.sendKeys(amount);
    }

    public void enterAddRemark(String remark)
    {
        txtAddRemark.sendKeys(remark);
    }

    public void clkSubmit()
    {
        btnSubmit.click();
    }

    public void clkOtherAdvance()
    {
        btnOtherAdvance.click();
    }

    public void clkAdvanceType()
    {
        drpAdvanceType.click();
        driver.findElement(By.xpath("//li[normalize-space()=\"Rent Advance\"]")).click();

    }

    public void clkSubmitOtherAdvance()
    {
        btnSubmitOtherExpense.click();
    }

    public void clkExpenseClaim()
    {
        btnExpenseClaim.click();
    }

    public void clkAddDetails()
    {
        btnAddDetails.click();
    }

    public void enterBillDate()
    {
        selectBillDate.sendKeys("2025-05-06");
    }

    public void selectClaimType()
    {
        WebElement drp=driver.findElement(By.xpath("//select[@id='demo-select-small-outlined']"));
        Select select=new Select(drp);
        select.selectByValue(" Mobile Expenses");

    }

    public void clkAddExpence()
    {
        try
        {
            btnAddExpense.click();
            System.out.println("Clicked on submit button");
            BasePage bp=new BasePage(driver);
            bp.handleAlert();
        }
        catch (Exception e)
        {
            System.out.println("Petty cash not submitted : " + e.getMessage());
        }

    }

    public void enterTripName(String tripName)
    {
        txtTripName.sendKeys(tripName);
    }

    public void enterPurpose(String purpose)
    {
        txtPurpose.sendKeys(purpose);
    }

    public void clkTravelExpense()
    {
        btnTravelExpense.click();
    }
}
