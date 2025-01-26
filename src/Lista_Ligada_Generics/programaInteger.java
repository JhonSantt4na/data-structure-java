package Lista_Ligada_Generics;

public class programaInteger {
   public static void main(String[] args) {
      ListaGenerica<Integer> numeros = new ListaGenerica<Integer>();
      numeros.adicionar(2);
      numeros.adicionar(3);
      numeros.adicionar(4);
      numeros.adicionar(5);

      numeros.remover(5);

      System.out.println("Tamanho da lista: " + numeros.getTamanho());
      for (int i = 0; i < numeros.getTamanho(); i++) {
         System.out.println(numeros.get(i).getValor());
      }
   }
}
