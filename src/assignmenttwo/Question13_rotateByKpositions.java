package assignmenttwo;

import java.util.Arrays;

public class Question13_rotateByKpositions {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		
		int k=3;
		
		rotateBy(arr,0,arr.length-1);
		rotateBy(arr,0,k-1);
		rotateBy(arr,k,arr.length-1);
		
		System.out.print(Arrays.toString(arr));
		
		
				
	}
	
	public static int[] rotateBy(int[] arr,int start,int end) {
		
		while(start < end) {
		    int temp = arr[start];
		    arr[start] = arr[end];
		    arr[end] = temp;

		    start++;
		    end--;
		}
		
		return arr;
		
	}

}
