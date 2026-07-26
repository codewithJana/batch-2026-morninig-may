package assignmenttwo;

public class Question15 {
	
	public static void main(String[] args) {
		int arr1[]= {1,3,2};
		int arr2[]= {6,5,4};
		
		int[] result=new int[arr1.length+arr2.length];
		
		for(int i=0;i<arr1.length;i++) {
			result[i]=arr1[i];
		}
		
		for(int i=0;i<arr2.length;i++) {
			result[arr1.length+i]=arr2[i];
		}
		
		int start=0;
		int end=result.length-1;
		
		for(int i=0;i<result.length;i++) {
			int temp=result[start];
			result[start]=result[end];
			result[end]=temp;
			
			start++;
			end--;
		}
		
		System.out.print(result);
	}

}
