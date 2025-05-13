package pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;

public class LeftMenuPage extends BasePage {

    public LeftMenuPage(WebDriver driver)
    {
        super(driver);
    }

    WebDriverWait wait;

    @FindBy(xpath = "//div[@class='jss92']//div[contains(text(), 'Requisition')]")
    WebElement btnRequisition;

    @FindBy(xpath = "//div[contains(text(),\"Organisation Setup\")]")
    WebElement btnOrganisationSetup;

    @FindBy(xpath = "//div[normalize-space()='ORG.INFO']")
    WebElement btnOrgInfo;

    @FindBy(xpath = "//div[contains(text(),'Reimbursement')]")
    WebElement btnReimbursement;

    @FindBy(xpath = "//li/div[contains(text(), 'ZONE')]")
    WebElement btnZone;

    @FindBy(xpath = "//div[text()='BRANCHES']")
    WebElement btnBranch;

    @FindBy(xpath = "//div[text()='DIVISION']")
    WebElement btnDivision;

    @FindBy(xpath = "//div[text()='DEPARTMENT']")
    WebElement btnDepartment;

    @FindBy(xpath = "//div[text()='DESIGNATION']")
    WebElement btnDesignation;

    @FindBy(xpath = "//div[text()='CLIENT']")
    WebElement btnClient;

    @FindBy(xpath = "//li/div[contains(text(), 'LOCATION')]")
    WebElement btnLocation;

    @FindBy(xpath = "//div[text()='GRADE']")
    WebElement btnGrade;

    @FindBy(xpath = "//div[text()=\"Business Unit\"]")
    WebElement btnBusinessUnit;

    public void clkRequisition()
    {
        btnRequisition.click();
    }

    public void clkOrganisationSetup()
    {
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(btnOrganisationSetup));
        btnOrganisationSetup.click();
    }

    public void clkOrgInfo()
    {
        btnOrgInfo.click();
    }

    public boolean zoneVisible()
    {
        try
        {
            return btnZone.isDisplayed();
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public void clkZone()
    {

        if (!zoneVisible())
        {
            clkOrganisationSetup();
        }
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(btnZone));
        btnZone.click();
    }

    public void clkReimbursement()
    {
        btnReimbursement.click();
    }

    public boolean branchVisible()
    {
        try
        {
            return btnBranch.isDisplayed();
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public void clkBranch()
    {
        if (!branchVisible())
        {
            clkOrganisationSetup();
        }
        btnBranch.click();
    }

    public boolean divisionVisible()
    {
        try
        {
            return btnDivision.isDisplayed();
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public void clkDivision()
    {
        if (!divisionVisible())
        {
            clkOrganisationSetup();
        }
        btnDivision.click();
    }

    public boolean departmentVisible()
    {
        try {
            return btnDepartment.isDisplayed();
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public void clkDepartment()
    {
        if (!departmentVisible())
        {
            clkOrganisationSetup();
        }
        btnDepartment.click();
    }

    public boolean designationVisible()
    {
        try {
            return btnDesignation.isDisplayed();
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public void clkDesignation()
    {
        if (!designationVisible())
        {
            clkOrganisationSetup();
        }
        btnDesignation.click();
    }

    public boolean clientVisible()
    {
        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnClient);
            Thread.sleep(500); // optional, to allow scroll animation to finish
            return btnClient.isDisplayed();
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public void clkClient()
    {
        if (!clientVisible())
        {
            clkOrganisationSetup();
        }
        btnClient.click();
    }

    public boolean locationVisible()
    {
        try {
            return btnLocation.isDisplayed();
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public void clkLocation()
    {
        if (!locationVisible())
        {
            clkOrganisationSetup();
        }
        btnLocation.click();
    }

    public boolean gradeVisible()
    {
        try {
            return btnGrade.isDisplayed();
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public void clkGrade()
    {
        if (!gradeVisible())
        {
            clkOrganisationSetup();
        }
        btnGrade.click();
    }

    public void clkBusinessUnit()
    {
        btnBusinessUnit.click();
    }
}
