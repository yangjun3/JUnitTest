package com.itcast.junit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.itcast.junit4.T;

class TTest {

	@Test
	void testAdd() {
		int z=new T().add(2,4);
		assertEquals(6,z);
		
	}

	@Test
	void testDivide() {
		int z = new T().divide(8, 2);
		assertEquals(4,z);
		assertTrue(3>z);
		System.out.println(z);
	}

}
