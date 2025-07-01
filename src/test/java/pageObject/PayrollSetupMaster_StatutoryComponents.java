package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayrollSetupMaster_StatutoryComponents extends BasePage{

    public PayrollSetupMaster_StatutoryComponents(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//div[normalize-space()='EPF']")
    WebElement btnEPF;

    @FindBy(xpath = "//div[normalize-space()='ESI']")
    WebElement btnESI;

    @FindBy(xpath = "//div[normalize-space()='Professional Tax']")
    WebElement btnProfessionalTax;

    @FindBy(xpath = "//div[normalize-space()='LWF']")
    WebElement btnLWF;

    @FindBy(xpath = "//div[normalize-space()='TDS']")
    WebElement btnTDS;

    @FindBy(xpath = "//div[normalize-space()='Bonus']")
    WebElement btnBonus;

    @FindBy(xpath = "//div[normalize-space()='Leave Wage']")
    WebElement btnLeaveWage;

    @FindBy(xpath = "//div[normalize-space()='Gratuity']")
    WebElement btnGratuity;

    public void clkEPF()
    {
        btnEPF.click();
        System.out.println("Clicked on the EPF");
    }

    public void clkESI()
    {
        btnESI.click();
        System.out.println("Clicked on the ESI");
    }

    public void clkProfessionalTax()
    {
        btnProfessionalTax.click();
        System.out.println("Clicked on the Professional Tax");
    }

    public void clkLWF()
    {
        btnLWF.click();
        System.out.println("Clicked on the LWF");
    }

    public void clkTDS()
    {
        btnTDS.click();
        System.out.println("Clicked on the TDS");
    }

    public void clkBonus()
    {
        btnBonus.click();
        System.out.println("Clicked on the Bonus");
    }

    public void clkLeaveWage()
    {
        btnLeaveWage.click();
        System.out.println("Clicked on the Leave Wage");
    }

    public void clkGratuity()
    {
        btnGratuity.click();
        System.out.println("Clicked on the Gratuity");
    }
}
