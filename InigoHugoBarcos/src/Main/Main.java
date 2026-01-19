package Main;
import Clases.Barco;
import Clases.Puerto;
import Clases.Catamaran;
import Clases.Motor;
import Clases.Yate;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Puerto marina = new Puerto();
		
		Motor motor1 = new Motor("Motor1", 500, 8.5);
		Motor motor2 = new Motor("rojo", 300, 10);
		Motor motor3 = new Motor("verde", 700, 6);
		
		Yate yate1 = new Yate("Yate1", motor2, 750,8.5);
		Yate yate2 = new Yate("Yatin", motor1, 600,6);
		
		Catamaran catamaran1 = new Catamaran("Catamaran1", motor1, 1000, motor3);
		Catamaran catamaran2 = new Catamaran("Catatote", motor2, 900, motor1);
		
		marina.entrarBarco(yate1);
		marina.entrarBarco(yate2);
		marina.entrarBarco(catamaran1);
		marina.entrarBarco(catamaran2);
		
		System.out.println(marina);
		
		double min = 999.0;
		double max = -10.0;
		String nombremin = "";
		String nombremax = "";
		
		ArrayList<Barco> barcos = marina.getBarcos();
		for (Barco barco : barcos) {
			if (barco.calcularAutonomia()<min) {
				min=barco.calcularAutonomia();
				nombremin=barco.getNombre();
			}
			if (barco.calcularAutonomia()>max) {
				max=barco.calcularAutonomia();
				nombremax=barco.getNombre();
			}
		}
		System.out.println("\nEl barco con mayor autonomia es "+nombremax);
		System.out.println("El barco con menor autonomia es "+nombremin+"\n");
		
		marina.salirBarco("Catatote");
		
		System.out.println(marina);

	}
}
