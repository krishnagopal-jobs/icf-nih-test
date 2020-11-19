package com.kg.icf.nih.my_stack.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;

import com.kg.icf.nih.my_stack.Stack;

class MyStackTest {

	@Test
	void testMyStack() {
		Stack<Integer> stack = new MyStack<>(10);
		assertEquals(0, stack.getCurrentSize());
	}

	@Test
	void testPush() {
		Stack<Integer> stack = new MyStack<>(10);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		assertEquals(3, stack.getCurrentSize());
	}

	@Test
	void testPushIndexOutOfBoundException() {
		Stack<String> stack = new MyStack<>(3);
		stack.push("1");
		stack.push("2");
		stack.push("3");
		assertThrows(IndexOutOfBoundsException.class, () -> stack.push("3"));
	}

	@Test
	void testPull() {
		Stack<Integer> stack = new MyStack<>(10);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		assertEquals(3, stack.pull());
		assertEquals(2, stack.pull());
		assertEquals(1, stack.pull());
		assertEquals(0, stack.getCurrentSize());
	}

	@Test
	void testPullException() {
		Stack<Integer> stack = new MyStack<>(10);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		assertEquals(3, stack.pull());
		assertEquals(2, stack.pull());
		assertEquals(1, stack.pull());
		assertEquals(0, stack.getCurrentSize());
		assertThrows(NoSuchElementException.class, stack::pull);
	}

	@Test
	void testGetCurrentSize() {
		Stack<Integer> stack = new MyStack<>(10);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		assertEquals(3, stack.getCurrentSize());
	}

}
