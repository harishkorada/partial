package org.university;

public class University2 extends University{

	@Override
	public void ug() {
		System.out.println("in this ug curse fees is 90000");
		
	}

	@Override
	public void pg() {
		System.out.println("in this pg course fees is 89000");
		
	}
	public static void main(String[] args) {
		University2 n=new University2();
		n.pg();
		n.ug();
		n.fees();
		
	}
	

}
