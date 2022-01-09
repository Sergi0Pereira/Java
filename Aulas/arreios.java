

public class arreios {
    public static void main(String[] args) {

        int[] arreio = { 10, 20, 30, 40, 50, 60, 70, 80 };
        String s1 = "abcdef";

        char[]a = s1.toCharArray();
        a[3]='A';
        s1= new String(a);

        int[] values = new int[20];

        values [13]= 12345 ;



        System.out.println("O numero na posicao 2 e de " + arreio[2]);
        System.out.println(s1.substring(1,2));
        System.out.println(s1.charAt(2));
        System.out.println(a);
        System.out.println(s1);
        System.out.println(values[13]);

    }

}