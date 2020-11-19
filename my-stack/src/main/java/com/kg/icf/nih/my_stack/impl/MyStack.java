package com.kg.icf.nih.my_stack.impl;

import java.util.NoSuchElementException;

import com.kg.icf.nih.my_stack.Stack;

public class MyStack<T> implements Stack<T> {

	private Object[] array;

	private int currentSize;

	public MyStack(int maxSize) {
		array = new Object[maxSize];
	}

	@Override
	public void push(T item) {
		if (currentSize >= array.length) {
			throw new IndexOutOfBoundsException(currentSize);
		}
		array[currentSize++] = item;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T pull() throws NoSuchElementException {
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
