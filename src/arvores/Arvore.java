package arvores;

public class Arvore<TIPO extends Comparable> {
   private Elemento<TIPO> raiz;

   public Arvore() {
      this.raiz = null;
   }

   public Elemento<TIPO> getRaiz() {
      return raiz;
   }

   // Adicionando Elementos na Arvore
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

   // Remover Elemento da Arvore
   public boolean remover(TIPO valor) {
      // Busca o elemento na Arvore
      Elemento<TIPO> atual = this.raiz;
      Elemento<TIPO> paiAtual = null;

      while (atual != null) {
         if (atual.getValor().equals(valor)) {
            break;
         } else if (valor.compareTo(atual.getValor()) == -1) {
            paiAtual = atual;
            atual = atual.getEsquerda();
         } else {
            paiAtual = atual;
            atual = atual.getDireita();
         }
      }
      // Verifica se existe o elemento
      if (atual != null) {
         // se tem 2 filhos ou elemento tem somente filho a direita
         if (atual.getDireita() != null) {

            Elemento<TIPO> substituto = atual.getDireita();
            Elemento<TIPO> paiSubstituto = atual;
            while (substituto.getEsquerda() != null) {
               paiSubstituto = substituto;
               substituto = substituto.getEsquerda();
            }
            substituto.setEsquerda(atual.getEsquerda());
            if (paiAtual != null) {
               if (atual.getValor().compareTo(paiAtual.getValor()) == -1) {
                  paiAtual.setEsquerda(substituto);
               } else {
                  paiAtual.setDireita(substituto);
               }
            } else { // Se não tem pai atual é a Raiz
               this.raiz = substituto;
            }

            // Removeu elemento da arvore
            if (substituto.getValor().compareTo(paiSubstituto.getValor()) == -1) {
               paiSubstituto.setEsquerda(null);
            } else {
               paiSubstituto.setDireita(null);
            }
         } else if (atual.getEsquerda() != null) { // Tem Filhos para a esquerda
            Elemento<TIPO> substituto = atual.getEsquerda();
            Elemento<TIPO> paiSubstituto = atual;
            while (substituto.getDireita() != null) {
               paiSubstituto = substituto;
               substituto = substituto.getDireita();
            }
            if (paiAtual != null) {
               if (atual.getValor().compareTo(paiAtual.getValor()) == -1) {
                  paiAtual.setEsquerda(substituto);
               } else {
                  paiAtual.setDireita(substituto);
               }
            } else {
               this.raiz = substituto;
            }

            // Removeu elemento da arvore
            if (substituto.getValor().compareTo(paiSubstituto.getValor()) == -1) {
               paiSubstituto.setEsquerda(null);
            } else {
               paiSubstituto.setDireita(null);
            }

         } else { // não tem filho
            if (paiAtual != null) {
               if (atual.getValor().compareTo(paiAtual.getValor()) == -1) {
                  paiAtual.setEsquerda(null);
               } else {
                  paiAtual.setDireita(null);
               }
            } else { // é a Raiz
               this.raiz = null;
            }

         }
         return true;
      } else {
         return false;
      }

   }
}
