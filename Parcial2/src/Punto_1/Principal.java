package Punto_1;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @author Santiago Hurtado
 * */

public class Principal {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Ingrese una frase:");
			String fraseUsuario = sc.nextLine();
			char[] arregloCaracteres = fraseUsuario.toCharArray();
//			Alternativa 1 para imprimir la lista de caracteres recibidos ignorando los espacios
			for (int i = 0; i < arregloCaracteres.length; i++) {
				if (arregloCaracteres[i] != ' ') {
					System.out.println(arregloCaracteres[i]);					
				}
			}
//			Alternativa 2 para imprimir en una sola linea ignorando los espacios
			for (int i = 0; i < arregloCaracteres.length; i++) {
				if (arregloCaracteres[i] != ' ') {
					System.out.print(arregloCaracteres[i]);
					if (i+1 != arregloCaracteres.length) {
						System.out.print("-");
					}					
				}
			}
		}
	}

}
