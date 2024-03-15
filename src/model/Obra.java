package model;

public abstract class Obra {
	
	private int volume;
	private int edicao;
	private int tipo;
	private String titulo;
	private String autor;
	private int id;
	
	public Obra(int id, int volume, int edicao, int tipo, String titulo, String autor) {
		this.autor = autor;
		this.edicao= edicao;
		this.tipo= tipo;
		this.titulo= titulo;
		this.volume=volume;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		String tipo = ""; //inicializando a variavel com vazio
		
		switch (this.tipo) {
		case 1:
			tipo= "Enciclopedia";
			break;
		case 2:
			tipo = "Teórico";
			break;
			
		}
		System.out.println("\n\n *******************************************************");
		System.out.println("Dados da Obra:");
		System.out.println("*************************************************************");
		System.out.println("Volume: " + this.volume);
		System.out.println("Edição" + this.edicao);
		System.out.println("Tipo: "+ tipo);
		System.out.println("Titulo: "+ this.titulo);
		System.out.println("Autor: "+this.autor);
		
	}}
