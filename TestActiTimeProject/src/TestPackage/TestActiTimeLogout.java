package TestPackage;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.CustomListner;
import Generic.Flib;
import PagePackage.HomePage;
import PagePackage.LoginPage;

@Listeners(CustomListner.class)
public class TestActiTimeLogout extends BaseTest{

	@Test
	public void logout() throws InterruptedException, IOException
	{
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		lp.validLoginToActiTime(flib.readPropertyData(PROP_PATH,"username"),flib.readPropertyData(PROP_PATH,"password"));
		HomePage hp = new HomePage(driver);
		hp.logOutmethod();
	}
}
