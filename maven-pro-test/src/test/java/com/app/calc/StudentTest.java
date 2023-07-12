package com.app.calc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class StudentTest {

	@Mock
	public IDatabase database;
	
	public StudentScore score;
	
	@BeforeEach
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	@Test
	public void testScore() {
		score= new StudentScore(database);
		int [] scores= {60,70,90};
		score.calculateAndStore("student1", scores);
		Mockito.verify(database,Mockito.times(1)).updateScore("student1", 220);
	}
}
