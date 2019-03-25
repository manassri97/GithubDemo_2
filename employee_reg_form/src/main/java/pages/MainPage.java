package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import employee_reg_form.TestBase;

public class MainPage extends TestBase{
	
		@FindBy(xpath="//*[@id=\"empno\"]")
		WebElement employeeno;
		
		@FindBy(id="empname")
		WebElement employeename;
		
		@FindBy(xpath="//*[@id=\"city\"]")
		WebElement city;
		
		@FindBy(xpath="//*[@id=\"country\"]")
		WebElement state;
		
		@FindBy(xpath="/html/body/form/input[3]")
		WebElement button;

		public void setEmployeeno(String arg1) {
			employeeno.sendKeys(arg1);
		}

		public void setEmployeename(String arg2) {
			employeename.sendKeys(arg2);
		}
		public void setCity(String arg4) {
			city.sendKeys(arg4);
		}
		public void setState(String arg3) {
			state.sendKeys(arg3);
		}

		public void setButton() {
			JavascriptExecutor js = (JavascriptExecutor)driver;
	    	js.executeScript("arguments[0].click();", button);
		}

		public String getTitle()
		{
			return driver.getTitle();
			
		}
		
		//Initializing the Page Objects:
		public MainPage(){
			PageFactory.initElements(driver, this);
		}
		
		//Actions:
		public String validateLoginPageTitle(){
			return driver.getTitle();
		}

		public void setEmployeeno() {
			employeeno.sendKeys();
		}

		public Alert getAlert() {
			return driver.switchTo().alert();
		}
}
