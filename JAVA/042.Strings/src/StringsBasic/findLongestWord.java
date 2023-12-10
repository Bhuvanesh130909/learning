package StringsBasic;

import java.util.Scanner;

public class findLongestWord {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
	    String arr[]= str.split(" ");
	    String str1;
	    String max="";
	    for(int i=0;i<=arr.length-1;i++)
	    {
	    	str1=arr[i];
	    	if(str.length()>max.length())
	    	{
	    		max=str;
	    	}
	    }
	    System.out.println(max);

	}

}
