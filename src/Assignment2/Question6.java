package Assignment2;

public class Question6 {

    static void main(String[] args) {
        int x = 5, y = 10, z = 0;
       /*z = x++ + ++y; // z=x+1+y=5+1+10=16
        x = x + y;//6+11=17
        y = y - z;//11-16=-5
        System.out.println("x=" + x + ", y=" + y + ", z=" + z);*/

       x+=1;//x=x+1=6
        z=x+y;//6+10=16
        x++;//6+1=7
       x+=y;//x=x+y=7+10=17
        y++;//10+1=11
       y-=z;//y=y-z=11-17=-5

        System.out.println("x=" +x+", y=" +y+", z=" +z);

    }
}
