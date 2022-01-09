
//2. Write a Java program to sum values of an array.

public class Length {

    public static void main(String [] args){

        int[] p1 ={1,2,3,4,5};
        int[] p2 ={10,20,30,40,50};
        int[] p3 = new int[p1.length];
      
        
        for (int i=p1.length -1 ; i>=0 ; i--){

            p3[i]= p1[i] += p2[i];
            
            System.out.println( "Index " +  i + " e igual a = " + p3[i]);
            
        }
        
    }
}