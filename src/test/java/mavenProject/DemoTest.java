package mavenProject;

import org.testng.annotations.Test;

public class DemoTest {
	
	@Test
	public void testA()
	{
		System.out.println(System.getProperty("browser"));
		System.out.println("hi");
	}

}
