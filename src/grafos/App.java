package grafos;

public class App {
   public static void main(String[] args) {
      Grafo<String> grafo = new Grafo<String>();
      grafo.adicionarVetice("Joao");
      grafo.adicionarVetice("Lorenzo");
      grafo.adicionarVetice("Creuza");
      grafo.adicionarVetice("Cleber");
      grafo.adicionarVetice("Cláudio");

      grafo.adicionarAresta(2.0, "Joao", "Lorenzo");
      grafo.adicionarAresta(3.0, "Lorenzo", "Cleber");
      grafo.adicionarAresta(1.0, "Cleber", "Creuza");
      grafo.adicionarAresta(1.0, "Joao", "Creuza");
      grafo.adicionarAresta(2.0, "Cláudio", "Lorenzo");
      grafo.adicionarAresta(3.0, "Cláudio", "Joao");

   }
}
