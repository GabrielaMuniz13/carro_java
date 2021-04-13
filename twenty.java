package twenty;


public class twenty {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		carro1.ligar();
		
		for(int i = 0; i < 10; i++) {
		
			carro1.acelerar();
		}
		
		for(int i = 0; i < 5; i++) {
			
			carro1.frear();
		}
		carro1.desligar();
		carro1.acelerar();
	}
}
