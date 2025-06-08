package primerProyecto;

//Es el motor de arranque de cualquier aplicacion 
public class Principal {
	//static permite que el metodo sea llamado sin crear una instancia de clase 
	public static void main(String[] args) {
		
		//Instancia de clase con asignacaion de valores utilizando las variables publicas 
		Frutas fruta = new Frutas();
		//Asignacion de valores 
		fruta.sabor = "Dulce";
		fruta.color = "Rojo";
		fruta.peso = 30f;
		fruta.precio = 10;
		
		//Mostrando informacion 
		System.out.println("Los datos de la primera fruta");
		System.out.println("Sabor "+ fruta.sabor);
		System.out.println("Color "+ fruta.color);
		System.out.println("Peso "+ fruta.peso);
		System.out.println("Precio "+ fruta.precio);

		//Instancia de la clase con encapilamineto
		
		Frutas fruta2 = new Frutas();
		
		//Set--enviar 
		fruta2.setSabor("Agrico");
		fruta2.setColor("Verde");
		fruta2.setPeso(.40f);
		fruta2.setPrecio(10f);
		
		//Get --obtener 
		System.out.println("\nLos datos de la segunda fruta");
		System.out.println("Sabor " + fruta2.getSabor());
		System.out.println("Color " + fruta2.getColor());
		System.out.println("Peso " + fruta2.getPeso());
		System.out.println("Precio "+ fruta2.getPrecio());
		
		//Instancia de clase con el construcotr con parametros 
		Frutas fruta3 = new Frutas("Dulce", "Amarillo", 40f, 15f);
		System.out.println("\nDatos de la segunda fruta: ");
		System.out.println(fruta3.toString());
		
		
		
		
		
		
		
		
		
		
		
	}

}
