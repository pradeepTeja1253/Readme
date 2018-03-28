package strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String input;
		String reverse="";
		System.out.println("Enter the string value:");
		Scanner scanner=new Scanner(System.in);
		input=scanner.nextLine();
		for(int i=input.length()-1;i>0;i--)
		{
			reverse=reverse+input.charAt(i);
		}
		System.out.println("Enter the string value:"+reverse);
	}

}
