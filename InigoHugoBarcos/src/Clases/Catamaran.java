package Clases;

public class Catamaran extends Barco {
	//Atributos
	protected Motor motorSegundario;
	//Constructores
	public Catamaran(String nombre, Motor motor, double capacidadCombustible, Motor motorSegundario) {
		super(nombre, motor, capacidadCombustible);
		this.motorSegundario = motorSegundario;
	}
	//Metodos
	@Override
	public double calcularAutonomia() {
		return (capacidadCombustible/motor.consumo)+(capacidadCombustible/motorSegundario.consumo)/2.0;
	}
	//GetterSetters
	public Motor getMotorSegundario() {
		return motorSegundario;
	}
	public void setMotorSegundario(Motor motorSegundario) {
		this.motorSegundario = motorSegundario;
	}
	//ToString
	@Override
	public String toString() {
		return "Catamaran [motorSegundario=" + motorSegundario + ", nombre=" + nombre + ", motor=" + motor
				+ ", capacidadCombustible=" + capacidadCombustible + "]";
	}

}
