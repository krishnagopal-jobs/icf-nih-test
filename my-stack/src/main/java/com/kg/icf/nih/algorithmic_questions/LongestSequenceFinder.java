package com.kg.icf.nih.algorithmic_questions;

public class LongestSequenceFinder {

	public static void main(String[] args) {

		int[] array = { 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
//				{ 0, 1, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 2, 2, 2, 5, 6, 7, 8, 8, 8, 8, 8, 0, 0, 0, 9, 10, 11, 11, 11,
//						11, 11, 11, 11, 11, 11, 11, 11 };


		int maxSequentialRepetitions = 0;
		int currentNumberOfRepetitions = 0;
		int previousNumber = array[0];
		int currentNumber;
		int maximumSequenceStartIndex = 0;
		int currentSequenceStartIndex = 0;
		
		for (int i = 0; i < array.length; i++) {
			currentNumber = array[i];
			if (currentNumber == previousNumber) {
				currentNumberOfRepetitions++;
			} else {
				currentNumberOfRepetitions = 1;
				currentSequenceStartIndex = i;
			}
			if (currentNumberOfRepetitions > maxSequentialRepetitions) {
				maxSequentialRepetitions = currentNumberOfRepetitions;
				maximumSequenceStartIndex = currentSequenceStartIndex;
			}
			previousNumber = currentNumber;
		}

		System.out.printf("Number with maximum sequential repitions : %d, index : %d , maxSequentialRepitions : %d \n",
				array[maximumSequenceStartIndex], maximumSequenceStartIndex, maxSequentialRepetitions);

	}

}
