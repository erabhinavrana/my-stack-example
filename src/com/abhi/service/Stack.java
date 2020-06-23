/**
 * 
 */
package com.abhi.service;

/**
 * @author abhinav
 *
 */
public interface Stack {

	public void create();
	public void push(final int value);
	public int pop();
	public int peek();
	public boolean isEmpty();
	public void delete();
}
