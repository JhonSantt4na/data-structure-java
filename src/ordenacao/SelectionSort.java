package ordenacao;

public class SelectionSort {
   public static void main(String[] args) {
      int[] vetor = new int[] { 3, 5, 4, 9, 8, 7, 10, 2, 54, 12 };
      System.out.println();
      System.out.print("Desordenado : ");

      for (int num : vetor) {
         System.out.print(num + " ");
      }

      // Algoritmo

      int posMenor, aux;
      for (int i = 0; i < vetor.length; i++) {
         posMenor = i;
         for (int j = i + 1; j < vetor.length; j++) {
            if (vetor[j] < vetor[posMenor]) {
               posMenor = j;
            }
         }
         aux = vetor[posMenor];
         vetor[posMenor] = vetor[i];
         vetor[i] = aux;
      }
      System.out.println();
      System.out.print("Ordenado : ");

      for (int num : vetor) {
         System.out.print(num + " ");
      }
      System.out.println();
   }
}
