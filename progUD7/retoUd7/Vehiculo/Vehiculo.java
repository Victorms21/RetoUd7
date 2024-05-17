package Vehiculo;

public abstract class Vehiculo {
	private String marca="", modelo="", numBastidor="";
	private int numPuertas=0;
	private static int CantidadVehiculosFuncionando=0;
	

	public Vehiculo(String marca, String modelo, String numBastidor, int numPuertas) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numBastidor = numBastidor;
		this.numPuertas = numPuertas;
		CantidadVehiculosFuncionando++;
	}



	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getNumBastidor() {
		return numBastidor;
	}


	public void setNumBastidor(String numBastidor) {
		this.numBastidor = numBastidor;
	}


	public int getNumPuertas() {
		return numPuertas;
	}


	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}


	public static int getCantidadVehiculosFuncionando() {
		return CantidadVehiculosFuncionando;
	}


	public static void setCantidadVehiculosFuncionando(int cantidadVehiculosFuncionando) {
		CantidadVehiculosFuncionando = cantidadVehiculosFuncionando;
	}



	public String toString() {
		return "Marca: " + marca + "; modelo:" + modelo + "; numBastidor:" + numBastidor + "; numPuertas:"
				+ numPuertas + ";";
	}
	
	
		
}

