package com.problemslicer.isp.good;

/**
 * @author himadri
 *
 * @param <T>
 * 
 * we have segregated two interface to achieve required functionality.
 */
public class MyLinkedList<T> implements MyList<T>, MyDeque<T> {

	@Override
	public T get() {
		// Implement this method
		return null;
	}

	@Override
	public void add(T t) {
		// Implement this method
	}

	@Override
	public T poll() {
		// Implement this method
		return null;
	}

	@Override
	public T peek() {
		// Implement this method
		return null;
	}
}