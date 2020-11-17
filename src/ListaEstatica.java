public class ListaEstatica<T> {
	
	private T[] elementos;
	private int quantidade;
	
	public ListaEstatica(int tamanho){
		this.elementos = (T[]) new Object[tamanho];
		this.quantidade = 0;		
	}
	
	public boolean isVazia() {
		return this.quantidade == 0;
	}
	
	public boolean isCheia() {
		return this.quantidade == this.elementos.length;
	}
	
	public int getQuantidade() {
		return this.quantidade;
	}
	
	
	public void inserirInicio(T novoNo) {
		if(this.isCheia()) System.out.println("Lista cheia, naoh eh possivel inserir");
		else {
			for(int i = this.quantidade; i > 0; --i) {
				this.elementos[i] = this.elementos[i-1];
			}
			this.elementos[0] = novoNo;
			++this.quantidade;
		}
	}
	
	public void inserirFim(T novoNo) {
		if(this.isCheia()) System.out.println("Lista cheia, naoh eh possivel inserir");
		else
			this.elementos[this.quantidade] = novoNo;
	}
}
