package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Class with elements and locators for Create / Edit Page
 * @author jctjavier
 *
 */
public class CreateEditPage {
	@FindBy(how = How.XPATH, using="") // TODO
	public WebElement firstNameInput;
	
	@FindBy(how = How.XPATH, using="") // TODO
	public WebElement lastNameInput;
	
	@FindBy(how = How.XPATH, using="") // TODO
	public WebElement startDateInput;
	
	@FindBy(how = How.XPATH, using="") // TODO
	public WebElement emailInput;
	
	@FindBy(how = How.XPATH, using="") // TODO
	public WebElement addBtn;
	
	@FindBy(how = How.XPATH, using="") // TODO
	public WebElement cancelBtn;
}
