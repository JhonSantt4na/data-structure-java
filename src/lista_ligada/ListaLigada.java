package lista_ligada;

public class ListaLigada {
   /*
    * Vetor = Estrutura de Dados com possições fixas
    * porem com algumas desvantagens se quisermos adicionar
    * uma nova posição, teremos que redimensionar todos. mesmo acontece
    * quando agente vai remover temos que mover todos.
    */

   /*
    * Lista Ligada(Encadeada) = Não tem posições fixas
    * cada elemento so sabe apenas quem é o seu proximo
    * com isso fica mais facil a inserção ou remoção por ex:
    * criamos o elemento e dizemos ao ultimo que agr ele tem um proximo
    * porem ela tem um problema, para encontra temos que pegar todo os elementos
    * ate encontra.
    */

   // Implementando uma Lista ligada
   private Elemento primeiro;
   private Elemento ultimo;
   private int tamanho;

   public ListaLigada() {
      this.tamanho = 0;
   }

   public Elemento getPrimeiro() {
      return primeiro;
   }

   public void setPrimeiro(Elemento primeiro) {
      this.primeiro = primeiro;
   }

   public Elemento getUltimo() {
      return ultimo;
   }

   public void setUltimo(Elemento ultimo) {
      this.ultimo = ultimo;
   }

   public int getTamanho() {
      return tamanho;
   }

   public void setTamanho(int tamanho) {
      this.tamanho = tamanho;
   }

   public void adicionar(String novoValor) {
      Elemento novoElemento = new Elemento(novoValor); // Criando uma bolinha
      // Se for o primeiro elemento
      if (this.primeiro == null && this.ultimo == null) {
         // O Primeiro e ultimo passa a ser o novoElemento
         this.primeiro = novoElemento;
         this.ultimo = novoElemento;

      } else { // Qunado o Primeiro e o ultimo não são null
         this.ultimo.setProximo(novoElemento);
         // o ultimo dizendo que o novo elemento é o seu proximo
         this.ultimo = novoElemento; // o novo elemento é o ultimo
      }
      // o Tamanho icrementa 1
      this.tamanho++;
   }

   public void remover(String novoValor) {

   }

   public Elemento get(int posicao) {
      Elemento atual = this.primeiro; // O Atual da rodada
      for (int i = 0; i < posicao; i++) {
         if (atual.getProximo() != null) {
            atual = atual.getProximo(); // o novo atual vai ser o proximo do atual da rodada
         }
      }
      return atual;
   }
}
