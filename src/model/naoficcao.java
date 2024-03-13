package model;

public class naoficcao extends Livros {
	
	private int quantidadeDisponivel;
	
	public naoficcao(int volume, int edicao, int tipo, String titulo, String autor, int quantidade) {
		
		//livro
		super (volume, edicao, tipo, titulo, autor);
		
		//Atributos da classe
		this.quantidadeDisponivel = quantidade;
	}
	
	// Gets and Sets
	public int getQuantidadeDisponivel() {
		return quantidadeDisponivel;
	}

	public void setQuantidadeDisponivel(int quantidadeDisponivel) {
		this.quantidadeDisponivel = quantidadeDisponivel;
	}
	
	public void visualizar () {
		super.visualizar();
		System.out.println(" Tipo " + this.tipo);
	}

	
}
