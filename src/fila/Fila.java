package fila;

import lista_ligada.ListaLigada;

public class Fila {
   /*
    * Podemos fazer com ArrayList (Porem como as
    * inserssões no array é ruim) preferivel usar
    * lista ligada:
    */

   private ListaLigada lista;

   public Fila() { // Injection Dependece
      this.lista = new ListaLigada();
   }

   public void adicionar(String novoValor) {
      this.lista.adicionar(novoValor); // Adicionamos no final
   }

   public void remover() {
      // Precisamos remover do inicio
      this.lista.remover(this.get());
   }

   public String get() {
      // Sempre pega o primeiro da fila
      return this.lista.getPrimeiro().getValor();
   }

}
