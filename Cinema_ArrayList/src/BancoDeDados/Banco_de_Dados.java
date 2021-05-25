package BancoDeDados;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;

import org.junit.experimental.theories.suppliers.TestedOn;
import org.junit.runners.model.TestClass;

import Entidades.Filme;

public class Banco_de_Dados implements IBancoDeDados {

	private List<Filme> listaFilme = new ArrayList<Filme>();
	Filme nomeFilme = new Filme();
	public boolean nome;
	
	
			

	public String addFilme(Filme filme) {
		
			

			try {
				if(!listaFilme.contains(nomeFilme.getNome()))

				listaFilme.add(filme);

			} catch (Exception e) {
				return "O filme já foi cadastrado";
			}
			

		return "";
	}

	public List<Filme> getListaFilme() {
		return listaFilme;
	}


	public void setListaFilme(List<Filme> listaFilme) {
		this.listaFilme = listaFilme;
	}

	/*public boolean deletarPessoaPorID() {

		for (Filme pessoa : listaPessoas) {
			if (pessoa.getId() == id) {
				listaPessoas.remove(pessoa);
			}
		}

		return false;
	}*/

	
	
	public boolean alteraFilme(Filme filme) {

		for (Filme filme1 : listaFilme) {
			if (filme1.getNome() == filme1.getNome()) {
				
				listaFilme.remove(filme1);
				listaFilme.add(filme1);
			}
		}
		return false;
	}


	

	public boolean deletarFilme() {
		// TODO Auto-generated method stub
		return false;
	}

	
	public List<Filme> listarFilme() {
		
		return this.listaFilme;
	}
	
	
	

	
		
	
}
	


