package buscas;

import java.util.Scanner;

public class BuscaBinaria {
   public static void main(String[] args) {
      // o(log n) melhor classificação
      // Precisa que esteja o vetor ordenado
      // Iniciando o vetor e Adicionando elementos
      int[] vetor = new int[10000];

      for (int i = 0; i < vetor.length; i++) {
         vetor[i] = i * 2;
      }

      System.out.print("Qual o numero você busca ?");
      Scanner sc = new Scanner(System.in);
      int buscado = sc.nextInt();

      int contador = 0;
      boolean achou = false;

      int inicio = 0;
      int fim = vetor.length - 1;
      int meio;

      while (inicio <= fim) {
         meio = (int) ((inicio + fim) / 2);
         contador++; // Quantos Teste a busca fez
         if (vetor[meio] == buscado) {
            achou = true;
            break;
         } else if (vetor[meio] < buscado) {
            inicio = meio + 1;
         } else {
            fim = meio - 1;
         }
      }

      System.out.println("Quantidade de Testes: " + contador);
      if (achou) {
         System.out.println("Achou !");
      } else {
         System.out.println("Valor não encontrado !");
      }

      sc.close();
   }
}
