package Vehiculo;

public class Taxi extends Turismo implements Calculable, Iniciable {

	
	double importeInicio = 2, kmRecorridos=0, importeKm=0;
	
	public Taxi(String marca, String modelo, String numBastidor, int numPuertas, Asientos tipoAsiento, double kmRecorridos, double importeKm) {
		super(marca, modelo, numBastidor, numPuertas, tipoAsiento);
		this.kmRecorridos = kmRecorridos;
		this.importeKm = importeKm;
	}
	
	@Override
	public double calcularCosteTrayecto() {
		return importeInicio+(kmRecorridos*importeKm);
	}

	@Override
	public void reiniciarContador(double kilometros) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double calcularPrecioAlquiler(int numDias) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMaxVelocidad() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public double getKmRecorridos() {
		return importeKm;
	}
	
	public double getImporteKm() {
		return importeKm;
	}
	
	
	public String toString() {
		return super.toString()+";"+"Importe inicio:"+ importeInicio+"€;"+"Importe Km:"+ importeKm+	"€;"+"KmRecorridos:"+ kmRecorridos+"km;" +"Coste del trayecto:"+ calcularCosteTrayecto()+ "€ \n";
		
	}
	
	
}
