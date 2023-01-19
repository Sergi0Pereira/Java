import java.io.*;
import java.util.*;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        String f[] = s.split("[ !?._,@']+|\\s+");
        int n=f.length;
        if(s.isBlank()){
            System.out.println(0);
            System.exit(0);
        }
        System.out.println(n);
        for(String a:f){
            System.out.println(a);
        }
        scan.close();
    }
}

