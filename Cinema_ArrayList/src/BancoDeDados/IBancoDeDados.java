package BancoDeDados;

import java.util.List;

import Entidades.Filme;

public interface IBancoDeDados {
	public List<Filme> listarFilme();
	public String addFilme(Filme filme);
	public boolean deletarFilme();
	
	public boolean alteraFilme(Filme filme);
	
}
