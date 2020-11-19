package com.kg.icf.nih.my_stack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.kg.icf.nih.my_stack.StackFactory.StackType;

class StackFactoryTest {

	@Test
	void testGetInstanceIntStackType() {
		Stack<Integer> stack = StackFactory.getInstance(10, StackType.MyStack);
		Stack<String> stack2 = StackFactory.getInstance(10, StackType.MyStack);
	}
	
	@Test
	void testGetInstanceIntStackTypeBadStack() {
		assertThrows(IllegalArgumentException.class, () -> {
			Stack<String> stack = StackFactory.getInstance(10, StackType.BadStack);
		});
	}

	@Test
	void testGetInstanceInt() {
		Stack<Integer> stack = StackFactory.getInstance(10);
	}

}
