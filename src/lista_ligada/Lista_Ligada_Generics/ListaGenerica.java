package lista_ligada.Lista_Ligada_Generics;

import Iterator.IteratorListaLigada;

public class ListaGenerica<TIPO> {

   private Elemento<TIPO> primeiro;
   private Elemento<TIPO> ultimo;
   private int tamanho;

   public ListaGenerica() {
      this.tamanho = 0;
   }

   public Elemento<TIPO> getPrimeiro() {
      return primeiro;
   }

   public void setPrimeiro(Elemento<TIPO> primeiro) {
      this.primeiro = primeiro;
   }

   public Elemento<TIPO> getUltimo() {
      return ultimo;
   }

   public void setUltimo(Elemento<TIPO> ultimo) {
      this.ultimo = ultimo;
   }

   public int getTamanho() {
      return tamanho;
   }

   public void setTamanho(int tamanho) {
      this.tamanho = tamanho;
   }

   public void adicionar(TIPO novoValor) {
      Elemento<TIPO> novoElemento = new Elemento<TIPO>(novoValor); // Criando uma bolinha
      // Se for o primeiro elemento
      if (this.primeiro == null && this.ultimo == null) {
         this.primeiro = novoElemento;
         this.ultimo = novoElemento;

      }
      // Quando o Primeiro e o ultimo não são null
      else {
         this.ultimo.setProximo(novoElemento);
         this.ultimo = novoElemento;
      }

      this.tamanho++;
   }

   public void remover(TIPO valorProcurado) {
      Elemento<TIPO> anterior = null;
      Elemento<TIPO> atual = this.primeiro;
      for (int i = 0; i < this.getTamanho(); i++) {

         if (atual.getValor().equals(valorProcurado)) { // pq n funciona equalsIgnoreCase

            // Se a lista tem apenas 1 elemento
            if (this.tamanho == 1) {
               this.primeiro = null;
               this.ultimo = null;
            }
            // Se for o primeiro
            else if (atual == primeiro) {
               this.primeiro = atual.getProximo();
               atual.setProximo(null);
            }
            // Se for o último
            else if (atual == ultimo) {
               this.ultimo = anterior;
               anterior.setProximo(null);
            }
            // Caso intermediário
            else {
               anterior.setProximo(atual.getProximo());
            }
            // Independente dos Casos
            this.tamanho--;
            break;
         }
         anterior = atual;
         atual = atual.getProximo();
      }
   }

   public Elemento<TIPO> get(int posicao) {
      Elemento<TIPO> atual = this.primeiro;
      for (int i = 0; i < posicao; i++) {
         if (atual.getProximo() != null) {
            atual = atual.getProximo();
         }
      }
      return atual;
   }

   public IteratorListaLigada<TIPO> getIterator() {
      return new IteratorListaLigada<TIPO>(this.primeiro);
      // Precisamos ter um construtor na nossa IteratorListaLigada
   }
}
