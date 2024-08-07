package org.edu;

public class Education extends Medicine{
	public void ug() {
		System.out.println("Under Graduate");
	}
	public void pg() {
		System.out.println("Post Graduate");
	}
	public static void main(String[] args) {
		Education e=new Education();
		e.ug();
		e.ba();
		e.bba();
		e.bsc();
		e.bEd();
		e.be();
		e.btech();
		e.dental();
		e.physiyo();
		e.mbbs();
		e.pg();
		
	}
}
