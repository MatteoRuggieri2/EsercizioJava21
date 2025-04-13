package esercizi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class RicercaDicotomicaTest {
	
	static RicercaDicotomica rd;
	int[] evenArrayElements = {2, 5, 7, 8, 21, 30, 44, 60, 72, 98};
	int[] oddArrayElements = {1, 3, 5, 7, 9};

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		rd = new RicercaDicotomica();
	}

	@Test
	void testDichotomousResearchEvenArrayElementsOK() {
		assertTrue(rd.dichotomousResearch(2, this.evenArrayElements));
		assertTrue(rd.dichotomousResearch(5, this.evenArrayElements));
		assertTrue(rd.dichotomousResearch(7, this.evenArrayElements));
		assertTrue(rd.dichotomousResearch(8, this.evenArrayElements));
		assertTrue(rd.dichotomousResearch(21, this.evenArrayElements));
		assertTrue(rd.dichotomousResearch(30, this.evenArrayElements));
		assertTrue(rd.dichotomousResearch(44, this.evenArrayElements));
		assertTrue(rd.dichotomousResearch(60, this.evenArrayElements));
		assertTrue(rd.dichotomousResearch(72, this.evenArrayElements));
		assertTrue(rd.dichotomousResearch(98, this.evenArrayElements));
	}
	
	@Test
	void testDichotomousResearchEvenArrayElementsKO() {
		assertFalse(rd.dichotomousResearch(0, this.evenArrayElements));
		assertFalse(rd.dichotomousResearch(1, this.evenArrayElements));
		assertFalse(rd.dichotomousResearch(3, this.evenArrayElements));
		assertFalse(rd.dichotomousResearch(22, this.evenArrayElements));
		assertFalse(rd.dichotomousResearch(61, this.evenArrayElements));
		assertFalse(rd.dichotomousResearch(100, this.evenArrayElements));
		assertFalse(rd.dichotomousResearch(00, this.evenArrayElements));
		assertFalse(rd.dichotomousResearch(10000, this.evenArrayElements));
	}
	
	@Test
	void testDichotomousResearchOddArrayElementsOK() {
		assertTrue(rd.dichotomousResearch(1, this.oddArrayElements));
		assertTrue(rd.dichotomousResearch(3, this.oddArrayElements));
		assertTrue(rd.dichotomousResearch(5, this.oddArrayElements));
		assertTrue(rd.dichotomousResearch(7, this.oddArrayElements));
		assertTrue(rd.dichotomousResearch(9, this.oddArrayElements));
	}
	
	@Test
	void testDichotomousResearchOddArrayElementsKO() {
		assertFalse(rd.dichotomousResearch(0, this.oddArrayElements));
		assertFalse(rd.dichotomousResearch(2, this.oddArrayElements));
		assertFalse(rd.dichotomousResearch(4, this.oddArrayElements));
		assertFalse(rd.dichotomousResearch(6, this.oddArrayElements));
		assertFalse(rd.dichotomousResearch(8, this.oddArrayElements));
		assertFalse(rd.dichotomousResearch(10, this.oddArrayElements));
	}

}
