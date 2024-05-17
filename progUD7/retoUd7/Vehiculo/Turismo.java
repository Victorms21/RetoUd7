package Vehiculo;

public abstract class Turismo extends Vehiculo{

	Asientos tipoAsiento;

	public Turismo(String marca, String modelo, String numBastidor, int numPuertas, Asientos tipoAsiento) {
		super(marca, modelo, numBastidor, numPuertas);
		// TODO Auto-generated constructor stub
		this.tipoAsiento=tipoAsiento;
	}

	public Asientos getTipoAsiento() {
		return tipoAsiento;
	}

	public void setTipoAsiento(Asientos tipoAsiento) {
		this.tipoAsiento = tipoAsiento;
	}
	public String toString() {
		// USAMOS SUPER.TOSTRING() QUE LLAMA MÉTODO TOSTRING DE LA
		//CLASE PERSONA Y DESPUÉS MOSTRAMOS LOS ATRIBUTOS EL EMPLEADO
		
		return super.toString() + "TipoAsiento: " + tipoAsiento;
		}

	public abstract double calcularPrecioAlquiler(int numDias);
	
	public abstract int getMaxVelocidad();
}