package com.mypackage;

import java.util.StringTokenizer;

class Teststringcomparison1 {
	public static void main(String args[]) {
		StringTokenizer st = new StringTokenizer("my name is khan", " ");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}