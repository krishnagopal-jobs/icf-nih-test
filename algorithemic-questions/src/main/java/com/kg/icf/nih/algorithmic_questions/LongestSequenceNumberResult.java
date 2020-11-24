package com.kg.icf.nih.algorithmic_questions;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class LongestSequenceNumberResult<T> {
	private final T element;
	private final int maxSequenceStartIndex;
	private final int maxSequentialOccurences;
}