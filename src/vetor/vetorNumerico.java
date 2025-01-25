package vetor;

public class vetorNumerico {
   public static void main(String[] args) throws Exception {
      // Por que precisamos de Vetor?
      int x = 3;
      System.out.println(x);
      x = 4;
      System.out.println(x); // Uma variavel guarda somente um valor por vez

      /*
       * Listas são muito usadas para guarda valores, coisas, componentes...
       * -> vetor é uma lista
       * -> a Primeira posição é 0
       * -> Quando é criado com numeros inteiros ele inicia com 0 em todas as posições
       */

      // tipo[] nomeVetor = new tipo[qtd]
      int[] vetorzao = new int[10];
      System.out.println(vetorzao); // return : [I@2a139a55

      /*
       * [I@2a139a55 = É um hash code que quando o java não consegue
       * identificar o que ele imprime isso, toda variavel, objeto tem.
       */

      // Adicionando Valores no vetor:
      // nossoVetor[posição] = valor;
      vetorzao[0] = 3;
      vetorzao[1] = 4;
      vetorzao[2] = 8;
      vetorzao[3] = 12;
      vetorzao[4] = 51;
      vetorzao[5] = 33;

      // Imprimindo 1 valor por vez:
      System.out.println(vetorzao[0]); // Pela posição conseguimos imprimir o seu valor

      // Andando pelo vetor :
      for (int i = 0; i < vetorzao.length; i++) { // (podemos colocar valor fixo ex:10)
         System.out.print(vetorzao[i] + ", ");
      }
      // vetorzao.length = tamanho do vetorzão
   }
}
