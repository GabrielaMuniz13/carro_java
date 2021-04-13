package twenty;

public class Carro {

	int velocidade;
	boolean motorLigado;
	
	void ligar() {
		
		motorLigado = true;
		velocidade = 0;
		System.out.println("Voc� ligou o carro!");
	}
	
	void desligar() {
		
		motorLigado = false;
		velocidade = 0;
		System.out.println("Voc� desligou o carro!");
	}

	void acelerar() {
		
		if(!motorLigado)
			System.out.println("Voc� n�o pode acelerar um carro com o motor desligado!");
		else {
			
			velocidade++;
			System.out.print("Voc� est� acelerando... ");
			velocidadeAtual();
		}
	}
	
	void frear() {
		
		velocidade = velocidade > 0 ? velocidade-1 : 0;
		System.out.print("Voc� est� freiando... ");
		velocidadeAtual();
	}
	
	void velocidadeAtual() {
		
		System.out.println("Velocidade atual: " + velocidade);
	}
}
