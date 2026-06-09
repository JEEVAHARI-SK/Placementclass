import java.util.*;


 class Parent {
    public String name;
    public int age;
    void getPersonalDetails()
    {
     Scanner inp = new Scanner(System.in);

        System.out.println("Enter your name:");
        name = inp .nextLine();
        System.out.println("Enter your age:");
        age = inp .nextInt();
       
    }
 }
    class Stu extends Parent{
        public int mark;
        void getStudentDetails()
        {
             Scanner inp = new Scanner(System.in);
 System.out.println("Enter your mark:");
        mark = inp .nextInt();
        }
    }
    

public class miniprojsample{
   
    public static void main(String[] args){
        Stu s = new Stu();
        s.getPersonalDetails();
        s.getStudentDetails();
        System.out.println("Name: " + s.name);
        System.out.println("Age: " + s.age);
        System.out.println("Mark: " + s.mark);
    }


}
