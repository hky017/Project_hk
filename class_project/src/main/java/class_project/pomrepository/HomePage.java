package class_project.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="appnavigator")
	private WebElement threeDashButton;
	
	@FindBy(xpath="//span[text()=' MARKETING']")
	private WebElement marketingOption;
	
	@FindBy(xpath="//span[text()=' Campaigns']")
	private WebElement campaignOption;
	
	@FindBy(xpath="//span[@class='fa fa-user']")
	private WebElement logoutButton;
	
	@FindBy(id="menubar_item_right_LBL_SIGN_OUT")
	private WebElement signOutButton;
	
	
	public WebElement getThreeDashButton() {
		return threeDashButton;
	}

	public WebElement getMarketingOption() {
		return marketingOption;
	}

	public WebElement getCampaignOption() {
		return campaignOption;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}

	public WebElement getSignOutButton() {
		return signOutButton;
	}

	public void clickOnCampaignOption() {
		threeDashButton.click();
		marketingOption.click();
		campaignOption.click();
	}
	
	public void logoutAction() {
		logoutButton.click();
		signOutButton.click();
	}
	
	
}
