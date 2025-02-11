package database;

import mavenid.mavenpractice.Dynamic_database;

public class Database_practice1 extends Dynamic_database {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		launch_browser("chrome");
		Thread.sleep(3000);
		takescreenshot("browser");
		Thread.sleep(3000);
		hiturl("facebook");
		takescreenshot("hiturl");Thread.sleep(3000);
	database_connection("june24", "select email,password from linkedin where sr_no=3");
	takescreenshot("login");Thread.sleep(3000);
	database_coulumn("email", "//input[@class=\"inputtext _55r1 _6luy\"]");
		
	Thread.sleep(3000);
		database_coulumn("password","//input[@id=\"pass\"]");Thread.sleep(3000);
		takescreenshot("captureemail_pass");
driver.close();
	}

}
