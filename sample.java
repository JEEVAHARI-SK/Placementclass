import java.util.*;
class sample
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = inp.nextInt();
        
        System.out.print("Enter second number: ");
        int b = inp.nextInt();
        
        System.out.println("Addition of 2 numbers : "+(a+b));
        
        System.out.println("Subraction of 2 numbers : "+(a-b));
        
        System.out.println("Multiple of 2 numbers : "+(a*b));
        
        System.out.println("Division of 2 numbers : "+(a/b));
        
        System.out.println("a<b : "+(a<b));
        System.out.println("a>b : "+(a>b));
        System.out.println("a==b : "+(a==b));
        System.out.println("a<=b : "+(a/b));
        System.out.println("a && b : "+(a>0&&b<8));
        System.out.println("a || b : "+(a>0||b<9));
        System.out.println("a ! b : "+!(a>b));
        
        
        
    
}
}