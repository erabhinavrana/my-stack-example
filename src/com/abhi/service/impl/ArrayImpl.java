/**
 * 
 */
package com.abhi.service.impl;

import com.abhi.service.Stack;

/**
 * @author abhinav
 *
 */
public class ArrayImpl implements Stack {

	private int[] stackArr;
	private int topOfStack;
	private int size;

	public ArrayImpl(final int size) {
		this.size = size;
		this.topOfStack = -1;
	}

	@Override
	public void create() {
		this.stackArr = new int[this.size];
		this.topOfStack = -1;
	}

	@Override
	public void push(int value) {
		if (isInitialized() && !isFull()) {
			this.stackArr[++topOfStack] = value;
			System.out.println("Insert the value= " + value + " at index= " + this.topOfStack);
		} else {
			throw new RuntimeException("Error while inserting the value= " + value + ", Stack is full!!");
		}
	}

	private boolean isFull() {
		if (this.topOfStack == this.stackArr.length - 1) {
			return true;
		}
		return false;
	}

	@Override
	public int pop() {
		if (isInitialized() && !isEmpty()) {
			System.out.println("Removing the value from index= " + this.topOfStack);
			return this.stackArr[this.topOfStack--];
		} else {
			throw new RuntimeException("Error while removing the value, Stack is Empty!!");
		}
	}

	@Override
	public int peek() {
		if (isInitialized() && !isEmpty()) {
			System.out.println("Displaying the value from index= " + this.topOfStack);
			return this.stackArr[this.topOfStack];
		} else {
			throw new RuntimeException("Stack is Empty!!");
		}
	}

	@Override
	public boolean isEmpty() {
		if (isInitialized() && this.topOfStack == -1) {
			return true;
		}
		return false;
	}

	@Override
	public void delete() {
		this.stackArr = null;
		this.topOfStack = -1;
	}

	private boolean isInitialized() {
		if (null != this.stackArr) {
			return true;
		}
		throw new RuntimeException("Stack is not initialized!!");
	}
}
