package pageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class AddNewTaskPage extends BasePage{

    public AddNewTaskPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//div[normalize-space()='+ Add New Task']")
    WebElement btnAddNewTask;

    @FindBy(xpath = "(//span[@class='MuiButton-label'])[1]")
    WebElement drpAddTag;

    @FindBy(xpath = "//input[@name='title']")
    WebElement txtTaskTitle;

    @FindBy(xpath = "//span[@class='gray']")
    WebElement drpTaskAssignedTo;

    @FindBy(xpath = "//input[@name='description']")
    WebElement txtTaskDescription;

    @FindBy(xpath = "(//p[contains(text(),'Start')]/following::input[contains(@class, 'MuiOutlinedInput-inputAdornedEnd')])[1]")
    WebElement calTaskStartDate;

    @FindBy(xpath = "(//p[contains(text(),'End')]/following::input[contains(@class, 'MuiOutlinedInput-inputAdornedEnd')])[1]")
    WebElement calTaskEndDate;

    @FindBy(xpath = "(//span[normalize-space()='Tag Details']/following::input)[1]")
    WebElement txtTagName;

    @FindBy(xpath = "(//div[contains(@style, 'transparent')])[4]")
    WebElement addColor1;
    @FindBy(xpath = "(//div[contains(@style, 'transparent')])[6]")
    WebElement addColor2;

    @FindBy(xpath = "//button//span[text()='OK']")
    WebElement btnOK;

    @FindBy(xpath = "//div[@class='css-1lx7dxn']")
    WebElement setPriority;

    @FindBy(xpath = "//div[@class='css-19bb58m']")
    WebElement drpSelectBusinessUnit;

    @FindBy(xpath = "//input[@type='file']")
    WebElement addFile;

    @FindBy(xpath = "//button[.//*[name()='svg'] and .//*[name()='path' and contains(@d,'M12 14c1.6')]]")
    WebElement addAudio;

    @FindBy(xpath = "//div[contains(text(),'Create Task')]")
    WebElement btnCreateTask;

    @FindBy(xpath = "(//p[text()='YET TO START']/following::img[@alt='overdue'])[1]")
    WebElement btnYetToStart;

    @FindBy(xpath = "(//p[normalize-space()='Open Task'])[1]")
    WebElement btnOpenTask;

    @FindBy(xpath = "//button[normalize-space()='Yet to start']")
    WebElement btnStatus;

    @FindBy(xpath = "//input[@placeholder='Add Remark']")
    WebElement txtAddRemark;

    @FindBy(xpath = "//button[normalize-space()='Update Status']")
    WebElement btnUpdateStatus;

    @FindBy(xpath = "//body/div[@role='presentation']/div/button//*[name()='svg']")
    WebElement btnCross;

    @FindBy(xpath = "//button[normalize-space()='Edit']")
    WebElement btnEdit;

    @FindBy(xpath = "//div[contains(text(),'Update Task')]")
    WebElement btnUpdateTask;

    public void clkAddNewTask()
    {
        btnAddNewTask.click();
        System.out.println("Clicked on the Add New Task button");
    }

    public boolean isCreateNewbtnisdisplayed()
    {
        WebElement createbtn=driver.findElement(By.xpath("//div[contains(text(),'Create Task')]"));
        return createbtn.isDisplayed();
    }

    public void selectAddtag()
    {
        drpAddTag.click();
        System.out.println("Add tag is selected");
    }

    public void enterTagName(String tagName)
    {
        txtTagName.sendKeys(Keys.CONTROL + "a");
        txtTagName.sendKeys(Keys.DELETE);
        txtTagName.sendKeys(tagName);
        System.out.println("Tag Name entered");
    }

    public void selectColor()
    {
        if (!addColor1.isEnabled())
        {
            addColor1.click();
            System.out.println("Color 1 is selected");
        }
        else
        {
            addColor2.click();
            System.out.println("Color 2 is selected");
        }

    }

    public void clkOK()
    {
        btnOK.click();
        System.out.println("Clicked on the OK button");
    }

    public void selectPriority()
    {
        setPriority.click();
        System.out.println("Clicked on the priority dropdown");

        WebElement priority=driver.findElement(By.xpath("//div[text()='Medium']"));
        priority.click();
        System.out.println("Priority is selected");
    }

    public void updatePriority()
    {
        WebElement optionValue=driver.findElement(By.xpath("//div[@class='css-ksub72-singleValue']"));
        String option= optionValue.getText().trim();
        System.out.println("Currently Selected : " +option);

        setPriority.click();
        System.out.println("Clicked on the priority dropdown");

        if (option.equalsIgnoreCase("Medium") || option.equalsIgnoreCase("Low"))
        {
            driver.findElement(By.xpath("//div[text()='High']")).click();
            System.out.println("Priority High is selected");
        }
        else
        {
            driver.findElement(By.xpath("//div[text()='Medium']")).click();
            System.out.println("Priority Medium is selcted");
        }
    }

    public void enterTaskTitle(String taskTitle)
    {
        txtTaskTitle.sendKeys(Keys.CONTROL + "a");
        txtTaskTitle.sendKeys(Keys.DELETE);
        txtTaskTitle.sendKeys(taskTitle);
        System.out.println("Task title is entered");
    }

    public void clkSelectBusinessUnit()
    {
        drpSelectBusinessUnit.click();
        System.out.println("Clicked on the Select Business Unit dropdown");

        WebElement option=driver.findElement(By.xpath("//div[@id='react-select-3-option-2']"));
        option.click();
        System.out.println("Business Unit Value is selected from the dropdown");
    }

    public void enterSearchAssignedTo()
    {
        WebElement assignedTo=driver.findElement(By.xpath("//input[@placeholder='Search']"));
        assignedTo.sendKeys("akil@576");
        System.out.println("Assigned to search is selected");

        WebElement selectAssignedTo=driver.findElement(By.xpath("//span[text()=\"akilp\"]"));
        selectAssignedTo.click();
        System.out.println("Assigned to is selected");
    }

    public void selectTaskAssignedTo()
    {
        drpTaskAssignedTo.click();
        System.out.println("Clicked on the Task Assigned to dropdown");
        enterSearchAssignedTo();

    }

    public void enterTaskDescription(String description)
    {
        txtTaskDescription.sendKeys(Keys.CONTROL + "a");
        txtTaskDescription.sendKeys(Keys.DELETE);
        txtTaskDescription.sendKeys(description);
        System.out.println("Task description entered");
    }

    public void enterTaskStartDate()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(
                "arguments[0].value = '03/06/2025'; arguments[0].dispatchEvent(new Event('input', { bubbles: true }));",
                calTaskStartDate);
        System.out.println("Task Start date added");
    }

    public void enterTaskendDate()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(
                "arguments[0].value = '06/06/2025'; arguments[0].dispatchEvent(new Event('input', { bubbles: true }));",
                calTaskEndDate);
        System.out.println("Task End date added");
    }

    public void selectFile()
    {
        String path=System.getProperty("user.dir") + "/src/test/resources/ipsImage.jpg";
        addFile.sendKeys(path);
        System.out.println("File attached");
    }

    public void selectAudio() throws InterruptedException {
        addAudio.click();
        System.out.println("Clicked on the audio button");

        Thread.sleep(5000);
        WebElement pauseButton = driver.findElement(By.xpath("//p[contains(text(),'Recording')]/following::button[1]"));
        pauseButton.click();
        System.out.println("Audio paused");
    }

    public void clkCreateTask()
    {
        btnCreateTask.click();
        System.out.println("Clicked on the Create task button, And the Task is created.");
    }

    public boolean isTaskCreatedSuccessfully()
    {
        WebElement successMessage=driver.findElement(By.xpath("//h1[normalize-space()='Task Created Successfully !!']"));
        return successMessage.isDisplayed();
    }

    public void clkYetToStart()
    {
        btnYetToStart.click();
        System.out.println("Clicked on the Yet To Start button");
    }

    public boolean isYetToStartDisplay()
    {
        WebElement popLabel=driver.findElement(By.xpath("(//p[contains(text(),'YET TO START')])[1]"));
        return popLabel.isDisplayed();
    }

    public void clkOpenTask()
    {
        btnOpenTask.click();
        System.out.println("Clicked on the Open Task");
    }

    public void clkStatus()
    {
        btnStatus.click();
        System.out.println("Clicked on the Status button");

        WebElement changeStatus=driver.findElement(By.xpath("//li[normalize-space()='In Progress']"));
        changeStatus.click();
        System.out.println("Status is change to In Progress");
    }

    public void enterAddRemark(String remark)
    {
        txtAddRemark.sendKeys(Keys.CONTROL + "a");
        txtAddRemark.sendKeys(Keys.DELETE);
        txtAddRemark.sendKeys(remark);
        System.out.println("Remarks added");
    }

    public void clkUpdateStatus()
    {
        btnUpdateStatus.click();
        System.out.println("Clicked on the update status and status is successfully changed");
    }

    public boolean isUpdatedSuccessfullyDisplay()
    {
        WebElement popUp=driver.findElement(By.xpath("//h1[contains(text(), 'Successfully !!')]"));
        return popUp.isDisplayed();
    }

    public boolean isTaskUpdatedSuccessfullyDisplay()
    {
        WebElement popUp=driver.findElement(By.xpath("//h1[normalize-space()='Task Status Updated Successfully !!']"));
        return popUp.isDisplayed();
    }

    public void clkCross()
    {
        btnCross.click();
        System.out.println("Clicked on the click button");
    }

    public void clkEditbutton()
    {
        btnEdit.click();
        System.out.println("Clicked on the Edit button");
    }

    public void clkUpdateTask()
    {
        btnUpdateTask.click();
        System.out.println("Clicked  on the Update Task button, And Task is updated successfully!");
    }
}
