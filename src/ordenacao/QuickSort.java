package ordenacao;

public class QuickSort {
   /*
    * Existe mais versões deles
    * Um dos mais rapidos pq ele divide o vetor em pedaço menores
    * 
    */
   public static void main(String[] args) {
      int[] vetor = new int[10];

      for (int i = 0; i < vetor.length; i++) {
         vetor[i] = (int) Math.floor(Math.random() * vetor.length);
      }

      System.out.print("Desordenado :");
      for (int num : vetor) {
         System.out.print(num + " ");
      }

      System.out.println();

      // Divide o vetor, em cada partição do pivo
      quicksort(vetor, 0, vetor.length - 1);

      System.out.print("Ordenado :");
      for (int num : vetor) {
         System.out.print(num + " ");
      }
      System.out.println();
   }

   static void quicksort(int[] vetor, int esquerda, int direita) {
      if (esquerda < direita) {
         int p = particao(vetor, esquerda, direita); // Obtém o índice do pivô e divide o vetor
         quicksort(vetor, esquerda, p - 1); // Ordena a partição à esquerda do pivô
         quicksort(vetor, p + 1, direita); // Ordena a partição à direita do pivô
      }
   }

   static int particao(int[] vetor, int esquerda, int direita) {
      int meio = (esquerda + direita) / 2; // Escolhe o pivô como o elemento do meio
      int pivot = vetor[meio];
      int i = esquerda - 1; // Inicializa i antes do início do vetor
      int j = direita + 1; // Inicializa j após o final do vetor

      while (true) {
         // Avança i enquanto o elemento for menor que o pivô
         do {
            i++;
         } while (vetor[i] < pivot);

         // Recua j enquanto o elemento for maior que o pivô
         do {
            j--;
         } while (vetor[j] > pivot);

         // Se os índices se cruzarem, retorna j
         if (i >= j) {
            return j;
         }

         // Troca os elementos vetor[i] e vetor[j]
         int aux = vetor[i];
         vetor[i] = vetor[j];
         vetor[j] = aux;
      }
   }
}
