package model;

public abstract class Livros {
	
	public int volume;
	public int edicao;
	public int tipo;
	public String titulo;
	public String autor;
	
	public Livros(int volume, int edicao, int tipo, String titulo, String autor) {
		this.autor = autor;
		this.edicao= edicao;
		this.tipo= tipo;
		this.titulo= titulo;
		this.volume=volume;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	public void visualizar() {
		String tipo = ""; //perguntar
		
		switch (this.tipo) {
		case 1:
			tipo= "Enciclopedia";
			break;
		case 2:
			tipo = "Livro Teórico";
			break;
		}
	}}
