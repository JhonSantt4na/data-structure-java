package pilha;

import lista_ligada.ListaLigada;

public class Pilha {
   /*
    * Podemos fazer com ArrayList (Porem como as
    * inserssões no array é ruim) preferivel usar
    * lista ligada:
    */

   private ListaLigada lista;

   public Pilha() { // Injection Dependece
      this.lista = new ListaLigada();
   }

   public void adicionar(String novoValor) {
      // Preciso adicionar no comerco e não no fim
      this.lista.adicionarComerco(novoValor);
   }

   public void remover() {
      // Precisamos remover do Fim Da Pilha
      this.lista.remover(this.get());

   }

   public String get() {
      // Sempre pega o primeiro da Pilha
      return this.lista.getPrimeiro().getValor();
   }

}
