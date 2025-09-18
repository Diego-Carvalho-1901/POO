package Aula06_exercicio1;

public class Main {

		public static void main ( String[] args){
	
			Livro l1 = new Livro ();
			l1.setTitulo("Assim Falou Zaratustra");
			l1.setAutor("Nietzsche");
			l1.setAnoPublicacao(1795);
			
			Biblioteca b1 = new Biblioteca();
			b1.setNome("Biblioteca Joao Herculino");
			
			b1.setLivro(l1);
			
			System.out.println(b1.getNome() + " - " + l1.getTitulo() + " - " + l1.getAutor() 
								+ " - " + l1.getAnoPublicacao());
	
		}
}
