package com.problemslicer.isp.bad;

/**
 * @author himadri
 *
 * Do you see the problem, even though you do not require poll and peek method in ArrayList,
 * we have implemented them.
 * 
 * The correct solution for above problem will be:
 * Create another interface called Deque which will have peek and poll method.
 */
public class MyArrayList implements MyList<Integer> {

	@Override
	public Integer get() {
		// Implement this method
		return null;
	}

	@Override
	public void add(Integer t) {
		// Implement this method
	}

	@Override
	public Integer poll() {
		// ArrayList does not require this method
		return null;
	}

	@Override
	public Integer peek() {
		// ArrayList does not require this method
		return null;
	}
}
