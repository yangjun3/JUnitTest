package com.itcast.junit4;

public class T {
	public int add(int x,int y) {
		return x+y;
	}
	
	public int divide(int x,int y) {
		return x/y;
}
	
	public static void main(String[]args) {
		int z= new T().add(2, 3);
		System.out.println(z);
	}
}