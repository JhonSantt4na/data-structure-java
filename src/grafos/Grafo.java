package grafos;

import java.util.ArrayList;

public class Grafo<TIPO> {
   private ArrayList<Vertice<TIPO>> vertices;
   private ArrayList<Aresta<TIPO>> arestas;

   public Grafo() {
      this.vertices = new ArrayList<Vertice<TIPO>>();
      this.arestas = new ArrayList<Aresta<TIPO>>();
   }

   public void adicionarVetice(TIPO dado) {
      Vertice<TIPO> novoVertice = new Vertice<TIPO>(dado);
      this.vertices.add(novoVertice);

   }

   public void adicionarAresta(Double peso, TIPO dadoInicio, TIPO dadoFim) {
      Vertice<TIPO> inicio = this.getVertice(dadoInicio);
      Vertice<TIPO> fim = this.getVertice(dadoFim);
      Aresta<TIPO> aresta = new Aresta<TIPO>(peso, inicio, fim);
      inicio.adicionarArestaSaida(aresta);
      fim.adicionarArestaEntrada(aresta);
      this.arestas.add(aresta);

   }

   public Vertice<TIPO> getVertice(TIPO dado) {
      Vertice<TIPO> vertice = null;
      for (int i = 0; i < this.vertices.size(); i++) {
         if (this.vertices.get(i).getDado().equals(dado)) {
            vertice = this.vertices.get(i);
         }
      }
      return vertice;
   }
}
