package com.cubic.assignment.demo;

public class MemberClass {
	private int data=72;
	private void read(){
		System.out.println("printing numbers");
	}
	class Inner{
		void print(){
			read();
			System.out.println("data"+data);
			
		}
	}

	public static void main(String[] args) {
		MemberClass m=new MemberClass();
		Inner in=m.new Inner();
		in.print();
		

	}

}
