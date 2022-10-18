package campaignTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import class_project.genericUtility.BaseClass;
import class_project.genericUtility.ExcelUtility;
import class_project.genericUtility.IPathConstant;
import class_project.pomrepository.CampaignDetailsPage;
import class_project.pomrepository.CampaignsPage;
import class_project.pomrepository.CreatingNewCampaignPage;
import class_project.pomrepository.HomePage;

@Listeners(class_project.genericUtility.ListenersImplementationClass.class)

public class CreatecampaignTest extends BaseClass {
	@Test (retryAnalyzer = class_project.genericUtility.IRetryAnalyserImplementationClass.class)
	public void createCampaignAndVerifyCampaignNameTest() throws EncryptedDocumentException, IOException {
		HomePage home=new HomePage(driver);
		home.clickOnCampaignOption();
		
		CampaignsPage campaign=new CampaignsPage(driver);
		campaign.clickonAddCampaign();
		
		int randomNo=jutils.generateRandomNumber(IPathConstant.RANDOM_NUMBER);
		
		ExcelUtility eUtils=new ExcelUtility();
		String campaignName=eUtils.fetchdataFromExcelFile(IPathConstant.SHEET_NAME,1,0);
		String expectedCampaignName=campaignName+randomNo;
		String date=eUtils.fetchdataFromExcelFile(IPathConstant.SHEET_NAME,1,1);
		
		CreatingNewCampaignPage newCampaign = new CreatingNewCampaignPage(driver);
		newCampaign.createNewCampaignAction(expectedCampaignName, date);
		
		//Assert.fail();
		
		CampaignDetailsPage camapignDetails = new CampaignDetailsPage(driver);
		String actualCampaignName=camapignDetails.verifyCampaignName(campaignName);
		
		System.out.println(actualCampaignName);
		System.out.println(expectedCampaignName);
		
		Assert.assertEquals(actualCampaignName, expectedCampaignName);
		System.out.println("camapignName is verified");
		
		
	}
}
