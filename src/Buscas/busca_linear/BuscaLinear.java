package Buscas.busca_linear;

import java.util.Scanner;

public class BuscaLinear {
   public static void main(String[] args) {
      /*
       * Logica :
       * Criaremos uma variavel auxiliar "temNumeroBuscado"
       * essa variavel é booleana iniciada com false
       * fazemos um for rodando todo o array
       * se achar o valor substitui o valor da variavel auxiliar para true
       * break para sair do for
       * fora do for, fazemos um if, se o valor da varivel auxiliar
       * for = true imprimimos achou
       * for = false imprimimos não achou
       * 
       * O(n) - pois quanto maio o vetor maio o tempo de busca
       * 
       */

      int[] vetor = new int[8];

      for (int i = 0; i < vetor.length; i++) {
         vetor[i] = (int) (Math.random() * 10); // Add valor aleatorio
         System.out.println(vetor[i]);
      }

      // Criando uma Busca Linear
      System.out.print("Qual numero você quer buscar ?");
      Scanner sc = new Scanner(System.in);
      int buscado = sc.nextInt();

      boolean hasValue = false;

      for (int i = 0; i < vetor.length; i++) {
         if (vetor[i] == buscado) {
            hasValue = true;
            break;
         }
      }

      if (hasValue) {
         System.out.println("Achou !");
      } else {
         System.out.println("Valor não encontrado!");
      }

      sc.close();
   }
}
