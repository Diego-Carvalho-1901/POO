package Aula6;

public class Main {
	
	public static void main (String [] args) {
		
		Aluno a1 = new Aluno();
		a1.setNome("Diego Carvalho Louzada");
		a1.setRa("22508710");
		
		Endereco e1 = new Endereco();
		e1.setCep("73803215");
		e1.setLogradouro("Avenida California");
		e1.setNumero(600);
		
		a1.setEndereco(e1);
		
		System.out.println(a1.getNome() + " - " + a1.getRa() + 
							" - " + a1.getEndereco().getLogradouro());
	}
}
