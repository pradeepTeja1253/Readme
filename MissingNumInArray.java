package strings;
import java.util.Arrays;


public class MissingNumInArray {
	public static void main(String[] args)
	{
	
	int []array= {1,2,3,4,6};
	int MissingNum=getMissingNumber(array,6);
	//System.out.printf("the midding number is:"Arrays.substring(array),MissingNum);
	System.out.println(MissingNum);
}	

	private static int getMissingNumber(int[] array, int n) 
	{
		
		int actualsum=0;
		int expectedsum=(n*(n+1)/2);
		for(int i: array)
		{
			actualsum=actualsum+i;
		}
		
		
		return expectedsum-actualsum;
	}
	
	

}
