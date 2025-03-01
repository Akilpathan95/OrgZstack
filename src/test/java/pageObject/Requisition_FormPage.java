package pageObject;

import org.apache.commons.math3.optim.nonlinear.scalar.LineSearch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Requisition_FormPage extends BasePage {

    public Requisition_FormPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//div[@role='presentation']//div//div//select[@id='demo-simple-select' and @name='skillset']")
    WebElement drpSelectTypeCanditate;

    @FindBy(xpath = "//input[@name='job_title']")
    WebElement txtJobTitle;

    @FindBy(xpath = "(//select[@id='demo-simple-select'])[2]")
    WebElement drpPriority;

    @FindBy(xpath = "(//select[@id='demo-simple-select'])[3]")
    WebElement drpBusinessUnit;

    @FindBy(xpath = "(//select[@id='demo-simple-select'])[4]")
    WebElement drpDepartment;

    @FindBy(xpath = "(//select[@id='demo-simple-select'])[5]")
    WebElement drpRequirementType;

    @FindBy(xpath = "//*[name()='path' and contains(@d,'M19 13h-6v')]")
    WebElement btnWorkLocationPlus;

    @FindBy(xpath = "//button[@value='-']//*[name()='svg']")
    WebElement getBtnWorkLocationMinus;

    @FindBy(xpath = "(//input[contains(@placeholder,'Location Name')])[last()]")
    WebElement txtLocationName;

    @FindBy(xpath = "(//input[@placeholder='Position'])[last()]")
    WebElement txtPosition;

    @FindBy(xpath = "//input[@name='number_of_position']")
    WebElement txtTotal_NumberOf_Position;

    @FindBy(xpath = "//input[@name='functional_area']")
    WebElement txtFunctionalArea;

    @FindBy(xpath = "//input[@name='primary_skill']")
    WebElement txtPrimarySkill;

    @FindBy(xpath = "//input[@name='key_skills']")
    WebElement txtKeySkill;

    @FindBy(xpath = "//input[@name='qualification']")
    WebElement txtQualification;

    @FindBy(xpath = "//input[@name='age_from']")
    WebElement txtAgeGroupFrom;

    @FindBy(xpath = "//input[@name='age_to']")
    WebElement txtAgeGroupTo;

    @FindBy(xpath = "//textarea[@name='job_description']")
    WebElement txtJobDescription;

    @FindBy(xpath = "//input[@name='ctc_from']")
    WebElement txtCTCFrom;

    @FindBy(xpath = "//input[@name='ctc_to']")
    WebElement txtCTCTo;

    @FindBy(xpath = "//textarea[@name='remark']")
    WebElement txtRemark;

    @FindBy(xpath = "//input[@name='tat']")
    WebElement txtTAT;

    @FindBy(xpath = "//button[normalize-space()='Reset']")
    WebElement btnReset;

    @FindBy(xpath = "//button[normalize-space()='Submit']")
    WebElement btnSubmit;

    public void clkSelectTypeCanditate()
    {
        Select selectTypeCandidate=new Select(drpSelectTypeCanditate);
        try
        {
            List<WebElement> options=selectTypeCandidate.getOptions();
            for (WebElement option:options)
            {
                System.out.println(option.getText());
            }
            selectTypeCandidate.selectByVisibleText("Semi-Skilled");
        }
        catch (Exception e)
        {
            System.out.println("Option not found");
        }

    }

    public void enterJobTitle(String jobTitle)
    {
        txtJobTitle.sendKeys(jobTitle);
    }

    public void clkPriority()
    {
        Select selectPriority=new Select(drpPriority);
        selectPriority.selectByIndex(2);
    }

    public void clkBusinessUnit()
    {
        Select selectBusinessUnit=new Select(drpBusinessUnit);
        selectBusinessUnit.selectByVisibleText("Informatic Connecting Tech Pvt.Ltd.");
    }

    public void clkDepartment()
    {
        Select selectDepartment=new Select(drpDepartment);
        selectDepartment.selectByValue("Vantage- US IT");
    }

    public void clkRequirementType()
    {
        Select selectReuirementType=new Select(drpRequirementType);
        selectReuirementType.selectByValue("Part Time");
    }

    public void clkWorkLocationPlus()
    {
        btnWorkLocationPlus.click();
    }

    public void clkWorkLocationMinus()
    {
        getBtnWorkLocationMinus.click();
    }

    public void enterLocationName(String location_Name)
    {
        txtLocationName.sendKeys(location_Name);
    }

    public void enterPosition(String position)
    {
        txtPosition.sendKeys(position);
    }

    public void verifytxtTotal_NumberOf_Position()
    {
        System.out.println("Number of Positions are : " + txtTotal_NumberOf_Position.getAttribute("value"));
    }

    public void enterFunctionalArea(String functional)
    {
        txtFunctionalArea.sendKeys(functional);
    }

    public void enterPrimarySkill(String primary_Skill)
    {
        txtPrimarySkill.sendKeys(primary_Skill);
    }

    public void enterKeySkill(String key_Skill)
    {
        txtKeySkill.sendKeys(key_Skill);
    }

    public void enterQualification(String qualification)
    {
        txtQualification.sendKeys(qualification);
    }

    public void enterAgeGroupFrom(String age_Group_From)
    {
        txtAgeGroupFrom.sendKeys(age_Group_From);
    }

    public void enterAgeGroupTo(String age_Group_To)
    {
        txtAgeGroupTo.sendKeys(age_Group_To);
    }

    public void enterJobDescription(String job_Description)
    {
        txtJobDescription.sendKeys(job_Description);
    }

    public void enterCTC_from(String ctc_From)
    {
        txtCTCFrom.sendKeys(ctc_From);
    }

    public void enterCTC_To(String ctc_To)
    {
        txtCTCTo.sendKeys(ctc_To);
    }

    public void enterRemark(String remark)
    {
        txtRemark.sendKeys(remark);
    }

    public void enterTAT(String tat)
    {
        txtTAT.sendKeys(tat);
    }

    public void clkReset()
    {
        btnReset.click();
    }

    public void clkSubmit()
    {
        btnSubmit.click();
    }
}
