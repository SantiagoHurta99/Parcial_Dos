package Punto_2;

/**
 * @author Santiago Hurtado
 * */

public class Persona {
	private String nombre;
	private int edad;
	private int DNI;
	private char sexo;			//(H=hombre, M=mujer)
	private float peso;			//kg
	private int altura;			//m
	
	public Persona() {
		this.nombre = "";
		this.edad = 0;
		DNI = generaDNI();
		this.sexo = 'H';
		this.peso = 0;
		this.altura = 0;
	}

	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		DNI = generaDNI();
		this.sexo = sexo;
		this.peso = 0;
		this.altura = 0;
		comprobarSexo(sexo);
	}

	public Persona(String nombre, int edad, char sexo, float peso, int altura) {
		this.nombre = nombre;
		this.edad = edad;
		DNI = generaDNI();
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		comprobarSexo(sexo);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public long getDNI() {
		return DNI;
	}

//	public void setDNI(long dNI) {
//		DNI = dNI;
//	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso
				+ "kg, altura=" + altura + "m]";
	}

	public int calcularIMC() {
		double imc = (peso / (Math.pow(altura, 2)))*10000;
		int result = -1;
		if (imc < 20) {
			result = -1;
		} else if (imc >= 20 && imc <= 25) {
			result = 0;
		} else if (imc > 25) {
			result = 1;
		}
//		System.out.println("imc="+imc);
		return result;
	}
	
	public boolean esMayorDeEdad() {
		boolean result = false;
		if (edad >= 18) {
			result = true;
		}
		return result;
	}
	
	private void comprobarSexo(char sexo) {
		if (sexo=='M'||sexo=='m') {
			setSexo('M');
		} else {
			setSexo('H');			
		}
	}
	
	private int generaDNI() {
		int nuevoDNI = 12345678;
		
		return nuevoDNI;
	}
}
