package com.sergiopereira.programaremjava;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedLists_vs_ArrayLists {

  public static void main(String[] args) {

    // Cria uma nova lista vazia
    LinkedList<String> list = new LinkedList<>();

    // Adiciona elementos à lista
    list.add("Oi");
    list.add("Tudo");
    list.add("Bem");

    // Verifica o tamanho da lista
    System.out.println(list.size()); // imprime 3

    // Verifica se a lista está vazia
    System.out.println(list.isEmpty()); // imprime false

    // Verifica se a lista contém um elemento específico
    System.out.println(list.contains("Oi")); // imprime true
    System.out.println(list.contains("oi")); // imprime false

    // Recupera um elemento da lista pelo índice
    System.out.println(list.get(0)); // imprime "Oi"

    // Remove um elemento da lista pelo índice
    list.remove(1);

    // Percorre a lista usando um for-each
    for (String s : list) {
      System.out.println(s);
    }
    // imprime:
    // Oi
    // Bem

  }
}
