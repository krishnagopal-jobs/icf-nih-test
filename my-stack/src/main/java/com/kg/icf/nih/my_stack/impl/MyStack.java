package com.kg.icf.nih.my_stack.impl;

import java.util.NoSuchElementException;

import com.kg.icf.nih.my_stack.Stack;

/**
 * This is a threadsafe class. It shares the stack amongst all different threads.
 * 
 * @author Owner
 *
 * @param <T>
 */
public class MyStack<T> implements Stack<T> {

	private Object[] array;

	private int currentSize;

	public MyStack(int maxSize) {
		array = new Object[maxSize];
	}

	@Override
	public synchronized void push(T item) {
		if (currentSize >= array.length) {
			throw new IndexOutOfBoundsException(currentSize);
		}
		array[currentSize++] = item;
	}

	@SuppressWarnings("unchecked")
	@Override
	public synchronized T pop() throws NoSuchElementException {
		if (currentSize == 0) {
			throw new NoSuchElementException();
		}
		return (T) array[--currentSize];
	}

	@Override
	public int getCurrentSize() {
		return currentSize;
	}

}
