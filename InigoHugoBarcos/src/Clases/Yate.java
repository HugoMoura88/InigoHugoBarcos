package Clases;

public class Yate extends Barco{
	//Atributos
protected int camarotes;
//Constructor
public Yate(String nombre, Motor motor, double capacidadCombustible, int camarotes) {
	super(nombre, motor, capacidadCombustible);
	this.camarotes = camarotes;
}
//Metodos
@Override
public double calcularAutonomia() {
	// TODO Auto-generated method stub
	return super.calcularAutonomia();
}
//GetterSetters
public int getCamarotes() {
return camarotes;
}
public void setCamarotes(int camarotes) {
this.camarotes = camarotes;
}

//ToString
@Override
public String toString() {
return "Yate [camarotes=" + camarotes + ", nombre=" + nombre + ", motor=" + motor + ", capacidadCombustible="
		+ capacidadCombustible + "]";
}

	
	
}
 