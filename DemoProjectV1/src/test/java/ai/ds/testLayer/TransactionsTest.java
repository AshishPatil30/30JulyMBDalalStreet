package ai.ds.testLayer;

import org.testng.annotations.Test;

import ai.ds.pageLayer.DashboardPage;
import ai.ds.pageLayer.LoginPage;
import ai.ds.pageLayer.TransactionsPage;
import ai.ds.testBase.TestBase;

public class TransactionsTest extends TestBase {
	
	@Test
	public void getTransDetails() throws InterruptedException
	{
		dash.clickOnTransactionsLink();
		Thread.sleep(4000);
		trans.getTransactionsDetails();
	}

}
