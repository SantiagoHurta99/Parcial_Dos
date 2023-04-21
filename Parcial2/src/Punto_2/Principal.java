package Punto_2;

import javax.swing.JOptionPane;

/**
 * @author Santiago Hurtado
 * */

public class Principal {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Ingrese los datos de la primer persona");
		String nombre1 = JOptionPane.showInputDialog("Ingrese el nombre:");
		int edad1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad:"));
		char sexo1 = JOptionPane.showInputDialog("Ingrese el sexo: (H: hombre, M: mujer)").charAt(0);
		float peso1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el peso: (kg)"));
		int altura1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura: (m)"));
		Persona p1 = new Persona(nombre1, edad1, sexo1, peso1, altura1);
		JOptionPane.showMessageDialog(null, "Ingrese los datos de la segunda persona");
		String nombre2 = JOptionPane.showInputDialog("Ingrese el nombre:");
		int edad2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad:"));
		char sexo2 = JOptionPane.showInputDialog("Ingrese el sexo: (H: hombre, M: mujer)").charAt(0);
		Persona p2 = new Persona(nombre2, edad2, sexo2);
		Persona p3 = new Persona();
		p3.setNombre("lupe");
		p3.setEdad(16);
		p3.setSexo('M');
		p3.setPeso(50);
		p3.setAltura(160);
		
		if (p1.calcularIMC() == -1) {
			System.out.println(p1.getNombre() + " esta bajo peso");
		} else if (p1.calcularIMC() == 0) {
			System.out.println(p1.getNombre() + " esta en peso normal");			
		} else {
			System.out.println(p1.getNombre() + " esta en en sobrepeso");			
		}
		if (p2.calcularIMC() == -1) {
			System.out.println(p2.getNombre() + " esta bajo peso");
		} else if (p2.calcularIMC() == 0) {
			System.out.println(p2.getNombre() + " esta en peso normal");			
		} else {
			System.out.println(p2.getNombre() + " esta en en sobrepeso");			
		}
		if (p3.calcularIMC() == -1) {
			System.out.println(p3.getNombre() + " esta bajo peso");
		} else if (p3.calcularIMC() == 0) {
			System.out.println(p3.getNombre() + " esta en peso normal");			
		} else {
			System.out.println(p3.getNombre() + " esta en en sobrepeso");			
		}
		
		System.out.println();
		
		if (p1.esMayorDeEdad()) {
			System.out.println(p1.getNombre() + " es mayor de edad");
		}else {
			System.out.println(p1.getNombre() + " es menor de edad");
		}
		if (p2.esMayorDeEdad()) {
			System.out.println(p2.getNombre() + " es mayor de edad");
		}else {
			System.out.println(p2.getNombre() + " es menor de edad");
		}
		if (p3.esMayorDeEdad()) {
			System.out.println(p3.getNombre() + " es mayor de edad");
		}else {
			System.out.println(p3.getNombre() + " es menor de edad");
		}

		System.out.println();
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
	}
}
