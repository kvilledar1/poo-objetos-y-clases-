
package libreriapo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kim Villeda
 */
public class LibreriaPO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Crear libros
        Libro libro1 = new Libro("Pedro y el Capitan", "Mario Benedetti");
        Libro libro2 = new Libro("Nos vemos en agosto", "Gabriel Garcia Marquez");
        Libro libro3 = new Libro("Tres veces tu", "Federico Moccia");

        // Crear usuarios
        Usuario usuario1 = new Usuario("Adria Villeda");
        Usuario usuario2 = new Usuario("Ana Jozzeth");
        Usuario usuario3 = new Usuario("Alejandra Herrera");

        // Lista de libros en la biblioteca
        List<Libro> biblioteca = new ArrayList<>();
        biblioteca.add(libro1);
        biblioteca.add(libro2);
        biblioteca.add(libro3);

        // Mostrar cantidad de libros en la biblioteca
        System.out.println("Libros disponibles en la biblioteca:");
        for (Libro libro : biblioteca) {
            System.out.println("- " + libro.getTitulo() + " por " + libro.getAutor());
        }

        // Simular préstamos y devoluciones
        usuario1.prestarLibro(libro1); // Adria Villeda toma prestado "Pedro y el Capitán"
        usuario2.prestarLibro(libro1); // Intento de Ana Jozzeth de tomar el mismo libro
        usuario1.listarLibrosPrestados(); // Ver libros prestados por Adria Villeda

        usuario1.devolverLibro(libro1); // Adria Villeda devuelve el libro
        usuario2.prestarLibro(libro1); // Ana Jozzeth toma prestado "Pedro y el Capitán"

        // Mostrar libros después de las operaciones
        System.out.println("\nEstado final de los libros:");
        for (Libro libro : biblioteca) {
            System.out.println("- " + libro.getTitulo() + " por " + libro.getAutor() + " (Disponible: " + libro.estaDisponible() + ")");
        }
    }
    
}
