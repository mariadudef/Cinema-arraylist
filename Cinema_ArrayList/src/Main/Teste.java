package Main;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;
import BancoDeDados.Banco_de_Dados;
import Entidades.Filme;
import java.util.Scanner;

public class Teste {
	private static Banco_de_Dados bd = new Banco_de_Dados();

	public static void main(String[] args) {
		Filme adFilme = new Filme();
		while (true) {
			
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-");
		System.out.println("-=-=-=-=-=-=-=-=-=-= CINEMA =-=--=-=-=-=-=-=-=");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-");
		System.out.println("\n-=-=-=-=-=-=-=- ADICIONAR FILME -=-=-=--=-=-");
		Scanner input = new Scanner(System.in);
		System.out.println("DIGITE O NOME DO FILME QUE SERÁ ADICIONADO: ");
		adFilme.setNome(input.nextLine());
		
		System.out.println("DIGITE O HORÁRIO DE EXIBIÇÃO DO FILME: ");
		adFilme.setHorario(input.nextLine());
		System.out.println("DIGITE A DURAÇÃO DO FILME: ");
		adFilme.setDuracao(input.nextLine());
		System.out.println(bd.addFilme(adFilme));
		System.out.println("QUER CONTINUAR (s/n)");
		String continuar = input.nextLine();
		if (continuar.equals("não".toLowerCase())||continuar.equals("n".toLowerCase())){
			break;
		}else {
			continue;
		}
		}
		
		
	}
		}
		
		
		
		
		//listarPessoas();
		//listarPessoas();
		//altera();
		//listarPessoas();
	//}
	
	/*public static void alterar(){
		
		Filme pessoa = new Filme();
		pessoa.setApelido("ZÃ©");
		pessoa.setId(3);
		pessoa.setIdade(23);
		pessoa.setNome("Jose Francisco");
		rp.alteraPessoa(pessoa);
	}*/

	
	/*public static void listarPessoas() {

		List<Filme> lista = new ArrayList<Filme>();

		lista = bd.listarFilme();

		for (Filme pessoa : lista) {

			System.out.println("Id : " + pessoa.getId());
			System.out.println("Nome : " + pessoa.getNome());
			System.out.println("Apelido : " + pessoa.getApelido());
			System.out.println("Idade : " + pessoa.getIdade());
			System.out.println("--------------------------------------");

		}

	}

}*/
