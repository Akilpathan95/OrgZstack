package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObject.AddNewTaskPage;
import pageObject.LeftMenuPage;
import testBase.BaseClass;

public class TC0022_AddNewTask extends BaseClass {

    @Test
    public void verify_AddNewTask() throws InterruptedException {
        LeftMenuPage lp=new LeftMenuPage(driver);
        lp.clkTaskManager();
        AddNewTaskPage at=new AddNewTaskPage(driver);
        at.clkAddNewTask();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(at.isCreateNewbtnisdisplayed(), "Create Task button is not displaying");
        System.out.println("Create new button is displaying");
        softAssert.assertAll(); //It is mandatory, This will throw if any above assertion is failed
        at.selectAddtag();
        at.enterTagName("Task Manager");
        at.selectColor();
        at.clkOK();
        at.selectPriority();
        at.enterTaskTitle("Task Manager Automation");
        at.clkSelectBusinessUnit();
        at.selectTaskAssignedTo();
        at.enterTaskDescription("Please do this task as early as");
        at.enterTaskStartDate();
        at.enterTaskendDate();
        at.selectFile();
        at.selectAudio();
        at.clkCreateTask();
        Assert.assertTrue(at.isTaskCreatedSuccessfully(),"Task is not created successfully");
        driver.navigate().refresh();
    }
}
