package grafos;

import java.util.ArrayList;

public class Vertice<TIPO> {
   private TIPO dado;
   private ArrayList<Aresta<TIPO>> arrestaEntrada;
   private ArrayList<Aresta<TIPO>> arrestaSaida;

   public Vertice(TIPO valor) {
      this.dado = valor;
      this.arrestaEntrada = new ArrayList<Aresta<TIPO>>();
      this.arrestaSaida = new ArrayList<Aresta<TIPO>>();
   }

   public TIPO getDado() {
      return dado;
   }

   public void setDado(TIPO dado) {
      this.dado = dado;
   }

   public void adicionarArestaEntrada(Aresta<TIPO> aresta) {
      this.arrestaEntrada.add(aresta);
   }

   public void adicionarArestaSaida(Aresta<TIPO> aresta) {
      this.arrestaSaida.add(aresta);
   }
}
