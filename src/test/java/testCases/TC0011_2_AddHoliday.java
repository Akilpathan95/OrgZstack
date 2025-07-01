package testCases;

import org.testng.annotations.Test;
import pageObject.*;
import testBase.BaseClass;

public class TC0011_2_AddHoliday extends BaseClass {

    LeftMenuPage lp;

    @Test(priority = 3)
    public void verify_clkBusinessUnit()
    {
        lp=new LeftMenuPage(driver);
        lp.clkBusinessUnit();
    }

    @Test(priority = 4)
    public void verify_clkEditBusinessUnit()
    {
        OrganisationSetup_ClientPage cp=new OrganisationSetup_ClientPage(driver);
        cp.clkEditBusinessUnit();
    }

    @Test(priority = 5)
    public void verify_AddHolidays() {
        BusinessUnitPage bu = new BusinessUnitPage(driver);
        bu.clkHolidays();
        BusinessUnit_HolidaysPage bh = new BusinessUnit_HolidaysPage(driver);
        bh.clkAddNew();
        bh.enterName("Rhutik");
        bh.enterDescription("Ganesh Chaturthi");
        bh.selectOptionalHoliday();
        bh.enterReminderDay("3");
        bh.enterHolidayDate("10/07/2025");
        bh.selectCalanderYear();
        bh.clkSaveButton();
        BasePage bp=new BasePage(driver);
        bp.handleAlert();
    }
}
