package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateEditPage {
	@FindBy(how = How.XPATH, using="")
	public WebElement firstNameInput;
	
	@FindBy(how = How.XPATH, using="")
	public WebElement lastNameInput;
	
	@FindBy(how = How.XPATH, using="")
	public WebElement startDateInput;
	
	@FindBy(how = How.XPATH, using="")
	public WebElement emailInput;
	
	@FindBy(how = How.XPATH, using="")
	public WebElement addBtn;
	
	@FindBy(how = How.XPATH, using="")
	public WebElement cancelBtn;
}
