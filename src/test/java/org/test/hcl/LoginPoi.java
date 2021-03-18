package org.test.hcl;

public class LoginPoi extends BaseClass {
	public static void main(String[] args) {
		browserConfig();
		openBrowser("https://www.facebook.com/");
		maximize();
		DataDrivenWithPom l=new DataDrivenWithPom();
		type(l.getTxtEmail(), "sjvxsg");
		type(l.getTxtPass(),"vghvg");
		click(l.getBtnLogin());
		close();
		quit();
		
		
	}

}
