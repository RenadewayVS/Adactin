package org.runnerClass;

import org.LibGlobal.LibGlobal;
import org.pages.LoginPage;
import org.testng.xml.LaunchSuite;

public class RunnerClassAmazon extends LibGlobal{
	public static void main(String[] args) {
		LibGlobal global=new LibGlobal();
		global.launchBrowser();
		global.loadUrl("https://www.amazon.in/");
		global.maximize();
		
		//LoginPage page =new LoginPage();
		//page.getBtnSignin();
		
		
	
	}
}
