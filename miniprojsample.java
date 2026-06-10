import java.util.*;

 class Parent {
     String name;
     int age;
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
     int m1,m2,m3;
        void getStudentDetails()
        {
             Scanner inp = new Scanner(System.in);
 System.out.println("Enter  mark 1:");
        m1 = inp .nextInt();
        System.out.println("Enter  mark 2:");
        m2 = inp .nextInt();
        System.out.println("Enter  mark 3:");
    
        m3 = inp .nextInt();

        }
        void calcavg()
        {
            double avg = (m1+m2+m3)/3.0;
            System.out.println("Average mark: " + avg);
        }
        void Percent()
        {
            double total =((m1+m2+m3)/300.00)*100;
            System.out.println("Percentage: " + total);

        }
    }
    

public class miniprojsample{
   
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();

        Stu arr[]= new Stu[n];
        for(int i=0;i<n;i++)
        {
            
            arr[i]= new Stu();
            arr[i].getPersonalDetails();
            arr[i].getStudentDetails();
            arr[i].calcavg();
            arr[i].Percent();
        }
        
        

        for(int i=0;i<n;i++)
        {
            
        System.out.println("Name: " + arr[i].name);
        System.out.println("Age: " + arr[i].age);
        System.out.println("Enter  mark 1:"+arr[i].m1);
              System.out.println("Enter  mark 2:"+arr[i].m2);
                 System.out.println("Enter  mark 3:"+arr[i].m3);
        
    }

    }
}
