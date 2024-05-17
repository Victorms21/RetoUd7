package Vehiculo;

public class Autobus extends Vehiculo{
	
	private int numero=0, numParadas=0;
	
	public Autobus(String marca, String modelo, String numBastidor, int numPuertas, int numero, int numParadas) {
		super(marca, modelo, numBastidor, numPuertas);
		this.numero=numero;
		this.numParadas=numParadas;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumParadas() {
		return numParadas;
	}

	public void setNumParadas(int numParadas) {
		this.numParadas = numParadas;
	}

	
	public String toString() {
		return super.toString()  +  "Número: " + numero + "; " + "Número de paradas: " + numParadas + "\n"; 
	}

}
