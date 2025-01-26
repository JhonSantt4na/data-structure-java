package listaXvetor;

import java.util.ArrayList;

import Iterator.IteratorListaLigada;
import Lista_Ligada_Generics.ListaGenerica;

public class Comparacao {
   public static void main(String[] args) {

      // Criando a ListaLigadaGenerica
      ListaGenerica<Integer> lista = new ListaGenerica<Integer>();

      // Criando um vetor com a interface ArrayList
      ArrayList<Integer> vetor = new ArrayList<Integer>();

      /*
       * Formas de Comparação :
       * 
       * Tempo - Quanto tempo levamos para processar a adição, porem não é
       * uma medida tão fiel de medir.
       * 
       * Memoria - ainda mais dificil pois o uso de CPU é um parametro muito
       * mais dificil.
       */

      // Comparando Adição de Elementos
      System.out.println("\nComparando Adição de Elementos\n");

      // Com Vetor
      int limite = 100000;
      long tempInicial = System.currentTimeMillis();

      for (int i = 0; i < limite; i++) {
         vetor.add(i);
      }

      long tempFinal = System.currentTimeMillis();
      System.out.println("Adicionou " + limite + " Elementos no vetor");
      System.out.println(tempFinal - tempInicial); // return - 88

      System.out.println();

      // Com ListaLigada
      tempInicial = System.currentTimeMillis();

      for (int i = 0; i < limite; i++) {
         lista.adicionar(i);
      }

      tempFinal = System.currentTimeMillis();
      System.out.println("Adicionou " + limite + " Elementos na Lista");
      System.out.println(tempFinal - tempInicial); // return - 126

      // Comparando Ler de Elementos
      System.out.println("\nComparando Leitura de Elementos\n");

      /*
       * A ListaLigada para acessa o valor 1000 por exemplo ele basicamente
       * vai de 1 em 1 até chegar no valor 1000. 0,1,2,3,4...
       * 
       * Já o vetor ele basicamente acessa a posição diretamente pois ele tem
       * indece ou seja cada valor tem uma posição fixa e ao pedir pra
       * pegar o valor 1000 basicamente ele so vai na posição 1000 e imprime o seu
       * valor.
       */

      // Leitura de Valores com Vetor

      tempInicial = System.currentTimeMillis();
      for (int i = 0; i < vetor.size(); i++) { // vetor.size() = Desta forma pegamos o tamanho do vetor
         // System.out.println(vetor.get(i)); um recurso a + para imprimir os elementos
         vetor.get(i);
      }
      tempFinal = System.currentTimeMillis();
      System.out.println("Tempo de Leitura do Vetor");
      System.out.println(tempFinal - tempInicial); // return - 6

      // Leitura de Valores da Lista

      tempInicial = System.currentTimeMillis();
      IteratorListaLigada<Integer> iterator = lista.getIterator();

      while (iterator.temProximo()) {
         iterator.getProximo();
      }

      tempFinal = System.currentTimeMillis();
      System.out.println("Tempo de Leitura do Lista Ligada");
      System.out.println(tempFinal - tempInicial); // return - Tecnicamente Muito demorado

      /*
       * Antes do iterator como funcinava :
       * 
       * para pegar o item 5 oq fazia ?
       * primeira rodada : 1 // Não achou
       * segunda rodada :1,2 // Não achou
       * terceira rodada :1,2,3 // Não achou
       * quarta rodada :1,2,3,4 // Não achou
       * quinta rodada :1,2,3,4,5 // Achou
       * ja que achou parava de roda.
       * porem imagina isso com 100000 itens.
       * 
       * com o Iterrator :
       * 
       * Basicamente ele guarda o seu ultimo numero,
       * como uma busca linear ex:
       * para pegar o item 3
       * 
       * rodada 1 : 1 (não achou), 2 (não achou),3 (achou)
       * se achou parava de procurar
       */

   }
}
