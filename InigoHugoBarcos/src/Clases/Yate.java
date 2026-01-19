package Clases;

public class Yate extends Barco{
	//Atributos
protected double camarotes;
//Constructor
public Yate(String nombre, Motor motor, double capacidadCombustible, double camarotes) {
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
public double getCamarotes() {
return camarotes;
}
public void setCamarotes(int camarotes) {
this.camarotes = camarotes;
}

//ToString
@Override
public String toString() {
return nombre +" Camarotes"+ camarotes + ", motor=" + motor + ", capacidadCombustible="+ capacidadCombustible +", autonomia= "+calcularAutonomia()+ "\n";
}

	
	
}
 