package project.calc.testng;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestIsNegative {

	

	@Test 
	@Parameters({ "a" })
	public void testNegative(long a) {
		
		Assert.assertTrue(a<0L);
	}
}
