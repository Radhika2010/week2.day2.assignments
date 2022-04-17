package week1.day2.classroom.arrays;

import java.util.Arrays;

public class MissingElementInAnArray {
public static void main(String[] args) {
	int[] arr = {0,1,2,3,4,7,6,8};
	for (int i=0;i<arr.length;i++)
	{
		if (i!=arr[i])
		{
			System.out.println(i);
		break; 
		}
	}
		
}
}
