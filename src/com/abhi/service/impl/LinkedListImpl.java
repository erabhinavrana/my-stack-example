/**
 * 
 */
package com.abhi.service.impl;

import com.abhi.service.Stack;

/**
 * @author abhinav
 *
 */
public class LinkedListImpl implements Stack{
	
	private Node head;

	@Override
	public void create() {
		this.head = null;
	}

	@Override
	public void push(int value) {
		Node node = new Node(value);
		node.setNext(this.head);
		this.head = node;
		System.out.println("Push the value= " + value);
	}

	@Override
	public int pop() {
		if(!isEmpty()) {
			int value = this.head.getValue();
			this.head = this.head.getNext();
			System.out.println("Pop the value= " + value);
			return value;
		}else {
			throw new RuntimeException("Stack is empty!!");
		}
	}

	@Override
	public int peek() {
		if(!isEmpty()) {
			System.out.println("Peek the value= " + this.head.getValue());
			return this.head.getValue();
		}else {
			throw new RuntimeException("Stack is empty!!");
		}
	}

	@Override
	public boolean isEmpty() {
		if(null != this.head) {
			return false;
		}
		return true;
	}

	@Override
	public void delete() {
		System.out.println("Delete the stack!!");
		this.head = null;
	}

}
