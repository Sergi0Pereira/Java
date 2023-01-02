package HackerRank;

import java.util.*;

public class InicializaçaoStatic {
    static int B;
    static int H;
    static boolean flag;

    static {
        Scanner scan = new Scanner(System.in);
        B = scan.nextInt();
        H = scan.nextInt();
        scan.close();

        if (B > 0 && H > 0) {
            flag = true;
        } else {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }
}

/*
 * Explicação:
 * 
 * O bloco de inicialização estática é um bloco de código que é executado quando
 * a classe é carregada na memória. Ele é usado para inicializar variáveis
 * estáticas.
 * Neste caso, estamos usando o bloco de inicialização estática para ler os
 * valores de B e H da entrada padrão e verificar se ambos são maiores que zero.
 * Se ambos são maiores que zero, definimos a variável flag como true e
 * prosseguimos para calcular a área do paralelogramo no método principal.
 * Se B ou H não são maiores que zero, definimos a variável flag como false e
 * imprimimos a mensagem de exceção.
 * No método principal, verificamos o valor da variável flag. Se for true,
 * calculamos a área do paralelogramo e a imprimimos. Se for false, não fazemos
 * nada porque a mensagem de exceção já foi impressa no bloco de inicialização
 * estática.
 */
