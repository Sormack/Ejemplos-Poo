package proyectoBiblioteca;

public class Principal {

	public static void main(String[] args) {
		Libros libro = new Libros();
		
		libro.titulo = "Quijote";
		libro.numeroPag = 200;
		libro.precion = 85;
		libro.existenicia = true;
		
		System.out.println("Primer Libro");
		System.out.println("Titulo: "+ libro.titulo);
		System.out.println("Numero de paginas: " + libro.numeroPag);
		System.out.println("Precio del libro: " + "$"+libro.precion);
		System.out.println("Existencia del libro: "+ libro.existenicia);
		
		Libros libroDos = new Libros();
		
		libroDos.setTitulo("El seño de los anillos");
		libroDos.setNumeroPag(452);
		libroDos.setPrecion(453);
		libroDos.setExistenicia(false);
		
		System.out.println("\nSegundo Libro");
		System.out.println("Titulo: "+ libroDos.getTitulo());
		System.out.println("Numero de paginas: " + libroDos.getNumeroPag());
		System.out.println("Precio del libro: " + "$"+ libroDos.getPrecion());
		System.out.println("Existencia del libro: "+ libroDos.isExistenicia());
		
		System.out.println("\nTercer Libro");
		Libros libroTres = new Libros("Guerra de los mudos", 256, 325, true);
		
		System.out.println(libroTres.toString());
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
