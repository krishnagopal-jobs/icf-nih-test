package com.kg.icf.nih.my_stack.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.NoSuchElementException;
import java.util.concurrent.ExecutorService;

import org.junit.jupiter.api.Test;

import com.kg.icf.nih.my_stack.Stack;

class ThreadLocalStackTest {

	@Test
	void testThreadLocalStack() {
		Stack<Integer> stack = new ThreadLocalStack<>(10);
		assertEquals(0, stack.getCurrentSize());
	}

	@Test
	void testPush() {
		Stack<Integer> stack = new ThreadLocalStack<>(10);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		assertEquals(3, stack.getCurrentSize());
	}

	@Test
	void testPushIndexOutOfBoundException() {
		Stack<String> stack = new ThreadLocalStack<>(3);
		stack.push("1");
		stack.push("2");
		stack.push("3");
		assertThrows(IndexOutOfBoundsException.class, () -> stack.push("3"));
	}

	@Test
	void testPop() {
		Stack<Integer> stack = new ThreadLocalStack<>(10);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		assertEquals(3, stack.pop());
		assertEquals(2, stack.pop());
		assertEquals(1, stack.pop());
		assertEquals(0, stack.getCurrentSize());
	}

	@Test
	void testPopException() {
		Stack<Integer> stack = new ThreadLocalStack<>(10);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		assertEquals(3, stack.pop());
		assertEquals(2, stack.pop());
		assertEquals(1, stack.pop());
		assertEquals(0, stack.getCurrentSize());
		assertThrows(NoSuchElementException.class, stack::pop);
	}
	
	@Test
	void testGetCurrentSize() {
		Stack<Integer> stack = new ThreadLocalStack<>(10);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		assertEquals(3, stack.getCurrentSize());
	}

}
