import java.util.Scanner;
public class Sample1 {
    public static void main(String []args)
    {
        
        Scanner s=new Scanner(System.in);
        int rollno;
        System.out.println("enter the value ");
        rollno=s.nextInt();
        switch(rollno){
            case 1: System.out.println("you enter rollno 1 \t answer is \thassan"); break;
            case 2: System.out.println("you enter rollno 2 \t answer is \tali"); break;

            case 3: System.out.println("you enter rollno 3 \t answer is \trizwan"); break;
            default: System.out.println("no name");
        }
        
        
        
    }
    
}
