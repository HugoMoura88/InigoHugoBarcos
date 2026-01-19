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
		
		Motor motor1 = new Motor("cyan", 20, 40);
		Motor motor2 = new Motor("rojo", 30, 20);
		Motor motor3 = new Motor("verde", 10, 60);ç
		
		Yate yate1 = new Yate("Yatote", motor3, 0);
		
		
		

	}
}
