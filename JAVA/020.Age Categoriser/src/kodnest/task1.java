package kodnest;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your Name and year of birth");
		String name=scan.nextLine();
		int DOB=scan.nextInt();
		greet(name);
		int age=calculateAge(DOB);
		System.out.println("your age is "+age);
	}
	public static void greet(String name) {
		System.out.println("helloo" +name);
	
	}
	public static int calculateAge(int DOB) {
		return(2023-DOB);
	}
	

}
