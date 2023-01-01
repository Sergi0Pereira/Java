
public class arreiosposicoes {
    public static void main(String[] args) {
      int[] cars = {21,65,99,86,63,55,48,96,36,52};
        
            
          for (int i=cars.length -1;  i >=0; i--){

          //if (i <= -1)

           // break;
            
            System.out.print(i+  "|  |"  + cars[i]); // i representa o index e o cars[i] representa o que esta dentro do index

            int j= cars[i] + i;

            System.out.println("  = " + j);}
           
    {
      String nome= "Sergio";

      char[]troca = nome.toCharArray();

      troca[1]='a';

      nome= new String(troca);

        System.out.println("");

        System.out.println(nome);
            
                                  }  
    }
  }