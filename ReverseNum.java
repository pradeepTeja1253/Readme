package strings;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		System.out.println("Enter a number :");
		Scanner sc=new Scanner(System.in);
		int original=sc.nextInt();
		int reverse=0;
		int remainder;
		
		while(original !=0)
		{
			remainder=original%10;
			reverse=reverse*10+remainder;
			original=original/10;
			
		}
		System.out.println("The Reverse number is:"+reverse);

	}

}
