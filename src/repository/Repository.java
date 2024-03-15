package repository;

import model.Obra;

public interface Repository {
	//CRUD
	public void listarTodos();
	public void cadastrar(Obra obra);
	public void atualizar(Obra obra);
	public void deletar(String titulo);
}
