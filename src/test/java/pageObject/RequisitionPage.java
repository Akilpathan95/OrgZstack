package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RequisitionPage extends BasePage{

    public RequisitionPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//div[normalize-space()='REQUISITION']")
    WebElement btnRequitionPage;

    @FindBy(xpath = "//p[@class='font-sans font-bold leading-5 text-sm']")
    WebElement btnCreateRequisition;

    @FindBy (xpath = "//button[normalize-space()='Create Requsition']")
    WebElement btnCreateRequisitionPopUp;

    public void clkRequitionPage()
    {
        btnRequitionPage.click();
    }

    public void clkCreateRequisition()
    {
        btnCreateRequisition.click();
    }

    public void clkCreateRequisitionPopUp()
    {
        btnCreateRequisitionPopUp.click();
    }

}
