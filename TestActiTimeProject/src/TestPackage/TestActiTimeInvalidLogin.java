package TestPackage;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.CustomListner;
import Generic.Flib;
import PagePackage.LoginPage;
@Listeners(CustomListner.class)
public class TestActiTimeInvalidLogin extends BaseTest {
		@Test
		public void invalidLoginToActiTime() throws EncryptedDocumentException, IOException, InterruptedException
		{
			LoginPage lp = new LoginPage(driver);
			Flib flib = new Flib();
			int rc = flib.getRowCount(EXCEL_PATH,"invaliddata");
			for(int i=1;i<=rc;i++)
			{
				lp.invalidLoginToActiTime(flib.readExcelData(EXCEL_PATH,"invaliddata",i, 0), flib.readExcelData(EXCEL_PATH,"invaliddata",i, 1));
				
			}
		}

		
		

}
