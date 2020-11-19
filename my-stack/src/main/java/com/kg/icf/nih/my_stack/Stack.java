package com.kg.icf.nih.my_stack;

import java.util.NoSuchElementException;

/**
 * This interface implements the custom Stack.
 * 
 * @author Owner
 *
 * @param <T>
 */
public interface Stack<T> {

	/**
	 * This method pushes an item to the stack.
	 * 
	 * @param item
	 */
	void push(T item);
	
	
	/**
	 * This method returns the last pushed item.
	 * 
	 * If the stack is empty, it throws NoSuchElementException.
	 * 
	 * @return last pushed item.
	 * @throws NoSuchElementException
	 */
	T pop() throws NoSuchElementException;
	
	/**
	 * This method returns how many items there are in the stack currently.
	 * 
	 * @return number of current items. 
	 */
	int getCurrentSize();
	
}
