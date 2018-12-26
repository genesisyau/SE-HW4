package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hw4.Grade;

public class letterGradeTest4a {
	public Grade grade;
	
	@BeforeEach
	void setUp() throws Exception {
		grade = new Grade();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testXScore1() {
		assertEquals(grade.letterGrade(-3), 'X');
	}
	
	@Test
	void testXScore2() {
		assertEquals(grade.letterGrade(200), 'X');
	}
	
	@Test
	void testFScore() {
		assertEquals(grade.letterGrade(30), 'F');
	}
	
	@Test
	void testDScore() {
		assertEquals(grade.letterGrade(64), 'D');
	}
	
	@Test
	void testCScore() {
		assertEquals(grade.letterGrade(76), 'C');
	}
	
	@Test
	void testBScore() {
		assertEquals(grade.letterGrade(82), 'B');
	}
	
	@Test
	void testAScore() {
		assertEquals(grade.letterGrade(96), 'A');
	}
		
}

