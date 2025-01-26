public class ComplexidadeAlgoritmo {
    public static void main(String[] args) throws Exception {
        /*
         * Quando se fala em Complexidade de algoritimos queremos
         * analisar em dois aspectos pelomenos :
         * 
         * Processamento : Que Está relacionado ao Tempo
         * 
         * Espaço : Que está relacionado a quantidade de memoria e disco:
         * ---> em memoria > (Manipulam variaveis, listas etc..)
         * ---> em disco > (Manipulam Banco de dados, SGDB etc...)
         * 
         * O que queremos analisar ?
         * 
         * O nosso algoritmo é rapido e ele continuara
         * sendo rapido a medida que os dados almentem
         * pois podem ter algoritmos que são rapidos com poucos dados
         * e lento com muitos dados.
         * 
         * Com isso existe diversos algoritmos espalhado pelos mundos
         * com seus objetivos.
         * 
         * Como analisar ?
         * Vamos supor que queremos busca um elemento no array de 8 possições
         * porem desordenados.
         * 
         * queremos busca o "7"
         * 
         * [10, 9, 3, 2, 4, 7, 5, 8]
         * 
         * podemos buscar item por item
         * quantos passo temos que da até achar o 7 ?
         * 6 Passos ou seja precisei andar seis vezes
         * 
         * o melhor caso é testa somente 1 posição
         * se quisermos busca o 10 agente conta com a sorte
         * é o melhor caso
         * 
         * temos o caso medio
         * quantos passos precisamo achar o elemento na media
         * vamos supor dividir o vetor no meio, por ex a pos 4
         * que é o 2 porem ele não pode representar o pior caso
         * 
         * pq é o pior caso que precisamos saber oq precisamos fazer
         * computacionalmente (quando vamos precisar :
         * aumentar o processamento da maquina
         * aumentar a memoria da maquina
         * aumentar o disco da maquina
         * se temos que distribuir entre maquinas
         * )
         * 
         * Qual o pior caso para agente achar o elemento no vetor?
         * 
         * a ultima posição pois precisamos passar todos para poder encontra ele.
         * 
         * o pior caso é representado por:
         * O() Big o
         * 
         * pois asssim é a forma da agente representar a complexidade do nosso
         * algoritimos
         * vamos focar no processamento pois o espaço temos que ter outros exemplos
         * 
         * Classificação O: usada para classificar o algoritimos
         * 
         * "Imagem sobre o Big o"
         * 
         * eixo x = tamanho do vetor
         * eixo y = tempo que vamos levar pra exec ou seja a quantidade de passo
         * 
         * na busca linear dependendo do tamanho do array ele aumenta os passos
         * sendo assim é O(n)
         * 
         * melhor possivel é o O(log n)
         * 
         */
    }
}
