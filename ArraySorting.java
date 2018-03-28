package strings;

import java.util.Arrays;
import java.util.Collections;

public class ArraySorting {

	public static void main(String[] args) {
		String str[]= {"a","f","z","c","n"};
		System.out.println("Before sorting :");
		for(String string:str)
		{
						System.out.println(string);
		}
			//For Ascending Order	
			Arrays.sort(str);
			System.out.println("After Ascending Order :");
			for(String string:str)
			{					
				System.out.println(string);
		}
			//For Descending Order	
			System.out.println("After Descending Order :");
			Arrays.sort(str, Collections.reverseOrder());
			for(String string:str)
			{					
				System.out.println(string);
		}
			
	}

}
