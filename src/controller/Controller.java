package controller;

import java.util.ArrayList;

import model.Obra;
import repository.Repository;

public class Controller implements Repository {
	
	int id=0;
	private ArrayList<Obra> catalogo = new ArrayList<Obra> ();

	@Override
	public void cadastrar(Obra obra) {
		catalogo.add(obra);
		System.out.println("O livro de identificador nº "+ obra.getId()+ " foi cadastrado com sucesso!" );
	}

	@Override
	public void listarTodos() {
		for (var obra: catalogo) {
			obra.visualizar();
		}
		
	}
	
	@Override
	public void atualizar(Obra obra) {
		var procurarLivro = buscarNaCollection(obra.getId());
		if(procurarLivro!= null) {
			catalogo.set(catalogo.indexOf(procurarLivro), obra);
				System.out.println("O livro de identificador nº "+ obra.getId() + " foi atualizado com sucesso!" );	
		}
		else {
			System.out.println("Não achei o livro com nº "+ obra.getId());
		}
	}

	@Override
	public void deletar(int id) {
		var procurarId = buscarNaCollection(id);
		if(procurarId != null) {
			if(catalogo.remove(procurarId)==true) {
				System.out.println("O livro de identificador nº "+ id + " foi deletado com sucesso!" );
			}
			
		}
		else {
			System.out.println("Não achei o livro com nº "+ id);
		}
		
	}
	public int gerarId() {
        return ++id;
    }
	public Obra buscarNaCollection(int id) {
        for(var buscarId: catalogo) {
            if(buscarId.getId() == id) {
                return buscarId;
            }
        }
        return null;
    }
	}
  