package testCases;

import org.testng.annotations.Test;
import pageObject.*;
import testBase.BaseClass;

public class TC0011_1_AddLeaves extends BaseClass {

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
    public void verify_AddLeaves() {
        BusinessUnitPage bu = new BusinessUnitPage(driver);
        bu.clkLeaves();
        BusinessUnit_LeavesPage bl = new BusinessUnit_LeavesPage(driver);
        bl.clkAddNew();
        bl.enterName("Medical leave");
        bl.selectLeaveCode();
        bl.selectLeaveType();
        bl.selectUnit();
        bl.selectPenalty();
        bl.selectApplicableValidity();
        bl.enterValidatyDays("3");
        bl.enterDescription("Medical leave");
        bl.selectIfMoreThan();
        bl.enterIfMoreThan("3");
        bl.selectdrpIfMoreThan();
        bl.selectMaxLeave();
        bl.enterMaxLeaveDays("2");
        bl.selectfileUpload();
        bl.enterfileUpload("5");
        bl.selectPastDates();
        bl.enterPastDates("2");
        bl.selectFutureDates();
        bl.enterFutures("3");
        bl.selectEmployeeCannot();
        bl.enterEmployeeCannot("2");
        bl.selectMinimumLeave();
        bl.enterMinimumLeave("24");
        bl.selectMaximumLeave();
        bl.enterMaximumLeave("1");
        bl.selectLimit();
        bl.enterLimit("3");
        bl.selectdrpLimit();
        bl.selectStartingMonth();
        bl.enterStartingMonth("06");
        bl.enterStartingMonthLeaveCount("2");
        bl.selectInitialLeave();
        bl.selectdrpInitialLeave();
        bl.enterInitialLeave("1");
        bl.selectdrpEffectiveAfter();
        bl.enterEffectiveAfter("January");
        bl.selectdrpEffectiveAfterFrom();
        bl.enterNoOfLeavesYear("24");
        bl.selectAccural();
        bl.selectdrpAccural();
        bl.selectdrpAccuralDate();
        bl.selectdrpStartingMonth();
        bl.selectrdoGender();
        bl.selectCarryForward();
        bl.selectdrpCarryForwardYear();
        bl.selectCarryForwardBalanceLeave();
        bl.enterCarryForwardBalanceLeave();
        bl.selectEmployee();
        bl.clkSave();
        BasePage bp=new BasePage(driver);
        bp.handleAlert();
    }
}
