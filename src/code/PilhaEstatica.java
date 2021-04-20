package code;

/*
Classe Pilha Estatica Generica
*/
public class PilhaEstatica<T> {
  public T[] elementos;
  private int topo;

  @SuppressWarnings("unchecked")
  public PilhaEstatica(int tamanho) {
    this.elementos = (T[]) new Object[tamanho];
		this.topo = -1;
	}

	public boolean isCheia() {
		return this.topo + 1 == this.elementos.length;
	}

	public boolean isVazia() {
		return this.topo == -1;
	}

	public int getQuantidade() {
		return this.topo + 1;
	}

	public void push(T novo) throws PilhaCheiaException {
		if (this.isCheia())
			throw new PilhaCheiaException();
		this.elementos[++this.topo] = novo;
	}

}
