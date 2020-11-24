package com.kg.icf.nih.algorithmic_questions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestSequenceFinderTest {

	@Test
	void test() {
		Integer[] array = { 1, 1, 2, 2, 2, 3, 4, 5, 6, 8, 8, 8, 8, 8, 11, 11, 23 };
		LongestSequenceNumberResult result = LongestSequenceFinder.findTheLongestSequence(array);
		assertEquals(8, result.getElement());
		assertEquals(9, result.getMaxSequenceStartIndex());
		assertEquals(5, result.getMaxSequentialOccurences());
	}

	@Test
	void test2() {
		Integer[] array = { 1, 1, 2, 2, 2,2,2,2,2,2,2,2,2,2, 2, 3, 4, 5, 6, 8, 8, 8, 8, 8, 11, 11, 23 };
		LongestSequenceNumberResult result = LongestSequenceFinder.findTheLongestSequence(array);
		assertEquals(2, result.getElement());
		assertEquals(2, result.getMaxSequenceStartIndex());
		assertEquals(13, result.getMaxSequentialOccurences());
	}
	
	@Test
	void test2() {
		Object[] array = { 1, "Ram", "Ram", "Ram", "Ram","Ram","Ram","Ram","Ram","Ram","Ram","Ram","Ram","Ram", 2, 3, 4, 5, 6, 8, 8, 8, 8, 8, 11, 11, 23 };
		LongestSequenceNumberResult result = LongestSequenceFinder.findTheLongestSequence(array);
		assertEquals("Ram", result.getElement());
		assertEquals(1, result.getMaxSequenceStartIndex());
		assertEquals(13, result.getMaxSequentialOccurences());
	}
	
}
