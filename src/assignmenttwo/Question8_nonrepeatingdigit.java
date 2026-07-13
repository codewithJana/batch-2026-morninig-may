package assignmenttwo;

public class Question8_nonrepeatingdigit {

	public static void main(String[] args) {
		int[] input= {4,5,1,2,1,4,3,5};
		
		boolean[] visited=new boolean[input.length];
		
		for(int i=0;i<input.length;i++) {
			if(visited[i]) {
				continue;
			}
			int count=1;
			for(int j=i+1;j<input.length;j++) {
				if(input[i] == input[j]) {
					count++;
					visited[j]=true;
				}
			}
			if(count == 1) {
				System.out.println(i+"-->"+count);
				break;
			}
		}

	}

}
