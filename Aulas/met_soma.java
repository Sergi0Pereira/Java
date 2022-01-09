import java.util.Scanner;

public class met_soma {
    static void soma(){
    int x,y,sum;
    Scanner in= new Scanner(System.in);
    x=in.nextInt();
    y=in.nextInt();

    sum=x+y;

    System.out.println(sum);

    in.close();
    }
public static void main(String[] args){

    soma();
}

}

