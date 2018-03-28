package strings;

import java.math.BigInteger;

public class LargeFactorial {
//
//	public static void main(String[] args) {
//		int num=20;
//		int fact=1;
//		for(int i=1;i<=num;i++)
//		{
//			fact=fact*i;
//		}
//System.out.println(fact);
//	}



public static void main(String[] args) {
	int num=20;
	BigInteger fact=BigInteger.ONE;
	for(int i=1;i<=num;i++)
	{
		fact=fact.multiply(BigInteger.valueOf(i));
	}
System.out.println(fact);
}
}
