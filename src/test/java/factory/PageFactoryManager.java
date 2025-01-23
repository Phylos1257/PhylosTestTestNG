package factory;

import context.PageContext;
import pages.LoginPage;

public class PageFactoryManager {
	private static LoginPage loginPage;

	public PageFactoryManager() {
		// TODO Auto-generated constructor stub
	}
	public static LoginPage getLoginPage(PageContext context) {
		return loginPage == null ? new LoginPage(context) : loginPage;
	}

}
