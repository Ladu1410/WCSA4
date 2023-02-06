package pageObjectModel;

import java.io.IOException;
import java.sql.Driver;

public class ActiTimeLogout extends BaseTest {
	
	public static void main(String[] args) throws IOException {
		
		
		
		BaseTest bt = new BaseTest();
		bt.openbrowser();
		
		Flib fs = new Flib();
		LoginPage lp = new LoginPage(driver);
	}

}
