package br.com.renato.entidades;

public class Filme {

	private int estopque;
	private int aluguel;

	public void setEstoque(int arg1) {
		this.estopque = arg1;

	}

	public void setAluguel(int arg1) {
		this.aluguel = arg1;
	}

	public int getAluguel() {

		return aluguel;
	}

	public int getEstoque() {
		return estopque;
	}

}
