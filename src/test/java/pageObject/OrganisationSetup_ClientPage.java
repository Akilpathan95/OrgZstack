package pageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class OrganisationSetup_ClientPage extends BasePage{

    public OrganisationSetup_ClientPage(WebDriver driver)
    {
        super(driver);
    }

    WebDriverWait wait;
    String path;

    @FindBy(xpath = "//input[@placeholder=\"Search by client name\"]")
    WebElement txtSearchClient;

    @FindBy(xpath = "//input[@name=\"client_name\"]")
    WebElement txtClientName;

    public WebElement getEditIconByBUName(String buName)
    {
        String buNameByName="//table//tr[td[2][normalize-space()='" + buName + "']]//button//*[name()='svg']";
        return driver.findElement(By.xpath(buNameByName));
    }

    @FindBy(xpath = "(//label[normalize-space()='Country']/following::div[@class=' css-b62m3t-container'])[1]")
    WebElement selectCountry;

    @FindBy(xpath = "(//label[normalize-space()='State']/following::div[@class=' css-6j8wv5-Input'])[1]")
    WebElement selectState;

    @FindBy(xpath = "(//label[normalize-space()='City']/following::div[@class=' css-6j8wv5-Input'])[1]")
    WebElement selectCity;

    public void clkCountry()
    {
        selectCountry.click();
        System.out.println("CLicked on the country dropdown");
        WebElement country=driver.findElement(By.xpath("//div[normalize-space()='India (IN)']"));
        country.click();
        System.out.println("Country selected");
    }

    public void clkState()
    {
        selectState.click();
        System.out.println("Clicked on the state button");
        WebElement state=driver.findElement(By.xpath("//div//div//div//div[normalize-space()='Maharashtra']"));
        state.click();
        System.out.println("State selected");
    }

    public void clkCity()
    {
        selectCity.click();
        System.out.println("Clicked on the city dropdown");
        WebElement city=driver.findElement(By.xpath("//div//div//div//div[normalize-space()='Mumbai']"));
        city.click();
        System.out.println("City selected");
    }

    @FindBy(xpath = "(//label[normalize-space()='Acquired By']/following::div[@class=' css-319lph-ValueContainer'])[1]")
    WebElement selectAcquiredBy;

    @FindBy(xpath = "(//label[normalize-space()='Account Manager']/following::div[@class=' css-319lph-ValueContainer'])[1]")
    WebElement selectAccManager;

    public void clkAcquiredBy()
    {
        selectAcquiredBy.click();
        System.out.println("Acquired By drop down is opened");
        WebElement acquired=driver.findElement(By.xpath("//div[normalize-space()='Akil Pathan'][1]"));
        acquired.click();
        System.out.println("Acquired By selected");
    }

    public void clkAccManager()
    {
        selectAccManager.click();
        System.out.println("Account Manager dropdown is opened");
        WebElement manager=driver.findElement(By.xpath("//div[@id='react-select-6-option-1302']"));
        manager.click();
        System.out.println("Account Manager selected");
    }

    public WebElement getEditIconByBusinessUnit(String buName)
    {
        String buNameByName="//table//tr[td[2][normalize-space()='"+buName+"']]//button//*[name()='svg']";
        return driver.findElement(By.xpath(buNameByName));
    }

    @FindBy(xpath = "//input[@name=\"client_code\"]")
    WebElement txtClientCode;

    @FindBy(xpath = "//input[@name=\"address1\"]")
    WebElement txtAddress;

    public void enterLine2(String line2)
    {
        txtLine2.sendKeys(Keys.CONTROL + "a");
        txtLine2.sendKeys(Keys.DELETE);
        txtLine2.sendKeys(line2);
    }

    @FindBy(xpath = "//input[@name='line_2']")
    WebElement txtLine2;

    @FindBy(xpath = "//input[@type='file']")
    List<WebElement> addLogo;

    @FindBy(xpath = "//label[text()='Country']/following::div[@id='demo-simple-select'][1]")
    WebElement drpCountry;

    @FindBy(xpath = "//label[text()='State']/following::div[@id='demo-simple-select'][1]")
    WebElement drpState;

    @FindBy(xpath = "//input[@name=\"city\"]")
    WebElement txtCity;

    @FindBy(xpath = "//input[@name=\"phone_number\"]")
    WebElement txtPhoneNumber;

    @FindBy(xpath = "//input[@name=\"mobile_number\"]")
    WebElement txtMobileNumber;

    @FindBy(xpath = "//input[@name=\"email\"]")
    WebElement txtEmail;

    @FindBy(xpath = "(//label[normalize-space()='Segment']/following::div[@aria-haspopup=\"listbox\"])[1]")
    WebElement drpSegment;

    @FindBy(xpath = "//input[@name=\"website\"]")
    WebElement txtWebsite;

    @FindBy(xpath = "(//label[normalize-space()='Services']/following::div[@aria-haspopup=\"listbox\"])[1]")
    WebElement drpServices;

    @FindBy(xpath = "//input[@name=\"gstin\"]")
    WebElement txtGST;

    @FindBy(xpath = "//input[@name=\"pan\"]")
    WebElement txtPan;

    @FindBy(xpath = "//input[@name=\"tan\"]")
    WebElement txtTan;

    @FindBy(xpath = "//input[@type='file']")
    List<WebElement> addAgreementCopy;

    @FindBy(xpath = "(//input[@id='date-picker-dialog'])[1]")
    WebElement drpAgreementStartDate;

    @FindBy(xpath = "(//input[@id='date-picker-dialog'])[2]")
    WebElement drpAgreementEndDate;

    @FindBy(xpath = "//input[@placeholder=\"Name\"]")
    WebElement txtName;

    @FindBy(xpath = "//input[@placeholder=\"Email ID\"]")
    WebElement txtEmailID;

    @FindBy(xpath = "//input[@placeholder=\"Mobile No.\"]")
    WebElement txtMobileNo;

    @FindBy(xpath = "//input[@placeholder=\"Designation\"]")
    WebElement txtDesignation;

    @FindBy(xpath = "//button[normalize-space()=\"Add SPOC\"]")
    WebElement btnAddSPOC;

    @FindBy(xpath = "//button[normalize-space()=\"Save\"]")
    WebElement btnSave;

    @FindBy(xpath = "//span[normalize-space()=\"Add New\"]")
    WebElement btnAddNew;

    @FindBy(xpath = "//input[@name='industry']")
    WebElement txtIndustry;

    @FindBy(xpath = "//button[normalize-space()='Update']")
    WebElement btnUpdate;

    @FindBy(tagName="body")
    WebElement body;

    public void clkUpdate()
    {
        btnUpdate.click();
    }

    public void clkAddNew()
    {
        btnAddNew.click();
    }

    public void enterClientName(String clientName)
    {
        txtClientName.sendKeys(clientName);
    }

    public void inputSearchClient(String search)
    {
        txtSearchClient.sendKeys(search);
        System.out.println("Client searched successfully");
    }

    public void clkEditAction()
    {
        WebElement clkbuName=getEditIconByBUName("AkilTesting");
        clkbuName.click();
        System.out.println("Clicked on Edit Action");
    }

    public void clkEditBusinessUnit()
    {
        WebElement clkbuName=getEditIconByBusinessUnit("IT123");
        clkbuName.click();
        System.out.println("Clicked on Edit Action");
    }

    public void selectAgreementCopy()
    {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].style.display='block';", addAgreementCopy.get(0));

            path=System.getProperty("user.dir") + "/src/test/resources/foundit_Sanket-profile.pdf";
            addAgreementCopy.get(1).sendKeys(path);

            BasePage bp=new BasePage(driver);
            bp.handleAlert();
            System.out.println("Agreement Copy is added");
        }
        catch (Exception e)
        {
            System.out.println("Exception Occured : " + e.getMessage());
        }

    }

    public void selectAgreementStartDate(String anniversary)
    {
        drpAgreementStartDate.sendKeys(Keys.CONTROL + "a");
        drpAgreementStartDate.sendKeys(Keys.DELETE);
        System.out.println("Anniversary field is cleared");
        drpAgreementStartDate.sendKeys(anniversary);
        System.out.println("Anniversary Date is added");
    }

    public void selectAgreementEndDate(String dob)
    {
        drpAgreementEndDate.sendKeys(Keys.CONTROL + "a");
        drpAgreementEndDate.sendKeys(Keys.DELETE);
        System.out.println("DOB field is cleared");
        drpAgreementEndDate.sendKeys(dob);
        System.out.println("DOB is added");
    }

    public void inputClientCode(String code)
    {
        txtClientCode.sendKeys(Keys.CONTROL + "a");
        txtClientCode.sendKeys(Keys.DELETE);
        System.out.println("Clear the code text field");
        txtClientCode.sendKeys(code);
        System.out.println("Client code added");
    }

    public void inputAddress(String address)
    {
        txtAddress.sendKeys(Keys.CONTROL + "a");
        txtAddress.sendKeys(Keys.DELETE);
        System.out.println("Clear the address text field");
        txtAddress.sendKeys(address);
        System.out.println("Address is added");
    }

    public void selectCountry()
    {
        drpCountry.click();
        driver.findElement(By.xpath("//li[normalize-space()=\"India\"]")).click();
        System.out.println("Country is selected");
    }

    public void selectState()
    {
        drpState.click();
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement state = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='Maharashtra']")));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", state);
        System.out.println("State is selected");
    }

    public void inputCity(String city)
    {
        txtCity.sendKeys(Keys.CONTROL + "a");
        txtCity.sendKeys(Keys.DELETE);
        System.out.println("City field is cleared");
        txtCity.sendKeys(city);
        System.out.println("City is added");
    }

    public void inputPhoneNUmber(String phone)
    {
        txtPhoneNumber.sendKeys(Keys.CONTROL + "a");
        txtPhoneNumber.sendKeys(Keys.DELETE);
        System.out.println("Phone Number field is cleared");
        txtPhoneNumber.sendKeys(phone);
        System.out.println("Phone number field is added");
    }

    public void inputMobileNumber(String mobile)
    {
        txtMobileNumber.sendKeys(Keys.CONTROL + "a");
        txtMobileNumber.sendKeys(Keys.DELETE);
        System.out.println("Mobile Number field is cleared");
        txtMobileNumber.sendKeys(mobile);
        System.out.println("Mobile Number is added");
    }

    public void inputEmail(String email)
    {
        txtEmail.sendKeys(Keys.CONTROL + "a");
        txtEmail.sendKeys(Keys.DELETE);
        System.out.println("Email field is cleared");
        txtEmail.sendKeys(email);
        System.out.println("Email is added");
    }

    public void selectSegment()
    {
        drpSegment.click();
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement segment=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()=\"IT Staffing\"]")));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", segment);
        // After selecting dropdown value
        body.click();
        System.out.println("Segment added successfully.");
    }

    public void inputWebsite(String website)
    {
        txtWebsite.sendKeys(Keys.CONTROL + "a");
        txtWebsite.sendKeys(Keys.DELETE);
        System.out.println("Website field is cleared");
        txtWebsite.sendKeys(website);
        System.out.println("Website is added");
    }

    public void selectServices()
    {
        drpServices.click();
        driver.findElement(By.xpath("//li[normalize-space()=\"Workforce Management\"]")).click();
        // After selecting dropdown value
        body.click();
        System.out.println("Workforce Management added");
    }

    public void inputPan(String pan)
    {
        txtPan.sendKeys(Keys.CONTROL + "a");
        txtPan.sendKeys(Keys.DELETE);
        System.out.println("Pan field is cleared");
        txtPan.sendKeys(pan);
        System.out.println("Pan is added");
    }

    public void inputTan(String tan)
    {
        txtTan.sendKeys(Keys.CONTROL + "a");
        txtTan.sendKeys(Keys.DELETE);
        System.out.println("Tan field is cleared");
        txtTan.sendKeys(tan);
        System.out.println("Tan is added");
    }

    public void inputGST(String gst)
    {
        txtGST.sendKeys(Keys.CONTROL + "a");
        txtGST.sendKeys(Keys.DELETE);
        System.out.println("GST field is cleared");
        txtGST.sendKeys(gst);
        System.out.println("GST is added");
    }

    public void selectLogo()
    {
        try {
            path=System.getProperty("user.dir") + "/src/test/resources/ipsImage.jpg";
            addLogo.get(0).sendKeys(path);            BasePage bp=new BasePage(driver);
            bp.handleAlert();
            System.out.println("Logo is added");
        }
        catch (Exception e)
        {
            System.out.println("Exception Occured : " + e.getMessage());
        }

    }

    public void inputName(String name)
    {
        txtName.sendKeys(Keys.CONTROL + "a");
        txtName.sendKeys(Keys.DELETE);
        System.out.println("Input Name field is cleared");
        txtName.sendKeys(name);
        System.out.println("Name is added");
    }

    public void inputDesignation(String designation)
    {
        txtDesignation.sendKeys(Keys.CONTROL + "a");
        txtDesignation.sendKeys(Keys.DELETE);
        System.out.println("Designation field is cleared");
        txtDesignation.sendKeys(designation);
        System.out.println("Designation is added");
    }

    public void inputMobileNo(String mobile)
    {
        txtMobileNo.sendKeys(Keys.CONTROL + "a");
        txtMobileNo.sendKeys(Keys.DELETE);
        System.out.println("Mobile No field is cleared");
        txtMobileNo.sendKeys(mobile);
        System.out.println("Mobile No is added");
    }

    public void inputEmailID(String email)
    {
        txtEmailID.sendKeys(Keys.CONTROL + "a");
        txtEmailID.sendKeys(Keys.DELETE);
        System.out.println("Email ID field is cleared");
        txtEmailID.sendKeys(email);
        System.out.println("Email ID is added");
    }

    public void clkAddSPOC()
    {
        btnAddSPOC.click();
        System.out.println("Add button is clicked");
    }

    public void clkSaveClient()
    {
        btnSave.click();
        System.out.println("Save button is clicked");
    }

    public void contractual(String Monfees, String Soufees, String payTerms)
    {
        JavascriptExecutor js=(JavascriptExecutor) driver;

        WebElement monthly=driver.findElement(By.xpath("(//label[normalize-space()='Fee Type']/following::div[@aria-haspopup=\"listbox\"])[1]"));
        monthly.click();
        System.out.println("Clicked on the fee type");
        WebElement feeType=driver.findElement(By.xpath("//li[normalize-space()='Variable in %']"));
        feeType.click();
        System.out.println(" Fee type Value select from the dropdown");
        WebElement fees=driver.findElement(By.xpath("//input[@name='monthlyServiceFee']"));
        fees.sendKeys(Keys.CONTROL + "a");
        fees.sendKeys(Keys.DELETE);
        fees.sendKeys(Monfees);
        System.out.println("Entered the Monthly fees");

        WebElement sourcing=driver.findElement(By.xpath("(//label[normalize-space()='Fee Type']/following::div[@aria-haspopup=\"listbox\"])[2]"));
        sourcing.click();
        System.out.println("Sourcing fee selected");
        WebElement feeType1=driver.findElement(By.xpath("//li[normalize-space()='Variable in %']"));
        feeType1.click();
        System.out.println("Sourcing fee value selected from the dropdown");
        WebElement fees1=driver.findElement(By.xpath("//input[@name='sourcingFee']"));
        fees1.sendKeys(Keys.CONTROL + "a");
        fees1.sendKeys(Keys.DELETE);
        fees1.sendKeys(Soufees);
        System.out.println("Entered the sourcing fees");

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement startDate=driver.findElement(By.xpath("//div[contains(@id,'payrollStartDate')]"));
        startDate.click();
        WebElement start=driver.findElement(By.xpath("//li[@data-value='2']"));
        wait.until(ExpectedConditions.visibilityOf(start));
        js.executeScript("arguments[0].click();",start);
        System.out.println("Start date selcted");

        WebElement endDate=driver.findElement(By.xpath("//div[contains(@id,'payrollEndDate')]"));
        endDate.click();
        WebElement end=driver.findElement(By.xpath("//li[@data-value='7']"));
        wait.until(ExpectedConditions.visibilityOf(end));
        js.executeScript("arguments[0].click();", end);
        System.out.println("End Date selected");

        WebElement invoice=driver.findElement(By.xpath("//div[contains(@id,'invoiceSubmissionDate')]"));
        invoice.click();
        WebElement submissionDate=driver.findElement(By.xpath("//li[@data-value='1']"));
        wait.until(ExpectedConditions.visibilityOf(submissionDate));
        js.executeScript("arguments[0].click();", submissionDate);
        System.out.println("Invoice submission date selcted");

        WebElement paymentTerms=driver.findElement(By.xpath("//input[@name='paymentTerms']"));
        paymentTerms.sendKeys(payTerms);
        System.out.println("Entered Payments Terms");

        WebElement absorption=driver.findElement(By.xpath("//div[contains(@id,'absorptionFeeApplicable')]"));
        absorption.click();
        WebElement absorptionFees=driver.findElement(By.xpath("//li[@data-value='yes']"));
        absorptionFees.click();
        System.out.println("Absorption Fees selcted");
        String selectedValue=absorptionFees.getText();
        if ("yes".equalsIgnoreCase(selectedValue))
        {
            WebElement duration=driver.findElement(By.xpath("//input[@name='absorptionFeeDuration']"));
            duration.sendKeys(Keys.CONTROL + "a");
            duration.sendKeys(Keys.DELETE);
            duration.sendKeys("12");
            System.out.println("Entered the duration");

            WebElement feetypedrp=driver.findElement(By.xpath("//div[@id='mui-component-select-absorptionFeeType']"));
            feetypedrp.click();

            WebElement feetypevalue=driver.findElement(By.xpath("//li[@data-value='Variable in %']"));
            feetypevalue.click();
            System.out.println("Value select from the Fee Type dropdown");

            WebElement amount=driver.findElement(By.xpath("//input[@name='absorptionFee']"));
            amount.sendKeys(Keys.CONTROL + "a");
            amount.sendKeys((Keys.DELETE));
            amount.sendKeys("10000");

        }
        else
        {
            System.out.println("No new field to print");
        }

    }

    public void permanent(String Monfees)
    {
        WebElement permanent1=driver.findElement(By.xpath("//span[normalize-space()=\"Permanent\"]"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", permanent1);

        WebElement monthly1=driver.findElement(By.xpath("(//label[normalize-space()='Fee Type']/following::div[@aria-haspopup=\"listbox\"])[1]"));
        js.executeScript("arguments[0].scrollIntoView({block:'center',inline:'nearest'});",monthly1);
        monthly1.click();
        System.out.println("Clicked on the fee type");

        WebElement feeType1=driver.findElement(By.xpath("//li[normalize-space()='Variable in %']"));
        feeType1.click();
        System.out.println(" Fee type Value select from the dropdown");

        WebElement fees1=driver.findElement(By.xpath("//input[@name='monthlyServiceFee']"));
        fees1.sendKeys(Keys.CONTROL + "a");
        fees1.sendKeys(Keys.DELETE);
        fees1.sendKeys(Monfees);
        System.out.println("Entered the Monthly fees");

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement from=driver.findElement(By.xpath("//div[@id='mui-component-select-from']"));
        from.click();
        WebElement fromYear=driver.findElement(By.xpath("//li[@data-value='2']"));
        wait.until(ExpectedConditions.visibilityOf(fromYear));
        js.executeScript("arguments[0].click();",fromYear);
        System.out.println("Experience From selcted");

        WebElement to=driver.findElement(By.xpath("//div[@id='mui-component-select-to']"));
        to.click();
        WebElement toYear=driver.findElement(By.xpath("//li[@data-value='7']"));
        wait.until(ExpectedConditions.visibilityOf(toYear));
        js.executeScript("arguments[0].click();", toYear);
        System.out.println("Experience To selected");

        WebElement replacementPeriod=driver.findElement(By.xpath("//input[@name='replacementPeriod']"));
        replacementPeriod.sendKeys(Keys.CONTROL + "a");
        replacementPeriod.sendKeys(Keys.DELETE);
        replacementPeriod.sendKeys("500");

        WebElement invoiceRaised=driver.findElement(By.xpath("//input[@name='invoiceRaised']"));
        invoiceRaised.sendKeys(Keys.CONTROL + "a");
        invoiceRaised.sendKeys(Keys.DELETE);
        invoiceRaised.sendKeys("500");

        WebElement paymentTerms=driver.findElement(By.xpath("//input[@name='paymentTerms']"));
        paymentTerms.sendKeys("7");
    }

    @FindBy(xpath = "//select[@name='bonusPayable']")
    WebElement bonusDrp;

    public void selectBonus()
    {
        Select select=new Select(bonusDrp);
        select.selectByValue("yes");
        System.out.println("Bonus option is selected");
    }

    @FindBy(xpath = "//button[normalize-space()='Add']")
    WebElement btnAdd;

    public void clkAdd()
    {
        btnAdd.click();
        System.out.println("Clicked on the Add button");
    }

    public void enterIndustry(String industry)
    {
        txtIndustry.sendKeys(Keys.CONTROL + "a");
        txtIndustry.sendKeys(Keys.DELETE);
        txtIndustry.sendKeys(industry);
    }

    @FindBy(xpath = "(//div[@class=' css-319lph-ValueContainer'])[1]")
    WebElement buCountry;

    @FindBy(xpath = "(//div[@class=' css-319lph-ValueContainer'])[2]")
    WebElement buState;

    @FindBy(xpath = "(//div[@class=' css-319lph-ValueContainer'])[3]")
    WebElement buCity;

    public void buCountry1()
    {
        buCountry.click();
        WebElement country=driver.findElement(By.xpath("//div[normalize-space()='India (IN)']"));
        country.click();
        System.out.println("Country selected");
    }

    public void buState1()
    {
        buState.click();
        WebElement state=driver.findElement(By.xpath("//div//div//div//div[normalize-space()='Maharashtra']"));
        state.click();
        System.out.println("State selected");
    }

    public void buCity1()
    {
        buCity.click();
        WebElement city=driver.findElement(By.xpath("//div//div//div//div[normalize-space()='Mumbai']"));
        city.click();
        System.out.println("City has been selected");
    }
}