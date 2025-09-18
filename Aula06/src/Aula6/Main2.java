package Aula6;

public class Main2 {

	public static void main (String[] args) {
		
		Endereco e2 = new Endereco ();
		e2.setCep("75408950");
		e2.setLogradouro("Rua Honorio Barreto");
		e2.setNumero(50);
		
		String nome = "Jair Messias Bolsonaro";
		
		
		Aluno a2 = new Aluno(nome, e2);
		
		System.out.println(a2.getNome());
		System.out.println(a2.getEndereco().getLogradouro());
		System.out.println(a2.getRa());
		
		
	}
}
