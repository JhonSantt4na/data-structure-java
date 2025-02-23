package fila;

public class App {
   public static void main(String[] args) {

      Fila fila = new Fila();

      fila.adicionar("João");
      fila.adicionar("ze");
      fila.adicionar("Juca");
      fila.adicionar("Maria");
      fila.adicionar("Ana");

      System.out.println("Primeiro da Fila: " + fila.get());
      fila.remover();
      System.out.println("Novo Primeiro da Fila: " + fila.get());
      fila.remover();
      System.out.println("Novo Primeiro da Fila: " + fila.get());
   }
}
