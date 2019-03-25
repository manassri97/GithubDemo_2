package pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import employee_reg_form.TestBase;

public class ProjectPage extends TestBase {

	@FindBy(id="projectname")
	WebElement projectName;
	
	@FindBy(name="plateform")
	List<WebElement> list;
	
	@FindBy(name="project_submit")
	WebElement button;
	
	public void setButton() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].click();", button);
	}

	public void setCheckBox(String checkbox)
	{
		int size = list.size();
		for (int i = 0; i < size; i++) {
			String value = list.get(i).getAttribute("value");
			if (value.equalsIgnoreCase(checkbox)) {
				list.get(i).click();
				break;
			}
		}
	}

	public void setProjectName(String arg1) {
		projectName.sendKeys(arg1);
	}


	public String getTitle()
	{
		return driver.getTitle();
		
	}
	
	public ProjectPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
}
