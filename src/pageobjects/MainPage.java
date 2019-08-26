package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Class that includes page objects for the Main Page
 * @author jctjavier
 *
 */
public class MainPage {
	@FindBy(how = How.ID, using="greetings")
	public WebElement greetingsTxt;
	
	@FindBy(how = How.XPATH, using="")
	public List<WebElement> employeeNames;
	
	@FindBy(how = How.XPATH, using="")
	public WebElement createBtn;
	
	@FindBy(how = How.XPATH, using="")
	public WebElement editBtn;
	
	@FindBy(how = How.XPATH, using="")
	public WebElement deleteBtn;
	
	@FindBy(how = How.XPATH, using="")
	public WebElement logoutBtn;
}
