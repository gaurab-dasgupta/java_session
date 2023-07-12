package com.app.calc;

 
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
	@Test
	public void testCalc() {
		assertEquals(10, new Calculator().addTrack(5, 5));
	}

}
