package com.kg.icf.nih.my_stack.impl;

import java.util.NoSuchElementException;

import com.kg.icf.nih.my_stack.Stack;

/**
 * This is an adapter to java.util.Stack.
 * 
 * @author Owner
 *
 * @param <T>
 */
public class JavaStack<T> implements Stack<T> {

	private java.util.Stack<T> stack;

	private int maximumSize;

	private int currentSize;

	public JavaStack() {
		stack = new java.util.Stack<T>();
	}

	public JavaStack(int maximumSize) {
		this.maximumSize = maximumSize;
		this.stack = new java.util.Stack<T>();
	}

	@Override
	public synchronized void push(T item) {
		if(currentSize >= maximumSize) {
			throw new IndexOutOfBoundsException();
		}
		currentSize++;
		stack.push(item);
	}

	@Override
	public synchronized T pop() throws NoSuchElementException {
		if(currentSize <= 0) {
			throw new NoSuchElementException();
		}
		currentSize--;
		return stack.pop();
	}

	@Override
	public synchronized int getCurrentSize() {
		return currentSize;
	}

}
