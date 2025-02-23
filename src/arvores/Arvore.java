package arvores;

public class Arvore<TIPO extends Comparable> {
   private Elemento<TIPO> raiz;

   public Arvore() {
      this.raiz = null;
   }

   public Elemento<TIPO> getRaiz() {
      return raiz;
   }

   public void adicionar(TIPO valor) {
      Elemento<TIPO> novoElemento = new Elemento<TIPO>(valor);
      if (raiz == null) {
         this.raiz = novoElemento;
      } else {
         Elemento<TIPO> atual = this.raiz;
         while (true) {
            if (novoElemento.getValor().compareTo(atual.getValor()) == -1) {
               if (atual.getEsquerda() != null) {
                  atual = atual.getEsquerda(); // Verificando se tem a Esquerda
               } else {
                  atual.setEsquerda(novoElemento);
                  break;
               }
            } else { // Se for maior ou igual
               if (atual.getDireita() != null) {
                  atual = atual.getDireita(); // Verificando se tem a direita
               } else {
                  atual.setDireita(novoElemento);
                  break;
               }
            }
         }
      }
   }

   /*
    * Em Ordem : esquerda -> cima -> direita
    * pre Ordem : cima -> esquerda -> direita
    * pos Ordem : esquerda -> direita -> cima
    */

   public void emOrdem(Elemento<TIPO> atual) {
      if (atual != null) {
         emOrdem(atual.getEsquerda());
         System.out.println(atual.getValor());
         emOrdem(atual.getDireita());
      }
   }

   public void preOrdem(Elemento<TIPO> atual) {
      if (atual != null) {
         System.out.println(atual.getValor());
         preOrdem(atual.getEsquerda());
         preOrdem(atual.getDireita());
      }
   }

   public void posOrdem(Elemento<TIPO> atual) {
      if (atual != null) {
         posOrdem(atual.getEsquerda());
         posOrdem(atual.getDireita());
         System.out.println(atual.getValor());
      }
   }
}
