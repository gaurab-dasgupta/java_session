package com.app.mock;

 
 

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class CalTest {
	//@Mock
	AddService addService;
	CalcService calcService;
	//@BeforeEach
	public void setUp() {
		//MockitoAnnotations.initMocks(this);
	}
	@Test
	public void testApp() {
		
		calcService= new CalcService(addService);
		int numm1=11;
		int numm2=13;
		int expected=25;
		
		//Mockito.when(addService.add(numm1, numm2)).thenReturn(expected);
		int actual= calcService.calc(numm1, numm2);
		
		assertEquals(expected, actual);
		
	}

}
