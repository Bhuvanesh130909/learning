package StringsBasic;

import java.util.Scanner;

public class pangram {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		String s1=str.toLowerCase();
		char arr[]=str.toCharArray();
		boolean b[]=new boolean [26];
		for(int i=0;i<=arr.length-1;i++)
		{
			int res='a'-arr[i];
			b[i]=true;
			
		}
		for (int i=0;i<=b.length-1;i++)
		{
			if(b[i]==false)
			{
				System.out.println("not a panagram");
				return;
			}
		}
		System.out.println("its panagram");
		
	}
	

}
