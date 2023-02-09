import java.util.ArrayList;

public class BibliotecaVirtual {

	
	
	//----------------------------Objetos
	ArrayList<MaterialBibliografico> materiales = new ArrayList<MaterialBibliografico>(); //Lista
	Libro Libro = new Libro();
	Revista Revista = new Revista();
	DVD DVD = new DVD();
	
	//----------------------------Metodos
	
	public void setMaterial () {
		boolean activo = true;
		int opcion;
		String Press;
		
		ClearConsole.clear();
		System.out.print("1.Agregar Libro"
				+ "\n2.Agregar revista"
				+ "\n3.Agregar DVD"
				+ "\n4.Cancelar"
				+ "\nOpcion a elegir --->>  ");
		opcion = Input.scan.nextInt();
		
		switch (opcion) {
		
		case 1:
			ClearConsole.clear();
			
			try {
			System.out.print("Introduzca el autor del libro --->>  ");
			String autor = Input.scan.next();
			Input.scan.nextLine();
			
			System.out.print("\nIntroduzca el titulo del libro --->>  ");
			String titulo = Input.scan.next();
			Input.scan.nextLine();
			
			System.out.print("\nIntroduzca el anio de publicacion del libro --->>  ");
			String fecha = Input.scan.next();
			Input.scan.nextLine();
			
			System.out.print("\nIntroduzca el numero de paginas del libro --->>  ");
			int paginas = Input.scan.nextInt();
			
			System.out.print("\nIntroduzca el editorial del libro --->>  ");
			String editorial = Input.scan.next();
			Input.scan.nextLine();
			
			Libro.Autor = autor;
			Libro.Titulo = titulo;
			Libro.edad_publicacion = fecha;
			Libro.Num_paginas = paginas;
			Libro.Editorial = editorial;
			
			System.out.print("\nLibro agregado con exitos!"
					+ "\nIntroduzca cualquier tecla para continuar...");
			Press = Input.scan.next();
			
			} catch (Exception ex) {System.out.print("\nHa ocurrido el siguiente error: " + ex +
					"\nNo se ha podido agregar el libro a la biblioteca"
					+ "\nIntroduzca cualquier tecla para continuar..."); 
			Press = Input.scan.next();}
			
			break;
			
		case 2:
			ClearConsole.clear();
			
			try {
			System.out.print("Introduzca el autor de la revista --->>  ");
			String autor = Input.scan.next();
			Input.scan.nextLine();
			
			System.out.print("\nIntroduzca el titulo de la revista --->>  ");
			String titulo = Input.scan.next();
			Input.scan.nextLine();
			
			System.out.print("\nIntroduzca el anio de publicacion de la revista --->>  ");
			String fecha = Input.scan.next();
			Input.scan.nextLine();
			
			System.out.print("\nIntroduzca el numero de paginas de la revista --->>  ");
			int paginas = Input.scan.nextInt();
			
			System.out.print("\nIntroduzca el ISSN de la revista --->>  ");
			int issn = Input.scan.nextInt();
			
			
			Revista.Autor = autor;
			Revista.Titulo = titulo;
			Revista.edad_publicacion = fecha;
			Revista.Num_paginas = paginas;
			Revista.ISSN = issn;
			
			System.out.print("\nRevista agregada con exitos!"
					+ "\nIntroduzca cualquier tecla para continuar...");
			Press = Input.scan.next();
			
			} catch (Exception ex) {System.out.print("\nHa ocurrido el siguiente error: " + ex +
					"\nNo se ha podido agregar la revista a la biblioteca"
					+ "\nIntroduzca cualquier tecla para continuar..."); 
			Press = Input.scan.next();}
			break;
			
		case 3:
			ClearConsole.clear();
			
			try {
			System.out.print("Introduzca el autor del DVD --->>  ");
			String autor = Input.scan.next();
			Input.scan.nextLine();
			
			System.out.print("\nIntroduzca el titulo del DVD --->>  ");
			String titulo = Input.scan.next();
			Input.scan.nextLine();
			
			System.out.print("\nIntroduzca el anio de publicacion del DVD --->>  ");
			String fecha = Input.scan.next();
			Input.scan.nextLine();
			
			System.out.print("\nIntroduzca el numero de paginas del DVD --->>  ");
			int paginas = Input.scan.nextInt();
			
			System.out.print("\nIntroduzca la cantidad de duracion en segundos del DVD --->>  ");
			int duracion = Input.scan.nextInt();
			
			
			DVD.Autor = autor;
			DVD.Titulo = titulo;
			DVD.edad_publicacion = fecha;
			DVD.Num_paginas = paginas;
			DVD.Duracion_s = duracion;
			
			System.out.print("\nDVD agregado con exitos!"
					+ "\nIntroduzca cualquier tecla para continuar...");
			Press = Input.scan.next();
			
			} catch (Exception ex) {System.out.print("\nHa ocurrido el siguiente error: " + ex +
					"\nNo se ha podido agregar el dvd a la biblioteca"
					+ "\nIntroduzca cualquier tecla para continuar..."); 
			Press = Input.scan.next();}
			break;
			
		case 4:
			ClearConsole.clear();
			System.out.print("Saliendo...");
			break;
			
		default:
			ClearConsole.clear();
			System.out.print("Error, opcion no valida!"
					+ "\nIntroduzca cualquier tecla para continuar...");
			Press = Input.scan.next();
			break;
		}
	}
	
	public void deleteMaterial () {
		
		int opcion;
		String Press;
		
		ClearConsole.clear();
		System.out.print("1.Borrar libro"
				+ "\n2.Borrar Revista"
				+ "\n3.Borrar DVD"
				+ "\n4.Cancelar"
				+ "\nOpcion a elegir --->>  ");
		opcion = Input.scan.nextInt();
		
		switch (opcion) {
		
		case 1:
			ClearConsole.clear();
			System.out.print("Introduzca el titulo del libro que desee eliminar --->>  ");
			String titulo = Input.scan.next();
			Input.scan.nextLine();
			
			try {
			Libro.Titulo = null;
			Libro.Autor = null;
			Libro.edad_publicacion = null;
			Libro.Num_paginas = 0;
			Libro.Editorial = null;
			
			ClearConsole.clear();
			System.out.print("Libro eliminado con exitos!"
					+ "\nIntroduzca cualquier tecla para continuar...");
			Press = Input.scan.next();
			
			} catch (Exception ex) {
				ClearConsole.clear();
				System.out.print("Ha ocurrido un error, no se a podido eliminar el libro!"
						+ "\nIntroduzca cualquier tecla para continuar...");
				Press = Input.scan.next();
			} 
			break;
			
		case 2:
			ClearConsole.clear();
			System.out.print("Introduzca el titulo de la revista que desee eliminar --->>  ");
			titulo = Input.scan.next();
			Input.scan.nextLine();
			
			try {
			Revista.Titulo = null;
			Revista.Autor = null;
			Revista.edad_publicacion = null;
			Revista.Num_paginas = 0;
			Revista.ISSN = 0;
			
			ClearConsole.clear();
			System.out.print("Revista eliminada con exitos!"
					+ "\nIntroduzca cualquier tecla para continuar...");
			Press = Input.scan.next();
			
			} catch (Exception ex) {
				ClearConsole.clear();
				System.out.print("Ha ocurrido un error, no se a podido eliminar la revista!"
						+ "\nIntroduzca cualquier tecla para continuar...");
				Press = Input.scan.next();
			} 
			break;
			
		case 3:
			ClearConsole.clear();
			System.out.print("Introduzca el titulo del dvd que desee eliminar --->>  ");
			titulo = Input.scan.next();
			Input.scan.nextLine();
			
			try {
			DVD.Titulo = null;
			DVD.Autor = null;
			DVD.edad_publicacion = null;
			DVD.Num_paginas = 0;
			DVD.Duracion_s = 0;
			
			ClearConsole.clear();
			System.out.print("DVD eliminado con exitos!"
					+ "\nIntroduzca cualquier tecla para continuar...");
			Press = Input.scan.next();
			
			} catch (Exception ex) {
				ClearConsole.clear();
				System.out.print("Ha ocurrido un error, no se a podido eliminar el libro!"
						+ "\nIntroduzca cualquier tecla para continuar...");
				Press = Input.scan.next();
			} 
			break;
			
		case 4:
			ClearConsole.clear();
			System.out.print("Saliendo...");
			break;
			
		default:
			ClearConsole.clear();
			System.out.print("Error, opcion no valida!"
					+ "\nIntroduzca cualquier tecla para continuar...");
			Press = Input.scan.next();
			break;
		}
	}
	
	public void showMaterial () {
		int opcion;
		String Press;
		
		ClearConsole.clear();
		System.out.print("1.Mostrar libro"
				+ "\n2.Mostrar revista"
				+ "\n3.Mostrar DVD"
				+ "\n4.Cancelar"
				+ "\nOpcion a elegir --->>  ");
		opcion = Input.scan.nextInt();
		
		switch (opcion) {
		
		case 1:
			ClearConsole.clear();
			System.out.print("Introduzca el titulo del libro que desea ver --->>  ");
			String titulo = Input.scan.next();
			Input.scan.nextLine();
			
			if (Libro.Titulo.equals(titulo)) {
				ClearConsole.clear();
				System.out.print("El autor del libro es: " + Libro.Autor
						+ "\nEl titulo del libro es: " + Libro.Titulo
						+ "\nEl editorial del libro es: " + Libro.Editorial
						+ "\nLa fecha de creacion del libro es: " + Libro.edad_publicacion
						+ "\nLa cantidad de paginas del libro es: " + Libro.Num_paginas);
				
				System.out.print("\nIntroduzca cualquier tecla para continuar...");
				Press = Input.scan.next();
			} else {
				ClearConsole.clear();
				System.out.print("Lo sentimos, no existe ese libro!"
						+ "\nIntroduzca cualquier tecla para continuar...");
				Press = Input.scan.next();
			}
			break;
			
		case 2:
			ClearConsole.clear();
			System.out.print("Introduzca el titulo de la revista que desea ver --->>  ");
			titulo = Input.scan.next();
			Input.scan.nextLine();
			
			if (Revista.Titulo.equals(titulo)) {
				ClearConsole.clear();
				System.out.print("El autor de la revista es: " + Revista.Autor
						+ "\nEl titulo de la revista es: " + Revista.Titulo
						+ "\nEl ISSN de la revista es: " + Revista.ISSN
						+ "\nLa fecha de creacion de la revista es: " + Revista.edad_publicacion
						+ "\nLa cantidad de paginas de la revista es: " + Revista.Num_paginas);
				
				System.out.print("\nIntroduzca cualquier tecla para continuar...");
				Press = Input.scan.next();
			} else {
				ClearConsole.clear();
				System.out.print("Lo sentimos, no existe esa revista!"
						+ "\nIntroduzca cualquier tecla para continuar...");
				Press = Input.scan.next();
			}
			break;
			
		case 3:
			break;
			
		case 4:
			ClearConsole.clear();
			System.out.print("Saliendo...");
			break;
			
		default:
			ClearConsole.clear();
			System.out.print("Error, opcion no valida!"
					+ "\nIntroduzca cualquier tecla para continuar...");
			Press = Input.scan.next();
			break;
		}
	}
	
	public void intOBJ () {
		
		
		boolean activo = true;
		int opcion;
		String Press;
		
		do {
			ClearConsole.clear();
			System.out.print("1.Prestamo"
					+ "\n2.Devolucion"
					+ "\n3.Mostrar informacion"
					+ "\n4.Salir"
					+ "\nOpcion a elegir --->>  ");
			
			opcion = Input.scan.nextInt();
			
			switch (opcion) {
			
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			default:
				ClearConsole.clear();
				System.out.print("Error, opcion no valida!"
						+ "\nIntroduzca cualquier tecla para continuar...");
				Press = Input.scan.next();
				break;
			}
			
			
		} while (activo);
		
		
		
	}
}
