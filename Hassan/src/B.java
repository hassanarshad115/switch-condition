
public class B {
    public static void main(String[]args)
    {
    a obj=new a("hassan\t","jinnah colony");
    //obj.add();
    //System.out.println(obj.add());
        System.out.println(obj);

    }
    
}


class a{
String name;
String address;
a(String n,String a)//agr constructor m value dygy to obj m value dni pryge
{
name=n;
address=a;

}
/*
public String add()
{
return name+address;
}
*/
public String toString()
{
String r;
r="name is\t"+name+"\taddress is\t"+address;
return r;
}

}