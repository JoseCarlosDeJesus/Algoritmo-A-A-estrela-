
public class Busca {
	public static void main(String[] args) {
        Grafo<String> grafo = new Grafo<String>();
        grafo.adicionarVertice("Guarulhos");
        grafo.adicionarVertice("Bukarest");
        grafo.adicionarVertice("Itaitinga");
        grafo.adicionarVertice("Taguatinga");
        grafo.adicionarVertice("Águas Claras");
        
        grafo.adicionarAresta(2.0, "Guarulhos", "Bukarest");
        grafo.adicionarAresta(3.0, "Bukarest", "Itaitinga");
        grafo.adicionarAresta(1.0, "Itaitinga", "Taguatinga");
        grafo.adicionarAresta(1.0, "Guarulhos", "Taguatinga");
        grafo.adicionarAresta(3.0, "Águas Claras", "Guarulhos");
        grafo.adicionarAresta(2.0, "Águas Claras", "Bukarest");
        
        grafo.buscaEmLargura();
	}
}
