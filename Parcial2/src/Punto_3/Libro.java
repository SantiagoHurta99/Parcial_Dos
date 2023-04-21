package Punto_3;

/**
 * @author Santiago Hurtado
 * */

public class Libro {
	private int ISBN;
	private String titulo;
	private String autor;
	private int numeroPaginas;
	
	public Libro(int ISBN, String titulo, String autor, int numeroPaginas) {
		this.ISBN = ISBN;
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int ISBN) {
		this.ISBN = ISBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	@Override
	public String toString() {
		return "El libro " + ISBN + " creado por " + autor + " tiene " + numeroPaginas + " paginas";
	}
	
	
}
