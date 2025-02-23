package arvores;

public class App {
   public static void main(String[] args) {
      Arvore<Integer> arvore = new Arvore<Integer>();
      arvore.adicionar(10);
      arvore.adicionar(8);
      arvore.adicionar(5);
      arvore.adicionar(9);
      arvore.adicionar(7);
      arvore.adicionar(18);
      arvore.adicionar(13);
      arvore.adicionar(20);

      System.out.println("Em Ordem");
      arvore.emOrdem(arvore.getRaiz());

      System.out.println("Pre Ordem");
      arvore.preOrdem(arvore.getRaiz());

      System.out.println("Pos Ordem");
      arvore.posOrdem(arvore.getRaiz());
   }
}
