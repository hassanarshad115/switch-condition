import java.util.Scanner;

public class Squareroot {
    public static void main(String[]arsg)
    {
        Scanner sc=new Scanner(System.in);
    double a;
    int r;
    
    System.out.println("enter the value of a=");
    a=sc.nextInt();
    //r=a*a;
    r=(int)Math.abs(Math.pow(a , 2) );
    System.out.println(r);
    
    
    }
    
}
