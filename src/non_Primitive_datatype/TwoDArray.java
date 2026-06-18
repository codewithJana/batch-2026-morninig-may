package non_Primitive_datatype;

public class TwoDArray {

    static void main(String[] args) {

        //Declare Size first
        int[][] marks = new int[3][3];
        marks[0][0] = 90;
        marks[0][1] = 80;
        marks[0][2] = 70;

        marks[1][0] = 67;
        marks[1][1] = 98;
        marks[1][2] = 85;

        marks[2][0] = 75;
        marks[2][1] = 80;
        marks[2][2] = 95;

        //Direct Initialization
        String[][] employees = {
                {"john","chennai","tester","Grade B"},
                {"david","bangalore","developer","Grade B"},
                {"peter","mumbai","manager","Grade C"}
        };
        //Get the array data
        System.out.println("Employee "+employees[1][0]+" location is "+ employees[1][1]);
        System.out.println("Employee "+employees[2][0]+" role is "+ employees[2][2]);

        //Modify Array data
        employees[1][1] = "Delhi";
        System.out.println("After Modification: Employee "+employees[1][0]+" location is "+ employees[1][1]);

        //size of th Array
        System.out.println("No. of Rows in the Array: "+employees.length);
        System.out.println("No. of Column in the Array: "+employees[0].length);

        //print Entire employee table
        for(int row=0;row<employees.length;row++){
            for(int col=0;col<employees[row].length;col++){
                System.out.print(employees[row][col] + "\t");
            }
            System.out.println();
        }


    }

}
