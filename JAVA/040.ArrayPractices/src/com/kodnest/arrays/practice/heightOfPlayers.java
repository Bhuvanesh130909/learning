package com.kodnest.arrays.practice;

import java.util.Scanner;

public class heightOfPlayers {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		double arr[]=new double[10];
		scan.close();
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("enter a height");
			arr[i]=scan.nextDouble();
		}
		System.out.println("hight of players");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

	
}
