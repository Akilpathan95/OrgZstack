package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Payroll_Pages extends BasePage{

    public Payroll_Pages(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//div[normalize-space()='SETUP MASTER']")
    WebElement btnSetupMaster;

    public void clkSetupMaster()
    {
        btnSetupMaster.click();
        System.out.println("Clicked on the Setup Master");
    }
}
