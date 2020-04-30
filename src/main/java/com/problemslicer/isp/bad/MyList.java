package com.problemslicer.isp.bad;

public interface MyList<T> {
	public T get();
	public void add(T t);
	public T poll();
	public T peek();	
}