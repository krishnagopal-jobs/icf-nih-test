package com.kg.icf.nih.my_stack.impl;

import java.util.NoSuchElementException;

import com.kg.icf.nih.my_stack.Stack;

/**
 * This is a threadsafe class. It doesn't share the stack amongst threads. Every thread keeps it own local copy.
 * 
 * @author Owner
 *
 * @param <T>
 */
public class ThreadLocalStack<T> implements Stack<T> {

	private static class UserContext {

		private Object[] array;

		private int currentSize;

	}

	ThreadLocal<UserContext> threadLocal;

	public ThreadLocalStack(int maxSize) {
		UserContext userContext = new UserContext();
		userContext.array = new Object[maxSize];
		threadLocal = new ThreadLocal<ThreadLocalStack.UserContext>();
		threadLocal.set(userContext);
	}

	@Override
	public void push(T item) {
		if (threadLocal.get().currentSize >= threadLocal.get().array.length) {
			throw new IndexOutOfBoundsException(threadLocal.get().currentSize);
		}
		threadLocal.get().array[threadLocal.get().currentSize++] = item;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T pop() throws NoSuchElementException {
		if (threadLocal.get().currentSize == 0) {
			throw new NoSuchElementException();
		}
		return (T) threadLocal.get().array[--threadLocal.get().currentSize];
	}

	@Override
	public int getCurrentSize() {
		return threadLocal.get().currentSize;
	}

}
