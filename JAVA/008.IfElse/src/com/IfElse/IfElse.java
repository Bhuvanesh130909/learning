package com.IfElse;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the score");
		int score=scan.nextInt();
		IfElseladder g1=new IfElseladder();
		g1.grade(score);
		scan.close();
		
		
	}

}
