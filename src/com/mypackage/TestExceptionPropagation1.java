package com.mypackage;

class TestExceptionPropagation1 {
	void m() {
		int data = 50 / 0;
		System.out.println("inside m");
	}

	void n() {
		m();
	}

	void p() {
		//try {
			n();
		//} catch (Exception e) {
			System.out.println("exception handled");
		//}
	}

	public static void main(String args[]) {
		TestExceptionPropagation1 obj = new TestExceptionPropagation1();
		obj.p();
		System.out.println("normal flow...");
	}
}