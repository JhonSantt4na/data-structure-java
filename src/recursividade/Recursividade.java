package recursividade;

public class Recursividade {
   public static void main(String[] args) {
      int[] vetor = new int[] { 5, 4, 6, 2, 4, 7, 1, 3 };

      System.out.println("vetor");
      for (int i = 0; i < vetor.length; i++) {
         System.out.println(vetor[i]);
      }

      System.out.println("Soma ");
      System.out.println(somar(0, 0, vetor));
   }

   private static int somar(int soma, int pos, int[] vetor) {
      if (pos < vetor.length) {
         soma = soma + vetor[pos];
         return somar(soma, pos + 1, vetor);
      } else {
         return soma;
      }
   }
}
