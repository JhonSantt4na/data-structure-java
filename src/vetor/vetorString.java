package vetor;

import java.util.Scanner;

public class vetorString {
   public static void main(String[] args) {
      // Criando um vetor String e Adicionando valores
      String[] estados = new String[10];
      estados[0] = "AC";
      estados[1] = "BA";
      estados[2] = "CE";
      estados[3] = "DF";
      estados[4] = "AM";
      estados[5] = "AP";
      estados[6] = "PB";
      estados[7] = "RN";
      estados[8] = "MS";
      estados[9] = "SP";

      // Imprimindo os vetor de texto
      for (int i = 0; i < estados.length; i++) {
         System.out.println("Estado " + i + ": " + estados[i]);
      }

      // Criando uma Busca Linear

      /*
       * Busca Linear = Não é tão boa pois ela vai do primeiro ate o ultimo
       * pois o custo da operação para o pior caso é muito ruim
       * 
       */
      Scanner sc = new Scanner(System.in);
      System.out.print("Qual sigla você quer buscar :");
      String siglaBuscada = sc.nextLine();

      // Forma incorreta de implementar:

      // for (int i = 0; i < estados.length; i++) {
      // String elemento = estados[i];

      // if (elemento.equals(siglaBuscada)) {
      // System.out.println("Achou");
      // break; // Interrompe ao Achar a SiglaBuscada sem ele dpois que achar a
      // SiglaBuscada
      // ele continua imprimindo "Não Achou"
      // } else {
      // System.out.println("Não Achou");
      // }

      // Porem ainda sim enquanto agente não achar ele fica imprimindo
      // mas como resolver isso ?
      // }

      // Forma Correta
      boolean encontrou = false; // Criaremos uma variavel aux

      for (int i = 0; i < estados.length; i++) {
         String elemento = estados[i]; // Rodamos todo o vetor
         if (elemento.equalsIgnoreCase(siglaBuscada)) { // Se elemento e siglaBuscada for iguais
            encontrou = true; // Mudamos a nossa variavel aux para true
            break; // e finalizamos o For
         }
      }

      // Apos sair do for verificamos se a nossa variavel aux é true ou falseRJ

      if (encontrou == true) {
         System.out.println("Achou !");
      } else {
         System.out.println("Nao Achou !");
      }

      // System.out.println(siglaBuscada);
      sc.close();
   }
}
