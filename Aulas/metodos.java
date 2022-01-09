import java.util.Scanner;

public class metodos{
    static void myMethod(){
        Scanner in= new Scanner(System.in);
        String nome;
        nome=in.next();

        System.out.println(nome+", este e o teu primeiro metodo");
        
        in.close();
    }
public static void main(String[]args){
    myMethod();
    myMethod();
    myMethod();
    
    }
}