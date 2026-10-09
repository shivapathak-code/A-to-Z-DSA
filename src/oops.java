// Hence all classes abd object must bi allocated in java in dynamically;
class Student{  // here is created a class and assign the vales inside the class;
    int rno;
    String name;
    float marks;

    // that is create a parametrized constructor ;
    Student(int rollno , String name , float marks)
    {
        this.rno = rollno;
        this.name = name;
        this.marks = marks;
    }
}
public class oops {
    public static void main(String[] args)
    {
        Student shiva = new Student(10 , "Shiva pathak" , (float) 92.62f);
        Student mayank = new Student(20 , "Mayank Kumar" , (float) 90.62f);
        Student saif = new Student(30 , "Mohd saif" , (float) 91.62f);
        // here is create a object of a student that is name is shiva ;
//        shiva.rno = 10;
//        shiva.name = "shiva pathak";
//        shiva.marks = 92.60F;
        System.out.println(shiva.rno);
        System.out.println(shiva.name);
        System.out.println(shiva.marks);

        System.out.println(mayank.rno);
        System.out.println(mayank.name);
        System.out.println(mayank.marks);

        System.out.println(saif.rno);
        System.out.println(saif.name);
        System.out.println(saif.marks);
    }
}
