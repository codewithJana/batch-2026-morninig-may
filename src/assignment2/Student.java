package assignment2;

public class Student {
    int rollNo;
    String name;
    double marks;

    Student(int rollNo,String name,double marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    void display(){
        System.out.println("RollNo = " + rollNo);
        System.out.println("Name = " + name);
        System.out.println("Marks = " + marks);
    }

    static void main(String[] args) {
        Student s1 = new Student(1,"Alex",50);
        Student s2 = new Student(2,"Peter",70);
        Student s3 = new Student(3,"Merry",90);

        Student[] students  = {s1,s2,s3};

        for(int i =0; i<students.length ;i++){
            students[i].display();
        }
    }
}
