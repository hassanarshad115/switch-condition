class student{
int rollno;
int address;
int age;
student(int r,int a,int aa)
{
rollno=r;
address=a;
age=aa;


}
public void add()
{
int r;
System.out.println("rollno is\t"+rollno+"\taddress"+address+"\tage is\t"+age);
}
}



public class A {
    public static void main(String[]args)
    {
    student s=new student(7,7,77);
    
       s.add();
       
    }
    
}
