package robot;

import mavenid.mavenpractice.Dynamic_robot;

public class Practice2 extends Dynamic_robot {

	public static void main(String[] args) throws Throwable {
		
		launch_browser("chrome");
		
		hiturl("pdf");
		upload_file("//a[@id=\"pickfiles\"]", "\"D:\\stp\\wordfor practice\\pdf convertert file.docx\"");
	}

}
