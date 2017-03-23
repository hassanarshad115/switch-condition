class b{

boolean on;
b(boolean bb)
{
on=bb;

}
@Override
public String toString()
{
return "turned on "+on;

}



}
public class Bolb {
    public static void main(String[]args)
    {
        
    b obj=new b(true);
    b obj1=new b(true);
    //obj m jo daly gy whe show hoga true ya false m sy
    b obj2=new b(false);
    b obj3=new b(false);
//hr obj ko elyda elyda dkhaygy
    System.out.println(obj);
    System.out.println(obj1);
    System.out.println(obj2);
    System.out.println(obj3);

}
}