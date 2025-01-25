package lista_ligada;

/*
 * é como se fosse a bolinha ou nó da lista. 
 * sempre é iniciado vazio.
 */
public class Elemento {
   private String valor;
   private Elemento proximo;

   public Elemento(String novoValor) {
      this.valor = novoValor; // Pegando o Valor que é enviado no Programa
   }

   public String getValor() {
      return valor;
   }

   public void setValor(String valor) {
      this.valor = valor;
   }

   public Elemento getProximo() {
      return proximo;
   }

   public void setProximo(Elemento proximo) {
      this.proximo = proximo;
   }

}
