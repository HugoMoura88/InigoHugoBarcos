package Clases;

import java.util.ArrayList;
import java.util.Iterator;

public class Puerto {
	//Atributos
	protected ArrayList<Barco> barcos;
	//Constructor
	public Puerto() {
		super();
		this.barcos = new ArrayList<Barco>();
	}
	//Metodos
	public void entrarBarco(Barco barco) {
		if (barcos.size()<4) {
			barcos.add(barco);
		} else {
			System.out.println("Puerto lleno!");
		}
	}
	public void salirBarco(String nombre) {
		Iterator<Barco> iterador = barcos.iterator();
		while (iterador.hasNext()) {
		    Barco bar = iterador.next();
		    if (bar.nombre.equals(nombre)) {
		        iterador.remove(); 
		    }
		}
	}
	public double calcularPrecioViaje(Barco b, int horas, double precioCombustible) {
		if (b.capacidadCombustible<horas) {
			return -1;
		} else {
			return horas*b.getMotor().getConsumo()*precioCombustible;
		}
		
	}
	//GetterSetters
	public ArrayList<Barco> getBarcos() {
		return barcos;
	}
	public void setBarcos(ArrayList<Barco> barcos) {
		this.barcos = barcos;
	}
	//ToString 
	@Override
	public String toString() {
		return barcos+"";
	}
}
