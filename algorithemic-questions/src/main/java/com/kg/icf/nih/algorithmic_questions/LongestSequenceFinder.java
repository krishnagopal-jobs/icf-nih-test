package com.kg.icf.nih.algorithmic_questions;

public class LongestSequenceFinder {

	
	public static <T> LongestSequenceNumberResult findTheLongestSequence(final T[] array) {

		int maxSequentialOccurences = 0;
		int currentSequentialOccurences = 0;
		T previousNumber = array[0];
		T currentNumber;
		int maximumSequenceStartIndex = 0;
		int currentSequenceStartIndex = 0;

		for (int i = 0; i < array.length; i++) {
			currentNumber = array[i];
			if (currentNumber.equals(previousNumber)) {
				currentSequentialOccurences++;
			} else {
				currentSequentialOccurences = 1;
				currentSequenceStartIndex = i;
			}
			if (currentSequentialOccurences > maxSequentialOccurences) {
				maxSequentialOccurences = currentSequentialOccurences;
				maximumSequenceStartIndex = currentSequenceStartIndex;
			}
			previousNumber = currentNumber;
		}
		return new LongestSequenceNumberResult(array[maximumSequenceStartIndex], maximumSequenceStartIndex,
				maxSequentialOccurences);
	}

}
