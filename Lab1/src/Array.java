
class Array {

    public int a[];

    public Array(int n) {
        a = new int[n];//array ko initialize krwany ka method
    }

    public int max(int a[]) {
        int maxx, j;
        maxx = a[0];
        //0 phly he maaxx ko dia hoa ha tbi 1 sy loop start kia ha
        for (j = 1; j < a.length; j++) {

            if (maxx < a[j]) {

                maxx = a[j];
            }
        }
        return maxx;
    }

    public static void main(String[] args) {

        MinArray o = new MinArray(10);

        for (int i = 0; i < o.a.length; i++) {  //input ktni array ki ha
            o.a[i] = i;

        }

        for (int i = 0; i < o.a.length; i++) {//ye output k lye ha k konsa max ha

            System.out.println(o.a[i]);

        }
        System.out.println("Maximum number is\t" + o.max(o.a));
    }
}
