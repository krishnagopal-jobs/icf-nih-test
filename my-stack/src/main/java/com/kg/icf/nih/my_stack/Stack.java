package com.kg.icf.nih.my_stack;

import java.util.NoSuchElementException;

public interface Stack<T> {

	void push(T item);
	
	T pull() throws NoSuchElementException;
	
	int getCurrentSize();
	
}
