import java.util.Scanner;
public class VoluumSurface {
    public static void main(String[]args)
    {
    Scanner sc=new Scanner(System.in);
    
    double SphereArea,volum;
    double r ;
    System.out.println("enter the value of radius");
    r=sc.nextDouble();
    
    volum =3.0/4.0*Math.PI*Math.pow(r, 3);//PI ko capital m lna ha
    System.out.println("valum is=\t"+volum);
    
    SphereArea=4.0*Math.PI*Math.pow(r, 2);
    
        System.out.println("sphare area is=\t"+SphereArea);

    }
}
