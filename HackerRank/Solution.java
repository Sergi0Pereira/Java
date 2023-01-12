import java.util.*;

public class Solution {


    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String conjunto=null;
        s.replaceAll(" ", "");
        int j=1;
        ArrayList <String> conjuntos = new ArrayList<>();

        
        for(int i=0;i<s.length()-1;i++){
            if(j<=k ){
                conjunto+=s.charAt(i);
                j++;
            }
            else{
                conjuntos.add(conjunto);
                conjunto=null;
                j=1;
            }
        for(int p=0; i< conjuntos.size();i++){
            int z=largest.compareTo(conjuntos.get(p));
            int c=smallest.compareTo(conjuntos.get(p));
            if(z>0){
            largest=conjuntos.get(p);
            }
            else if (c<0){
                smallest= conjuntos.get(p);
            }
        }
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}