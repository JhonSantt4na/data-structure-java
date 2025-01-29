package ordenacao;

public class InsertionSort {
   public static void main(String[] args) {
      int[] vetor = new int[10];

      for (int i = 0; i < vetor.length; i++) {
         vetor[i] = (int) (Math.random() * vetor.length);
      }

      // Vetor desordenado
      System.out.print("Desordenado: ");
      for (int numero : vetor) {
         System.out.print(numero + " ");
      }

      System.out.println();
      int aux, j;
      for (int i = 1; i < vetor.length; i++) {
         aux = vetor[i];
         j = i - 1;
         while (j >= 0 && vetor[j] > aux) {
            if (vetor[j] > aux) {
               vetor[j + 1] = vetor[j];
               j--;
            }
            vetor[j + 1] = aux;
         }
      }

      // Vetor Ordenado
      System.out.print("Ordenado: ");
      for (int numero : vetor) {
         System.out.print(numero + " ");
      }
      System.out.println();
   }
}
