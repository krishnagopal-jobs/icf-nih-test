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

}
