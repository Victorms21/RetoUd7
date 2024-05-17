package Vehiculo;

public class Main {
	
	public static void main(String[] args) {
		
		
		Taxi taxi1 = new Taxi("Toyota","Corolla","47GF347FH58SH26W53",5,Asientos.RECLINABLES, 35, 0.86);
		Taxi taxi2 = new Taxi("Mercedes","C200","8HN2KJGB94HS849AQ",5,Asientos.CALEFACCION,40, 0.96);
		Particular particular1 = new Particular("Audi","RSQ8","Q7FHWUETHCBW8UJ3",5, Asientos.CALEFACCION,87, "Victor Marquez",true);
		Particular particular2 = new Particular("Aston Martin","Vantage","FH5JFND84YHS8235",2,Asientos.CUERO, 56, "Fernando Alonso",true);
		Autobus autobus1 = new Autobus("Scania","S10","DFJE92H3JD64HFV1", 3, 31, 10);
		
		System.out.println("Datos del primer taxi: \n" + taxi1);
		System.out.println("Datos del primer taxi: \n" + taxi2);
		System.out.println("Datos del primer particular: \n" + particular1);
		System.out.println("Datos del primer particular: \n" + particular2);
		System.out.println("Datos del primer autobus: \n" + autobus1);
		
		System.out.println("Número de vehículos en funcionamiento: " + Vehiculo.getCantidadVehiculosFuncionando()+"\n");
		
		taxi1.reiniciarContador(25000);
		System.out.println("Coste del trayecto del primer taxi: " + taxi1.calcularCosteTrayecto()+ "€.\n");
		System.out.println("Datos actualizados del primer taxi: " + taxi1);
		
		particular1.reiniciarContador(10000);
		
		particular2.setPropietario("Carlos Sainz");
		System.out.println("Datos actualizados del segundo particular: " + particular2);
		
	}
	

}
