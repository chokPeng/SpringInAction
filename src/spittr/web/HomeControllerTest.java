package spittr.web;

import static org.junit.Assert.assertEquals;
import spittr.web.HomeController;
import org.junit.Test;

public class HomeControllerTest {
	@Test
	public void testHomePage() throws Exception{
		HomeController homeController=new HomeController();
		assertEquals("home",homeController.home());
	}
}
