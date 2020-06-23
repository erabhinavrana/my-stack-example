/**
 * 
 */
package com.abhi;

import com.abhi.service.Stack;
import com.abhi.service.impl.ArrayImpl;
import com.abhi.service.impl.LinkedListImpl;

/**
 * @author abhinav
 *
 */
public class StackMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		performStackArrayOperations();
		performStackLinkedListOperations();
	}

	private static void performStackArrayOperations() {
		System.out.println("Array Implementation of Stack---------\n");
		Stack stackArr = new ArrayImpl(5);
		stackArr.create();
		stackArr.push(10);
		stackArr.push(20);
		stackArr.pop();
		stackArr.push(30);
		stackArr.push(40);
		stackArr.peek();
		stackArr.push(50);

		stackArr.delete();

	}
	
	private static void performStackLinkedListOperations() {
		System.out.println("LinkedList Implementation of Stack---------\n");
		Stack stackLinkedList = new LinkedListImpl();
		stackLinkedList.create();
		stackLinkedList.push(10);
		stackLinkedList.push(20);
		stackLinkedList.pop();
		stackLinkedList.push(30);
		stackLinkedList.push(40);
		stackLinkedList.peek();
		stackLinkedList.push(50);

		stackLinkedList.delete();
		stackLinkedList.isEmpty();

	}

}
