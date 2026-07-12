package Assignment1;

/* Problem Statement:Given a 1D integer array: int[] marks = {85, 92, 67, 78, 55, 90}
Use a for loop to print each element with its index position.
Requirements:
• Loop from index 0 to marks.length - 1
• Print format: "Index 0 : 85", "Index 1 : 92", and so on
• After printing all elements, also print the total count of elements
Expected Output:
Index 0 : 85
Index 1 : 92
Index 2 : 67
Index 3 : 78
Index 4 : 55
Index 5 : 90
Total elements: 6
*/
public class Question3 {
    static void main() {
        int[] marks = {85, 92, 67, 78, 55, 90};
        for(int i =0;i <= marks.length;i++)
        {
            System.out.println("Index " +i+" : " +marks[i]);
        }
    }
}
