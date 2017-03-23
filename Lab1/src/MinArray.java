class MinArray {//min array  nam ki class bnar 

    public int a[];//3 instance veriable with acces modifier public

    public MinArray(int n)//2 create constructor class name,no return type
    {
        this.a = new int[n];//4 initailize array with int type a this use for present int a in constructor

    }//constructor end

//create a method whose name max getting input paramente a array and return max
    public int max(int[] a) {

        int maxx = a[0];
        for (int j = 1; j < a.length; j++) {

            if (maxx < a[j]) {

                maxx = a[j];

            }

        }
        return maxx;

    }

//method ki return type hoti ha constructor ki ni hoti
//
//6now create main class
    public static void main(String[] args) {

        MinArray o = new MinArray(10); //7 create obj () ismy value dyna zrore ha

        for (int i = 0; i < o.a.length; i++) {
            o.a[i] = i;

        }

        for (int i = 0; i < o.a.length; i++) {

            System.out.println(o.a[i]);

        }
        System.out.println("max\t" + o.max(o.a));

    }

}
