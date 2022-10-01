package com.blabz.java;

import java.util.*;

public class LineComparison {

	public static void main(String[] args) {
		System.out.println("WELCOME TO LINE COMPARISON COMPUTATION PROGRAM");
		System.out.println("~~WELCOME TO LINE COMPARISON COMPUTATION PROGRAM~~");
		Scanner sc = new Scanner(System.in);// creating object
		System.out.println("Enter Value X1 X2 Y1 Y2");
		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y1 = sc.nextInt();
		int y2 = sc.nextInt();
		double length;

		length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println("Length Of line: " + length);

	}

}
