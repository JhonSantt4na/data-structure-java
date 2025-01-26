package lista_ligada;

public class programa {
   public static void main(String[] args) {
      ListaLigada lista = new ListaLigada();

      lista.adicionar("AC");
      lista.adicionar("BA");
      lista.adicionar("CE");
      lista.adicionar("DF");

      System.out.println("Tamanho : " + lista.getTamanho());
      System.out.println("Primeiro : " + lista.getPrimeiro().getValor());
      System.out.println("Ultimo : " + lista.getUltimo().getValor());

      // Pegando Valores individuais
      System.out.println(lista.get(0).getValor());
      System.out.println(lista.get(1).getValor());
      System.out.println(lista.get(2).getValor());

      for (int i = 0; i < lista.getTamanho(); i++) {
         System.out.println(lista.get(i).getValor());
      }

      // Removendo Valor do Meio "CE"

      lista.remover("AC");
      lista.remover("BA");
      lista.remover("CE");
      // lista.remover("DF");

      lista.adicionar("SP");
      System.out.println("Adicionamos o SP");
      lista.remover("SP");
      lista.remover("DF");
      lista.adicionar("RJ");

      System.out.println("Tamanho da lista: " + lista.getTamanho());
      for (int i = 0; i < lista.getTamanho(); i++) {
         System.out.println(lista.get(i).getValor());
      }
   }
}
