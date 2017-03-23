public class StringClass {

    public static void main(String[] ar) {
        String s = "i love pakistan";
        int i;
        int A = 0, E = 0, I = 0, O = 0, U = 0;
        for (i = 0; i < s.length() - 1; i++) {

            switch (s.charAt(i)) {
                case 'A':
                case 'a':
                    A++;
                    break;
                case 'E':
                case 'e':

                    E++;
                case 'I':
                case 'i':
                    A++;

                    break;
                case 'O':
                case 'o':
                    O++;
                    break;
                case 'U':
                case 'u':
                    U++;
                    break;

            }
        }
        System.out.println("i love pakistan \n");
        System.out.println("A are in this string\t" + A);
        System.out.println("E area in this string\t" + E);
        System.out.println("I area in this string\t" + I);
        System.out.println("O area in this string\t" + O);
        System.out.println("U area in this string\t" + U);

    }
}

