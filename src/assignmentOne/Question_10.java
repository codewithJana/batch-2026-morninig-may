package assignmentOne;

public class Question_10 {

	public static void main(String[] args) {
		question_10();

	}

	private static void question_10() {
		int[][] data= {
				{12,45,33},
				{28,16,54},
				{71,39,22}
		};
		
		
		
		
		for(int i=0;i<data.length;i++) {
			int sum=0;
			for(int j=0;j<data.length;j++) {
				sum = sum+data[i][j];
			}
			System.out.println("Row "+i+" Sum:"+ sum);
		}
		
		for(int i=0;i<data[0].length;i++) {
			int max=data[0][i];
			for(int j=0;j<data.length;j++) {
				if(data[j][i]>max) {
					max=data[j][i];
				}
			}
			System.out.println("Column "+i+" Max:"+ max);
			
		}
	}

}
