package strings;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int count=10;
		int []fib=new int[count];
		//fib[0]=0;                  //0 1 1 2 3 5 8 13 21
		                           //fib[i]=fib[i-1]+fib[i-2];(1=(2-1)+(2-2))  
		fib[1]=1;
		for(int i=2;i<count;i++)
		{
			fib[i]=fib[i-1]+fib[i-2];
				}
for(int i:fib)	
{
System.out.println(i);	

}
	}
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	