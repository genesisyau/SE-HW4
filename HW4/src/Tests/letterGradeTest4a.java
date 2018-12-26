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
	public void testXScore1() {
		assertEquals(grade.letterGrade(-3), 'X');
	}
	
	@Test
	public void testXScore2() {
		assertEquals(grade.letterGrade(200), 'X');
	}
	
	@Test
	public void testFScore() {
		assertEquals(grade.letterGrade(30), 'F');
	}
	
	@Test
	public void testDScore() {
		assertEquals(grade.letterGrade(64), 'D');
	}
	
	@Test
	public void testCScore() {
		assertEquals(grade.letterGrade(76), 'C');
	}
	
	@Test
	public void testBScore() {
		assertEquals(grade.letterGrade(82), 'B');
	}
	
	@Test
	public void testAScore() {
		assertEquals(grade.letterGrade(96), 'A');
	}
		
}

