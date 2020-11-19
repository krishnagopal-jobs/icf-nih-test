package com.kg.icf.nih.my_stack;

import com.kg.icf.nih.my_stack.impl.JavaStack;
import com.kg.icf.nih.my_stack.impl.MyStack;
import com.kg.icf.nih.my_stack.impl.ThreadLocalStack;

public abstract class StackFactory {

	public static enum StackType {
		MyStack,
		JavaBackedStack,
		ThreadLocalStack,
		BadStack
	}

	public static <T> Stack<T> getInstance(int maxSize, StackType stackType) {
		return switch (stackType) {
		case MyStack: 
			yield new MyStack<T>(maxSize);
		case JavaBackedStack:
			yield new JavaStack<T>(maxSize);
		case ThreadLocalStack:
			yield new ThreadLocalStack<T>(maxSize);
		default:
			throw new IllegalArgumentException("Unexpected value: " + stackType);
		};
	}

	public static <T> Stack<T> getInstance(int maxSize) {
		return new MyStack<T>(maxSize);
	}

}
