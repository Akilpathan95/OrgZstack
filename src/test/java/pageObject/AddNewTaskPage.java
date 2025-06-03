package pageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AddNewTaskPage extends BasePage{

    public AddNewTaskPage(WebDriver driver)
    {
        super(driver);
    }

    Actions actions;

    @FindBy(xpath = "//div[normalize-space()='+ Add New Task']")
    WebElement btnAddNewTask;

    @FindBy(xpath = "//span[normalize-space()='Add Tag']")
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
    WebElement addColor;

    @FindBy(xpath = "//button//span[text()='OK']")
    WebElement btnOK;

    @FindBy(xpath = "//div[@id='mui-component-select-priority']")
    WebElement setPriority;

    @FindBy(xpath = "//input[@type='file']")
    WebElement addFile;

    @FindBy(xpath = "//button[.//*[name()='svg'] and .//*[name()='path' and contains(@d,'M12 14c1.6')]]")
    WebElement addAudio;

    @FindBy(xpath = "//div[contains(text(),'Create Task')]")
    WebElement btnCreateTask;

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
        txtTagName.sendKeys(tagName);
        System.out.println("Tag Name entered");
    }

    public void selectColor()
    {
        addColor.click();
        System.out.println("Color select");
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

        WebElement priority=driver.findElement(By.xpath("//li[normalize-space()='Medium']"));
        priority.click();
        System.out.println("Priority is selected");
    }

    public void enterTaskTitle(String taskTitle)
    {
        txtTaskTitle.sendKeys(taskTitle);
        System.out.println("Task title is entered");
    }

    public void enterSearchAssignedTo()
    {
        WebElement assignedTo=driver.findElement(By.xpath("//input[@placeholder='Search']"));
        assignedTo.sendKeys("akil");
        System.out.println("Assigned to search is selected");

        WebElement selectAssignedTo=driver.findElement(By.xpath("//span[text()=\"akilp1995@gmail.com\"]"));
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
}
