
public class Sample {

    int a;
    int b;
    //sample ki wja sy obj m value dna zrore ha  mehtod bna kr main m khud value dni 
    //prti ha constructor hta kr chlay  fr pta chly ga method r constructor ka
    public Sample(int a,int b){
        this.a=a;
        this.b=b;
        
    }

    public void setdata(int a, int b) {

        this.a = a;
        this.b = b;
    }

    public void add() {
int sum;
sum=a+b;
System.out.println("sum is\t"+sum);
    }
public static void main(String[]args){
    
    Sample s=new Sample(4,4);
    
   // s.setdata(5,5 );
    s.add();
    
}
}
