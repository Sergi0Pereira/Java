package com.sergiopereira.programaremjava;

import java.util.Set;
import java.util.TreeSet;

public class Introducao { // public significa que este codigo ficará disponivel para todas as outras
                          // classes

  static String primeiroNome = "Sérgio Miguel Sousa Castro Pereira";
  static String localidade = "Moro no concelho de Gondomar.";
  static String idade = "Tenho 32 anos.";
  
  public static void main(String[] args) { // funcao main é requirida em todos os programas de java que se criam
                                           // static permite que outras classes tenham acesso
    double PI = 3.1484378734;
    String doubletoString = Double.toString(PI); // A string vai herdar o valor da variavel double... Pode-se fazer esta
                                                 // funçao com shorts,longs,int,etc..
    int doubletoInt = (int) PI;
    Set<String> s2 = new TreeSet<>();

    s2.add("sergio");
    System.out.println("Eu sou o " + primeiroNome + ".");
    System.out.println(idade);
    System.out.println(localidade);
    System.out.println("O número PI é de: " + PI + ".");
    System.out.println(Integer.MIN_VALUE); // valor mínimo de um Integer ( .MIN_VALUE)
    System.out.println(Integer.MAX_VALUE); // valor máximo de um Integer ( .MAX_VALUE)
    System.out.print(doubletoInt);
    System.out.println(s2);
  }
}
