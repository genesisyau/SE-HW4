package Tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import hw4.Grade;

class letterGradeTest4b {
	Grade grade;
	
	@BeforeEach
	void setUp() throws Exception {
		grade = new Grade();
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	// Invalid input
	@Test
	void testXScoreBoundary1() {
		assertEquals(grade.letterGrade(-1), 'X');
	}
	
	@Test
	void testXScoreBoundary2() {
		assertEquals(grade.letterGrade(101), 'X');
	}
	
	// F grade
	@Test
	void testFScoreLowBoundary() {
		assertEquals(grade.letterGrade(0), 'F');
	}
	
	@Test
	void testFScoreMiddle() {
		assertEquals(grade.letterGrade(29), 'F');
	}
	
	@Test
	void testFScoreHighBoundary() {
		assertEquals(grade.letterGrade(59), 'F');
	}
	
	// D grade
	@Test
	void testDScoreLowBoundary() {
		assertEquals(grade.letterGrade(60), 'D');
	}
	
	@Test
	void testDScoreMiddle() {
		assertEquals(grade.letterGrade(65), 'D');
	}
	
	@Test
	void testDScoreHighBoundary() {
		assertEquals(grade.letterGrade(69), 'D');
	}
	
	// C grade
	@Test
	void testCScoreLowBoundary() {
		assertEquals(grade.letterGrade(70), 'C');
	}
	
	@Test
	void testCScoreMiddle() {
		assertEquals(grade.letterGrade(75), 'C');
	}
	
	@Test
	void testCScoreHighBoundary() {
		assertEquals(grade.letterGrade(79), 'C');
	}
	
	// B grade
	@Test
	void testBScoreLowBoundary() {
		assertEquals(grade.letterGrade(80), 'B');
	}
	
	@Test
	void testBScoreMiddle() {
		assertEquals(grade.letterGrade(85), 'B');
	}
	
	@Test
	void testBScoreHighBoundary() {
		assertEquals(grade.letterGrade(89), 'B');
	}
	
	// A grade
	@Test
	void testAScoreLowBoundary() {
		assertEquals(grade.letterGrade(90), 'A');
	}
	
	@Test
	void testAScoreMiddle() {
		assertEquals(grade.letterGrade(95), 'A');
	}
	
	@Test
	void testAScoreHighBoundary() {
		assertEquals(grade.letterGrade(100), 'A');
	}
	
}
