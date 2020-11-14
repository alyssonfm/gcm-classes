
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
	
	public int getQuantidade() {
		return this.quantidade;
	}
}
