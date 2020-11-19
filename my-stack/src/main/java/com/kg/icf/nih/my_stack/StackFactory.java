package com.kg.icf.nih.my_stack;

import com.kg.icf.nih.my_stack.impl.MyStack;

public abstract class StackFactory {

	public static enum StackType {
		MyStack,
		BadStack
	}

	public static <T> Stack<T> getInstance(int maxSize, StackType stackType) {
		switch (stackType) {
		case MyStack: {
			return new MyStack<T>(maxSize);
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + stackType);
		}
	}

	public static <T> Stack<T> getInstance(int maxSize) {
		return new MyStack<T>(maxSize);
	}

}
