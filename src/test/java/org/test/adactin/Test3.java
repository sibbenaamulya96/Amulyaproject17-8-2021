package org.test.adactin;

import org.testng.annotations.Test;

public class Test3 {
	@Test(groups="smoke")
	public void tc111() {
	System.out.println("tc111");
	}
	@Test(groups="sanity")
	public void tc222() {
	System.out.println("tc222");
	}
	@Test(groups="retesting")
	public void tc333() {
	System.out.println("tc333");
	}
}
