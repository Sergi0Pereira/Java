import java.io.*;
import java.util.*;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = "";

        for (int i = 1; i <= A.length(); i++) {
            B += A.charAt(A.length() - i);
        }
        if (A.equalsIgnoreCase(B)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
