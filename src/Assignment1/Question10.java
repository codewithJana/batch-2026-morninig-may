package Assignment1;

public class Question10 {

    static void main(String[] args) {
        int sum=0;
        int[][] data = {
                {12, 45, 33},
                {28, 16, 54},
                {71, 39, 22}
        };
        for(int column=0;column<data.length;column++){
            for( int row=0;row<data.length;row++){
                sum=sum+data[column][row];
            }
            System.out.println("Row "+ column +" Sum :"+ sum);
            sum=0;
            continue;
        }
        //maximum value
        for(int column=0;column<data.length;column++){
            int max=data[0][column];
            for(int row=0;row<data.length;row++){
                if(data[row][column]>max){
                    max=data[row][column];
                }
            }
            System.out.println("Column "+column+" Max:"+ max);
        }

        }
    }

