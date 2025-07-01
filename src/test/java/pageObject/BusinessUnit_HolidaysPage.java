package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BusinessUnit_HolidaysPage extends BasePage {

    public BusinessUnit_HolidaysPage(WebDriver driver) {

        super(driver);

    }

    @FindBy(xpath = "//span[normalize-space()='Add New']")
    WebElement btnAddNew;

    @FindBy(name = "name")
    List<WebElement> txtName;

    @FindBy(name = "description")
    List<WebElement> txtDescription;

    @FindBy(xpath = "//input[@type='checkbox']")
    List<WebElement> chkOptionalHoliday;

    @FindBy(name = "reminderDay")
    List<WebElement> txtReminderDay;

    @FindBy(xpath = "//label[contains(text(), 'Holiday')]/following::input[1]")
    WebElement clkHolidayDate;

    @FindBy(xpath = "//span[normalize-space()='OK']")
    WebElement btnOk;

    @FindBy(xpath = "//input[@readonly and @type='text']")
    WebElement clkCalanderYear;

    @FindBy(xpath = "//button[normalize-space()='Save']")
    WebElement btnSave;

    public void enterReminderDay(String reminderDay)
    {
        for (WebElement element : txtReminderDay)
        {
            if (element.isDisplayed())
            {
                element.sendKeys(reminderDay);
                System.out.println("Reminder Day entered");
            }
            else
            {
                System.out.println("Reminder Day field is not displayed");
            }
        }
    }

    public void clkAddNew() {
        btnAddNew.click();
        System.out.println("Add New button clicked");
    }

    public void enterName(String name)
    {

        for (WebElement element : txtName)
        {
            if (element.isDisplayed())
            {
                element.sendKeys(name);
                System.out.println("Name entered");
            }
            else
            {
                System.out.println("Name field is not displayed");
            }
        }
    }

    public void enterDescription(String description)
    {
        for (WebElement element : txtDescription)
        {
            if (element.isDisplayed())
            {
                element.sendKeys(description);
                System.out.println("Description entered");
            }
            else
            {
                System.out.println("Description field is not displayed");
            }
        }
    }

    public void selectOptionalHoliday()
    {
        for (WebElement element : chkOptionalHoliday)
        {
            if (element.isDisplayed())
            {
                element.click();
                System.out.println("Optional Holiday checkbox clicked");
            }
            else
            {
                System.out.println("Optional Holiday checkbox is not displayed");
            }
        }
    }

    public void enterHolidayDate(String date)
    {
        clkHolidayDate.sendKeys(date);
        System.out.println("Date is selected");

        /*String expYearMonth="January 2026";
        String expDate="26";

        while(true)
        {
            String yearMonth=driver.findElement(By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 MuiTypography-alignCenter']")).getText();

            if(yearMonth.equalsIgnoreCase(expYearMonth.trim()))
            {
                System.out.println("Year and month selected");
                break;
            }

            driver.findElement(By.xpath("//div[contains(@class, 'MuiPickersBasePicker')]//button[2]//*[name()='svg']")).click();
            System.out.println("Forward button is clicked");

        }
        List<WebElement> alldates=driver.findElements(By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiPickersDay-day']"));
        for(WebElement dt:alldates)
        {
            if(dt.getText().equals(expDate))
            {
                dt.click();
                System.out.println("Date selected");
                break;
            }
            else
            {
                System.out.println("Date is not present");
            }
        }

        btnOk.click();
        System.out.println("Clicked on the OK button");*/
    }

    public void selectCalanderYear()
    {
        clkCalanderYear.click();

        driver.findElement(By.xpath("//div[normalize-space()='2026']")).click();
        System.out.println("Calender year selected");

        btnOk.click();
    }

    public void clkSaveButton()
    {
        btnSave.click();
        System.out.println("Clicked on Save button");
    }
}
