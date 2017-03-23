
public class C {
    public static void main(String[]args)
    {
    drived d=new drived();
    d.findarea(50.5);
    
        drived d1=new drived();//mehtod overloading b horhe ha
    d.findarea(50);//alg alg value dkha rha ha

    
    }
}


class drived
{
double radius;
double area;

//now create method
public void findarea(double r)//asy method waly qstn m 
        //value set krni prti h mtlb data type k sath wala kam
{
   radius=r;
area=3.14*radius*radius;
System.out.println(area);



}


}