package strings;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("Before Swapping a="+a);
		System.out.println("Before Swapping b="+b);
		//swapDemo(a,b);
	}
public static void swapDemo(int a,int b)
{
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After Swapping a="+a);
	System.out.println("After Swapping b="+b);
}
	}


