package controller;

import java.util.ArrayList;

import model.Obra;
import repository.Repository;

public class Controller implements Repository {
	
	private ArrayList<Obra> catalogo = new ArrayList<Obra> ();

	@Override
	public void listarTodos() {
		for (var obra: catalogo) {
			obra.visualizar();
		}
		
	}

	@Override
	public void cadastrar(Obra obra) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Obra obra) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(int titulo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(String titulo) {
		// TODO Auto-generated method stub
		
	}
	}
  