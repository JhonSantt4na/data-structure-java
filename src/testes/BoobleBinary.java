package testes;

import java.util.Scanner;

public class BoobleBinary {

   public static int[] booble(int[] vetor) {
      int aux;
      for (int i = 0; i < vetor.length; i++) {
         for (int j = i + 1; j < vetor.length; j++) {
            if (vetor[i] > vetor[j]) { 
               aux = vetor[j];
               vetor[j] = vetor[i];
               vetor[i] = aux;
            }
         }
      }
      return vetor;
   }

   public static void imprimir(int[] vetor) {
      for (int valor : vetor) {
         System.out.print(valor + " ");
      }
   }

   public static int binary(int[] vetor, int target) {

      int start = 0;
      int end = vetor.length - 1;
      int mid;

      while (start <= end) {
         mid = (start + end) / 2;
         if (vetor[mid] == target) {
            return mid;
         } else if (vetor[mid] < target) {
            start = mid + 1;
         } else {
            end = mid - 1;
         }
      }
      return -1;
   }

   public static void main(String[] args) {

      int[] nums = new int[20];

      for (int i = 0; i < nums.length; i++) {
         nums[i] = i;
      }

      int[] ordenado = booble(nums);

      imprimir(ordenado);
      System.out.println();

      System.out.print("Qual Numero quer Busca no nosso Vetor ? ");
      Scanner sc = new Scanner(System.in);
      int buscado = sc.nextInt();

      int procurandoNoVetor = binary(ordenado, buscado);

      if (procurandoNoVetor != -1) {
         System.out.println("Encontramos o numero " + procurandoNoVetor + " no vetor");
      } else {
         System.out.println("Infelizmente não encontramos");
      }

      sc.close();
   }
}
