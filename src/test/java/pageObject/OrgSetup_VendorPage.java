package pageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OrgSetup_VendorPage extends BasePage {

    public OrgSetup_VendorPage(WebDriver driver)
    {
        super(driver);
    }

    WebDriverWait wait;
    JavascriptExecutor js;

    @FindBy(xpath = "//button[contains(text(), 'ADD NEW')]")
    WebElement btnAddNew;

    public void clkAddNew()
    {
        btnAddNew.click();
        System.out.println("Clicked on the Add New button");
    }

    @FindBy(xpath = "//input[@name='vendor_name']")
    WebElement txtVendorName;

    @FindBy(xpath = "//input[@name='vendor_code']")
    WebElement txtVendorCode;

    @FindBy(xpath = "(//input[@type='file'])[1]")
    WebElement imgVendorLogo;

    @FindBy(xpath = "(//input[@type='file'])[2]")
    WebElement fileAgreementCopy;

    @FindBy(xpath = "//div[@id='mui-component-select-organisation']")
    WebElement drpOrganisation;

    @FindBy(xpath = "//div[@id='mui-component-select-industry']")
    WebElement drpServices;

    @FindBy(xpath = "//div[@id='mui-component-select-division']")
    WebElement drpDivision;

    @FindBy(xpath = "//input[@name='website']")
    WebElement txtWebsite;

    @FindBy(xpath = "//input[@name='pan']")
    WebElement txtPan;

    @FindBy(xpath = "//input[@name='tan']")
    WebElement txtTan;

    @FindBy(xpath = "//input[@name='gstin']")
    WebElement txtGSTNo;

    @FindBy(xpath = "//textarea[@name='address1']")
    WebElement txtAddress;

    @FindBy(xpath = "//div[@id='mui-component-select-country']")
    WebElement drpCountry;

    @FindBy(xpath = "//div[@id='mui-component-select-state']")
    WebElement drpState;

    @FindBy(xpath = "//textarea[@name='city']")
    WebElement txtCity;

    @FindBy(xpath = "//input[@name='email']")
    WebElement txtEmail;

    @FindBy(xpath = "//input[@name='phone_number']")
    WebElement txtPhoneNumber;

    @FindBy(xpath = "//input[@name='mobile_number']")
    WebElement txtMobileNumber;

    @FindBy(xpath = "//div[@id='mui-component-select-acquired_by']")
    WebElement drpAcquiredBy;

    @FindBy(xpath = "//div[@id='mui-component-select-account_mgr_name']")
    WebElement drpAccountsManager;

    @FindBy(xpath = "//div[@id='mui-component-select-segment']")
    WebElement drpSegment;

    @FindBy(xpath = "//input[@name='start_date']")
    WebElement calAgreementStartDate;

    @FindBy(xpath = "//input[@name='end_date']")
    WebElement calAgreementEndDate;

    @FindBy(xpath = "//input[@placeholder='Name']")
    WebElement txtName;

    @FindBy(xpath = "//input[@placeholder='Email ID']")
    WebElement txtEmailID;

    @FindBy(xpath = "//input[@placeholder='Mobile No.']")
    WebElement txtMobileNo;

    @FindBy(xpath = "//input[@placeholder='Designation']")
    WebElement txtDesignation;

    @FindBy(xpath = "//button[normalize-space()='+ Add SPOC']")
    WebElement btnAddSPOC;

    @FindBy(xpath = "//button[normalize-space()='Permanent']")
    WebElement btnPermanent;

    @FindBy(xpath = "//select[@id='demo-simple-select']")
    WebElement selectFeeStructure;

    @FindBy(xpath = "//button[normalize-space()='Save']")
    WebElement btnSave;

    public void enterEmail(String email)
    {
        txtEmail.sendKeys(email);
        System.out.println("Email entered");
    }

    public void enterPhoneNumber(String phone)
    {
        txtPhoneNumber.sendKeys(phone);
        System.out.println("Phone number entered");
    }

    public void enterMobileNumber(String mobile)
    {
        txtMobileNumber.sendKeys(mobile);
        System.out.println("Mobile Number entered");
    }

    public void enterVendorName(String name)
    {
        txtVendorName.sendKeys(name);
        System.out.println("Vendor name entered");
    }

    public void enterVendorCode(String code)
    {
        txtVendorCode.sendKeys(code);
        System.out.println("Vendor code entered");
    }

    public void selectVendorLogo()
    {
        String path=System.getProperty("user.dir") + "/src/test/resources/ipsImage.jpg";
        imgVendorLogo.sendKeys(path);
        System.out.println("Vendor logo selected");
    }

    public void selectAgreementCopy()
    {
        String path=System.getProperty("user.dir") + "/src/test/resources/foundit_Sanket-profile.pdf";
        fileAgreementCopy.sendKeys(path);
        System.out.println("Agreement Copy attached");
    }

    public void selectOrganisation()
    {
        drpOrganisation.click();
        WebElement select=driver.findElement(By.xpath("//li[@data-value='Demo Organisation']"));
        select.click();
        System.out.println("Organisation select");
    }

    public void selectServices()
    {
        drpServices.click();
        WebElement select=driver.findElement(By.xpath("//li[@data-value='permanent']"));
        select.click();
        System.out.println("Services selected");
    }

    public void selectDivision()
    {
        drpDivision.click();
        //Please Select division when this field appeared
        WebElement select=driver.findElement(By.xpath(""));
        select.click();
        System.out.println("Division is slected");
    }

    public void enterWebsite(String website)
    {
        txtWebsite.sendKeys(website);
        System.out.println("Website entered");
    }

    public void enterPan(String pan)
    {
        txtPan.sendKeys(pan);
        System.out.println("Pan number entered");
    }

    public void enterTan(String tan)
    {
        txtTan.sendKeys(tan);
    }

    public void enterGSTNo(String gstNo)
    {
        txtGSTNo.sendKeys(gstNo);
        System.out.println("GST no entered");
    }

    public void enterAddress(String address)
    {
        txtAddress.sendKeys(address);
        System.out.println("Address entered");
    }

    public void selectCountry()
    {
        drpCountry.click();
        WebElement country=driver.findElement(By.xpath("//li[normalize-space()='India']"));
        country.click();
        System.out.println("Country selected");
    }

    public void selectState()
    {
        drpState.click();
        WebElement state=driver.findElement(By.xpath("//li[normalize-space()='Bihar']"));
        state.click();
        System.out.println("State is selected");
        System.out.println("State selected");
    }

    public void enterCity(String city)
    {
        txtCity.sendKeys(city);
        System.out.println("City entered");
    }

    public void selectAcquiredBy()
    {
        drpAcquiredBy.click();
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        By select=By.xpath("//li[normalize-space()='Demo Jasvant']");
        WebElement drp=wait.until(ExpectedConditions.visibilityOfElementLocated(select));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", drp);
        System.out.println("Acquired by is selected");
    }

    public void selectAccountManager()
    {
        drpAccountsManager.click();
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        By select=By.xpath("//li[normalize-space()='Demosanket']");
        WebElement drp=wait.until(ExpectedConditions.visibilityOfElementLocated(select));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", drp);
        System.out.println("Account Manager selected");
    }

    public void selectSegment()
    {
        drpSegment.click();
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        By select=By.xpath("//li[normalize-space()='IT Staffing']");
        WebElement drp=wait.until(ExpectedConditions.visibilityOfElementLocated(select));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", drp);
        System.out.println("Segment is selected");
    }

    public void selectAgreementStartDate(String startDate)
    {
        calAgreementStartDate.sendKeys(Keys.CONTROL + "a");
        calAgreementStartDate.sendKeys(Keys.DELETE);
        calAgreementStartDate.sendKeys(startDate);
        System.out.println("Agreement Start Date entered");
    }

    public void selectAgreementEndDate(String endDate)
    {
        calAgreementEndDate.sendKeys(Keys.CONTROL + "a");
        calAgreementEndDate.sendKeys(Keys.DELETE);
        calAgreementEndDate.sendKeys(endDate);
        System.out.println("Agreement End date entered");
    }

    public void enterName(String name)
    {
        txtName.sendKeys(name);
        System.out.println("SPOC Name entered");
    }

    public void selectEmailId(String emailId)
    {
        txtEmailID.sendKeys(emailId);
        System.out.println("Email Id is entered");
    }

    public void selectMobileNo(String mobile)
    {
        txtMobileNo.sendKeys(mobile);
        System.out.println("Mobile number entered");
    }

    public void enterDesignatio(String designation)
    {
        txtDesignation.sendKeys(designation);
        System.out.println("Designation entered");
    }

    public void enterAddSPOC()
    {
        btnAddSPOC.click();
        System.out.println("Add SPOC is entered");
    }

    public void enterContractual(String paymentM1, String sourcingS1, String payrollPayment, String date, String days)
    {
        WebElement monthly= driver.findElement(By.xpath("(//p[contains(normalize-space(), 'Monthly')]/following::div[@aria-haspopup='listbox'])[1]"));
        monthly.click();
        WebElement selectM= driver.findElement(By.xpath("//li[normalize-space()= 'Variable in %']"));
        selectM.click();
        System.out.println("Contracting Margin on Monthly Basis selected");
        WebElement paymentM= driver.findElement(By.xpath("(//p[contains(normalize-space(), 'Monthly')]/following::input[@placeholder='Enter Amount'])[1]"));
        paymentM.sendKeys(paymentM1);
        System.out.println("Contracting Margin on Monthly Basis Amount entered");

        WebElement sourcing=driver.findElement(By.xpath("(//p[contains(normalize-space(), 'Sourcing')]/following::div[@aria-haspopup='listbox'])[1]"));
        sourcing.click();
        WebElement sourcingS=driver.findElement(By.xpath("//li[normalize-space()='Fixed in Rs']"));
        sourcingS.click();
        System.out.println("One Time Sourcing Fee selected");
        WebElement paymentS=driver.findElement(By.xpath("(//p[contains(normalize-space(), 'Sourcing')]/following::input[@placeholder='Enter Amount'])[1]"));
        paymentS.sendKeys(sourcingS1);
        System.out.println("One Time Sourcing Fee amount entered");

        WebElement lifecycle=driver.findElement(By.xpath("//p[contains(normalize-space(), 'Lifecycle')]/following::div[@aria-haspopup='listbox']"));
        lifecycle.click();
        WebElement lifecycleL=driver.findElement(By.xpath("//li[@data-value='7']"));
        lifecycleL.click();
        System.out.println("Employee Avg. Lifecycle ( Month ) selected");
        WebElement Payrollcycle=driver.findElement(By.xpath("(//p[contains(normalize-space(), 'Lifecycle')]/following::input[@placeholder='Enter Amount'])[1]"));
        Payrollcycle.sendKeys(payrollPayment);
        System.out.println("Payroll cycle amount entered");

        WebElement paymentDate=driver.findElement(By.xpath("(//p[contains(normalize-space(),'Date')]/following::input)[1]"));
        paymentDate.sendKeys(date);
        System.out.println("Payment Date entered");

        WebElement paymentDays=driver.findElement(By.xpath("(//p[contains(normalize-space(),'Days')]/following::input)[1]"));
        paymentDays.sendKeys(days);
        System.out.println("Payment days entered");
    }

    public void clkPermanent(String feeSAmount, String valueClosure, String replacementClause)
    {
        js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnPermanent);
        //btnPermanent.click();

        Select select=new Select(selectFeeStructure);
        select.selectByValue("Variable in %");
        System.out.println("Fee Structure value is selected");

        WebElement feeAmount=driver.findElement(By.xpath("(//div[normalize-space()='1. Fee Structure']/following::input)[1]"));
        feeAmount.sendKeys(feeSAmount);

        WebElement perClosure=driver.findElement(By.xpath("(//div[contains(normalize-space(), 'Closure')]/following::input)[1]"));
        perClosure.sendKeys(valueClosure);
        System.out.println("Value per closure entered");

        WebElement replacement=driver.findElement(By.xpath("(//div[contains(normalize-space(), 'Clause')]/following::input)[1]"));
        replacement.sendKeys(replacementClause);
        System.out.println("Replacement Clause (No. of Days) entered");
    }

    public void clkSave()
    {
        js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnSave);
        System.out.println("Clicked on the save button");
    }

}
