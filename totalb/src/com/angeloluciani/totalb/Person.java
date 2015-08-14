package com.angeloluciani.totalb;

public class Person {
	//fields
	private String name; //name of the person
	private int maximumBooks; // most books the person can checkout
	
	//constructor
	public Person()
	{
		name = "Unknow name";
		maximumBooks = 3;
	}
	
	public String getName ()
	{
		return name;
	}
	
	public void setName( String anyName) {
		name = anyName;
	}

	public int getMaximumBooks() {
		return maximumBooks;
	}

	public void setMaximumBooks(int maximumBooks) {
		this.maximumBooks = maximumBooks;
	}
	
	
}
