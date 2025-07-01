package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PayrollPayslipHeader extends BasePage{

    public PayrollPayslipHeader(WebDriver driver)
    {
        super(driver);
    }

    JavascriptExecutor js=(JavascriptExecutor) driver;

    @FindBy(xpath = "//button[normalize-space()='Add New']")
    WebElement btnAddNew;

    @FindBy(xpath = "//div[@aria-label='Example Modal']//div[@class='css-19bb58m']")
    WebElement drpSelectBusinessUnit;

    @FindBy(xpath = "//input[@type='file']")
    WebElement addFile;

    @FindBy(xpath = "//button[normalize-space()='Save']")
    WebElement btnSave;

    public void clkAddNew()
    {
        btnAddNew.click();
        System.out.println("Clicked on the Add New button");
    }

    public void selectBusinessUnit()
    {
        drpSelectBusinessUnit.click();
        System.out.println("Clicked on the Select Business unit dropdown");

        WebElement option=driver.findElement(By.xpath("//div[text()=\"BU\"]"));
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(option));

        js.executeScript("arguments[0].click();",option);
        System.out.println("Option is selected");
    }

    public void selectFile()
    {
        String path=System.getProperty("user.dir") + "/src/test/resources/foundit_Sanket-profile.pdf";
        addFile.sendKeys(path);
        System.out.println("File added");
    }

    public void clkSave()
    {
        js.executeScript("arguments[0].scrollIntoView(true);", btnSave);
        System.out.println("Page has been scroll down");
        btnSave.click();
        System.out.println("Clicked on the Save button");
    }
}
