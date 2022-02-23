package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.nursery.list.IntArrayStack;
import edu.kis.vh.nursery.list.IntLinkedList;

public class RhymersJUnitTest {

	@Test
	public void testCountIn() {
		defaultCountingOutRhymer rhymer = new defaultCountingOutRhymer();
		int testValue = 4;
		rhymer.countIn(testValue);

		int result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCallCheck() {
		defaultCountingOutRhymer rhymer = new defaultCountingOutRhymer();
		boolean result = rhymer.callCheck();
		Assert.assertEquals(true, result);

		rhymer.countIn(888);

		result = rhymer.callCheck();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testIsFull() {
		defaultCountingOutRhymer rhymer = new defaultCountingOutRhymer();
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = rhymer.isFull();
			Assert.assertEquals(false, result);
			rhymer.countIn(888);
		}

		boolean result = rhymer.isFull();
		Assert.assertEquals(true, result);
	}

	@Test
	public void testPeekaboo() {
		defaultCountingOutRhymer rhymer = new defaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = 0;

		int result = rhymer.peekaboo();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		rhymer.countIn(testValue);

		result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
		result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCountOut() {
		defaultCountingOutRhymer rhymer = new defaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = 0;

		int result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		rhymer.countIn(testValue);

		result = rhymer.countOut();
		Assert.assertEquals(testValue, result);
		result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}
	
	@Test
	public void testArrayStackPush() {
		IntArrayStack stack = new IntArrayStack();
		int testValue = 4;
		stack.push(testValue);
		int result = stack.checkLast();
		Assert.assertEquals(testValue, result);
		
	}
	
	@Test
	public void testArrayStackPop() {
		IntArrayStack stack = new IntArrayStack();
		int testValue = 4;
		stack.push(testValue);
		int result = stack.pop();
		Assert.assertEquals(result, testValue);
	}
	
	@Test
	public void testArrayStackError() {
		IntArrayStack stack = new IntArrayStack();
		final int error = -1;
		Assert.assertEquals(error, stack.getError());
	}
	
	@Test
	public void testArrayStackIsEmpty() {
		IntArrayStack stack = new IntArrayStack();
		int testValue = 4;
		stack.push(testValue);
		Assert.assertEquals(false, stack.isEmpty());
		stack.pop();
		Assert.assertEquals(true, stack.isEmpty());
	}
	
	@Test
	public void testArrayStackIsFull() {
		IntArrayStack stack = new IntArrayStack();
		int testValue = 4;
		
		Assert.assertEquals(false, stack.isFull());
		for(int i=0;i<12;i++)
			stack.push(testValue);
		Assert.assertEquals(true, stack.isFull());
	}
	
	@Test
	public void testArrayStackCheckLast() {
		IntArrayStack stack = new IntArrayStack();
		
		stack.push(1);
		Assert.assertEquals(1, stack.checkLast());
		stack.push(2);
		stack.push(3);
		Assert.assertEquals(3, stack.checkLast());
	}
	
	//asdasdasd
	@Test
	public void testListStackPush() {
		IntLinkedList stack = new IntLinkedList();
		int testValue = 4;
		stack.push(testValue);
		int result = stack.checkLast();
		Assert.assertEquals(testValue, result);
		
	}
	
	@Test
	public void testListStackPop() {
		IntLinkedList stack = new IntLinkedList();
		int testValue = 4;
		stack.push(testValue);
		int result = stack.pop();
		Assert.assertEquals(result, testValue);
	}
	
	@Test
	public void testListStackError() {
		IntLinkedList stack = new IntLinkedList();
		final int error = -1;
		Assert.assertEquals(error, stack.getError());
	}
	
	@Test
	public void testListStackIsEmpty() {
		IntLinkedList stack = new IntLinkedList();
		int testValue = 4;
		stack.push(testValue);
		Assert.assertEquals(false, stack.isEmpty());
		stack.pop();
		Assert.assertEquals(true, stack.isEmpty());
	}
	
	@Test
	public void testListStackIsFull() {
		IntLinkedList stack = new IntLinkedList();
		int testValue = 4;
		
		Assert.assertEquals(false, stack.isFull());
		for(int i=0;i<12;i++)
			stack.push(testValue);
		Assert.assertEquals(false, stack.isFull()); 
	}
	
	@Test
	public void testListStackCheckLast() {
		IntLinkedList stack = new IntLinkedList();
		
		stack.push(1);
		Assert.assertEquals(1, stack.checkLast());
		stack.push(2);
		stack.push(3);
		Assert.assertEquals(3, stack.checkLast());
	}

}
