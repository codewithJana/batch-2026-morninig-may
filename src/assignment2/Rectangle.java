package assignment2;

public class Rectangle {
    double length;
    double width;

   double calculatearea(){
      return length * width;
   }
   double calculatepermiter(){
     return 2*(length + width);
   }

    static void main(String[] args) {

       Rectangle rect1 = new Rectangle();
       rect1.length = 5;
       rect1.width = 10;
       double area1 = rect1.calculatearea();
       double perimeter1 = rect1.calculatepermiter();
        System.out.println("Perimeter of rectangle 1 = " + perimeter1);
        System.out.println("Preimeter of rectangle 1 = " + area1);

       Rectangle rect2 = new Rectangle();
        rect2.length = 15;
        rect2.width = 20;
       double area2 =  rect2.calculatearea();
       double perimeter2 = rect2.calculatepermiter();
        System.out.println("Perimeter of rectangle 2 = " + perimeter2);
        System.out.println("Area of rectangle 2 = " + area2);

        if(area1 > area2) {
            System.out.println("Area of rectangle 1 is greater than rectangle 2");
        }
        else{
            System.out.println("Area of rectangle 2 is greater than rectangle 1");
        }



    }
}
