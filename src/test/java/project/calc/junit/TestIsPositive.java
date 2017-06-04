package project.calc.junit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

import org.junit.runners.Parameterized;


import org.junit.runner.RunWith;

import static org.testng.Assert.assertTrue;

@RunWith(Parameterized.class)
public class TestIsPositive{
	private long a;

		public TestIsPositive(long a) {
		this.a = a;
		
	}

	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { { 2 } };
		return Arrays.asList(data);
	}

	@Test
	public void IsPositive() {
		
		assertTrue(a>0L);

	}
}
