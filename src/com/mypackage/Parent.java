package com.mypackage;

import java.io.*;

class Parent {
	void msg() throws Exception {
		System.out.println("parent");
	}
}

class TestExceptionChild3 extends Parent {
	void msg() {
		System.out.println("child");
	}

	public static void main(String args[]) {
		Parent p = new TestExceptionChild3();
		try {
			p.msg();
		} catch (Exception e) {
		}
	}
}