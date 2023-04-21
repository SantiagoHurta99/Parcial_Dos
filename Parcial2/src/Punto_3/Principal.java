package Punto_3;

/**
 * @author Santiago Hurtado
 * */

public class Principal {

	public static void main(String[] args) {
		Libro l1 = new Libro(12345, "titulo1", "autor1", 50);
		Libro l2 = new Libro(67890, "titulo2", "autor2", 80);
		System.out.println(l1.toString());
		System.out.println(l2.toString());
		if (l1.getNumeroPaginas() > l2.getNumeroPaginas()) {
			System.out.println("El libro " + l1.getTitulo() + " tiene mas paginas");
		} else if (l1.getNumeroPaginas() < l2.getNumeroPaginas()) {
			System.out.println("El libro " + l2.getTitulo() + " tiene mas paginas");
		} else {
			System.out.println("Los dos libros tienen la misma cantidad de paginas");
		}
	}

}
