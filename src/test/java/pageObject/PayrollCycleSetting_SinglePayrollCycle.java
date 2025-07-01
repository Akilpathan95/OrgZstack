package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PayrollCycleSetting_SinglePayrollCycle extends BasePage{

    public PayrollCycleSetting_SinglePayrollCycle(WebDriver driver)
    {
        super(driver);
    }

    Select select;

    @FindBy(xpath = "//div[@class='css-19bb58m']")
    WebElement drpSelectBusinessUnit;

    @FindBy(xpath = "(//select[@class='h-8 mt-4'])[1]")
    WebElement drpFromeDate;

    @FindBy(xpath = "//input[@value='Exclude weekly off and holidays']")
    WebElement optAttendanceMarkingSetup;

    @FindBy(xpath = "//input[@value='Attendance Capture from Orgzstack']")
    WebElement optAttendanceCaptureMode;

    @FindBy(xpath = "//span[normalize-space()='Summary Attendance']")
    WebElement optTypeOfAttends;

    @FindBy(xpath = "//button[normalize-space()='Save']")
    WebElement btnSave;

    public void clkSelectBusinessUnit()
    {
        drpSelectBusinessUnit.click();
        System.out.println("Clicked on the Select Business Unit");

        WebElement selectBusinessUnit=driver.findElement(By.xpath("//div[@class='css-d7l1ni-option']"));
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(selectBusinessUnit));
        selectBusinessUnit.click();
        System.out.println("Business Unit selected");
    }

    public void selectFromDate()
    {
        select=new Select(drpFromeDate);
        select.selectByVisibleText("14");
        System.out.println("From Date selected");

    }

    public void selectAttendanceMarkingSetup()
    {
        optAttendanceMarkingSetup.click();
        System.out.println("Attendance Marking Setup is selected");
    }

    public void selectAttendanceCaptureMode()
    {
        optAttendanceCaptureMode.click();
        System.out.println("Attendance Capture Mode is selected");
    }

    public void selectTypeOfAttends()
    {
        optTypeOfAttends.click();
        System.out.println("Type Of Attends is selected");
    }

    public void clkSave()
    {
        btnSave.click();
        System.out.println("Clicked on the save button");
    }
}
