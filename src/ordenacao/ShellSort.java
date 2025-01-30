package ordenacao;

public class ShellSort {
   public static void main(String[] args) {
      int[] vetor = new int[20];

      for (int i = 0; i < vetor.length; i++) {
         vetor[i] = (int) (Math.random() * vetor.length);
      }

      System.out.println();
      System.out.print("Vetor Desordenado: ");
      for (int nums : vetor) {
         System.out.print(nums + " ");
      }

      int h = 1;
      int m = vetor.length;
      while (h < m) {
         h = h * 3 + 1;
      }
      h = (int) (Math.floor(h / 3));

      int elemento, j;
      while (h > 0) {
         for (int i = h; i < m; i++) {
            elemento = vetor[i];
            j = i;
            while (j >= h && vetor[j - h] > elemento) {
               vetor[j] = vetor[j - h];
               j = j - h;
            }
            vetor[j] = elemento;
         }
         h = h / 2;
      }

      System.out.println();
      System.out.print("Vetor Ordenado: ");
      for (int nums : vetor) {
         System.out.print(nums + " ");
      }
   }
}
