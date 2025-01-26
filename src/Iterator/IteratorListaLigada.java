package Iterator;

import Lista_Ligada_Generics.Elemento;

public class IteratorListaLigada<TIPO> {
   private Elemento<TIPO> elemento;

   public IteratorListaLigada(Elemento<TIPO> atual) {
      this.elemento = atual;
   }

   // Saber se tem proximo
   public boolean temProximo() {
      if (elemento.getProximo() == null) {
         return false;
      } else {
         return true;
      }
   }

   // Pegando o Proximo
   public Elemento<TIPO> getProximo() {
      elemento = elemento.getProximo();
      return elemento;
   }

   // Criamos um metodo na ListaLigadaGenerica IteratorListaLigada()
}
