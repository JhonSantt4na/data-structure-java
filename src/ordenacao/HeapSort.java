package ordenacao;

public class HeapSort {
   public static void main(String[] args) {
      int[] vetor = new int[10];
      for (int i = 0; i < vetor.length; i++) {
         vetor[i] = (int) (Math.random() * vetor.length);
      }

      System.out.println("Desordenado:");
      for (int i : vetor) {
         System.out.print(i + " ");
      }
      System.out.println();

      // Heap Sort
      int n = vetor.length;

      // Construir o heap
      for (int i = n / 2 - 1; i >= 0; i--) {
         aplicarHeap(vetor, n, i);
      }

      System.out.println("Heap construído:");
      for (int i : vetor) {
         System.out.print(i + " ");
      }
      System.out.println();

      // Extrair elementos do heap e ordenar
      for (int j = n - 1; j >= 0; j--) {
         int aux = vetor[0];
         vetor[0] = vetor[j];
         vetor[j] = aux;

         aplicarHeap(vetor, j, 0);
      }

      System.out.println("Ordenado:");
      for (int i : vetor) {
         System.out.print(i + " ");
      }
   }

   private static void aplicarHeap(int[] vetor, int n, int i) {
      int raiz = i;
      int esquerda = 2 * i + 1;
      int direita = 2 * i + 2;

      // Verificar filho esquerdo
      if (esquerda < n && vetor[esquerda] > vetor[raiz]) {
         raiz = esquerda;
      }

      // Verificar filho direito
      if (direita < n && vetor[direita] > vetor[raiz]) {
         raiz = direita;
      }

      // Trocar e continuar heapifying se necessário
      if (raiz != i) {
         int aux = vetor[i];
         vetor[i] = vetor[raiz];
         vetor[raiz] = aux;
         aplicarHeap(vetor, n, raiz);
      }
   }
}