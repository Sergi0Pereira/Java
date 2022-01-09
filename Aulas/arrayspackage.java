
import java.util.Arrays;

public class arrayspackage {
    public static void main(String args[]) {

        int[] primes = {2,3,5,7,11,13};
        int[] p2 = {2,3,5,7,16,13};
        double[] p3 = {92.4, 56,92,93,67,89};
        int[][] bidimensional= { {1, 2 ,3, 4},
                                 {5, 6, 7, 8},
                                 {9, 10, 11, 12}};    

        System.out.println(primes); // imprime o endereço do arreio
        
        System.out.println(Arrays.toString(primes)); // imprime o conteudo do arreio com o metodo Arrays.toString()

        System.out.println(primes==p2); // esta a compara o endereço dos arreios e nao o seu conteudo do arreios

        System.out.println(Arrays.equals(primes,p2)); // este metodo compara o conteudo dos arreios atraves da funçao Arrays.equals()

        System.out.println(p2); 

        Arrays.sort(p3);// esta funçao/metodo(sort) coloca o arreio por ordem numerica/Alfabetica

        System.out.println(Arrays.toString(p3)); 

        System.out.println(bidimensional); // imprime o endereço do cconjunto de arreio

        System.out.println(Arrays.toString(bidimensional)); // imprime o endereço de cada um dos arreio
        
        System.out.println(Arrays.deepToString(bidimensional)); // imprime o conteudo de cada arreio atraves da funçao deep.toString()

        System.out.println(bidimensional.length); // imprime o numero de linhas da matriz

        System.out.println(bidimensional[0].length); // imprime o numero de colunas da matriz
    }
}
