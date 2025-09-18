package Aula06_exercicio2;

public class Main {

		public static void main (String[] args) {
			
			Processador p1 = new Processador();
			p1.setMarca("Intel");
			p1.setFrequencia("4.5GHz");
			
			MemoriaRAM mr1 = new MemoriaRAM();
			mr1.setCapacidade("16gb");
			mr1.setTipo("DDR4");
			
			Computador cp1 = new Computador (p1, mr1);
			
			System.out.println(cp1.getProcessador().getFrequencia());
			System.out.println(cp1.getProcessador().getMarca());
			System.out.println(cp1.getMemoriaRAM().getCapacidade());
			System.out.println(cp1.getMemoriaRAM().getTipo());
		}
		
}
