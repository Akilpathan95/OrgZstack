package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PayrollOvertimePaymentSetup extends BasePage{

    public PayrollOvertimePaymentSetup(WebDriver driver)
    {
        super(driver);
    }

    Select select;

    @FindBy(xpath = "//select[@class='rounded-md bg-white']")
    WebElement selectBusinessUnit;

    @FindBy(xpath = "//input[@value='Option1']")
    WebElement selectOption1;

    @FindBy(xpath = "//input[@value='Option2']")
    WebElement selectOption2;

    @FindBy(xpath = "//select[@class='h-8 mt-4']")
    WebElement selectRatio;

    @FindBy(xpath = "//select[@placeholder='Select Date']")
    WebElement selectDate;

    @FindBy(xpath = "//button[normalize-space()='Save']")
    WebElement btnSave;

    public void clkBusinessUnit()
    {
        select=new Select(selectBusinessUnit);
        select.selectByVisibleText("BU");
        System.out.println("Clicked on the Select Business Unit");
    }

    public void clkOption1()
    {
        selectOption1.click();
        System.out.println("Option 1 selected");

        WebElement includeWeekly=driver.findElement(By.xpath("//input[@value='Include weekly off and holidays']"));
        WebElement overtimeHours=driver.findElement(By.xpath("//input[@value='Hours']"));
        WebElement overtimeBasicSalary=driver.findElement(By.xpath("//input[@value='Basic']"));
        select=new Select(selectRatio);

        WebElement excludeWeekly=driver.findElement(By.xpath("//input[@value='Exclude weekly off and holidays']"));
        WebElement overtimeDays=driver.findElement(By.xpath("//input[@value='Days']"));
        WebElement overtimeGrossSalary=driver.findElement(By.xpath("//input[@value='Gross']"));

        if (!includeWeekly.isSelected())
        {
            includeWeekly.click();
            System.out.println("Include Weekly off and holidays option is selected");

            overtimeHours.click();
            System.out.println("Overtime Hours selected");

            overtimeBasicSalary.click();
            System.out.println("Basic salary option is selected");

            select.selectByVisibleText("2");
            System.out.println("Overtime Calculation ration is selected");
        }
        else
        {
            excludeWeekly.click();
            System.out.println("Exclude Weekly off and holidays option is selected");

            overtimeDays.click();
            System.out.println("Overtime Days selected");

            overtimeGrossSalary.click();
            System.out.println("Gross salary option is selected");

            select.selectByVisibleText("4");
            System.out.println("Overtime Calculation ration is selected");
        }
    }

    public void clkOption2(String num)
    {
        selectOption2.click();
        System.out.println("Option 2 is selected");

        WebElement enterNumber=driver.findElement(By.xpath("//input[@type='number']"));
        enterNumber.sendKeys(Keys.CONTROL + "a");
        enterNumber.sendKeys(Keys.DELETE);
        enterNumber.sendKeys(num);
        System.out.println("Number is entered");

        select=new Select(selectDate);
        select.selectByVisibleText("Hours");

        List<WebElement> options=select.getOptions();

        boolean isHoursAvailable=false;

        for (WebElement option : options)
        {
            if (option.getText().equals("Hours"))
            {
                isHoursAvailable=true;
                break;
            }
        }

        if (isHoursAvailable)
        {
            select.selectByVisibleText("Hours");
            System.out.println("Selected Hours from the Dropdown");
        }
        else
        {
            select.selectByVisibleText("Days");
            System.out.println("selected Days from the Dropdown");
        }

    }

    public void clkSave()
    {
        btnSave.click();
        System.out.println("Clicked on the Save button");
    }
}
