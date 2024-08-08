
package libreriapo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kim Villeda
 */
public class Usuario {
     private String nombre;
    private List<Libro> librosPrestados;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.librosPrestados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void prestarLibro(Libro libro) {
        if (libro.estaDisponible()) {
            libro.prestar();
            librosPrestados.add(libro);
            System.out.println(nombre + " ha prestado el libro: " + libro.getTitulo());
        } else {
            System.out.println("El libro " + libro.getTitulo() + " no esta disponible para prestamo.");
        }
    }

    public void devolverLibro(Libro libro) {
        if (librosPrestados.contains(libro)) {
            libro.devolver();
            librosPrestados.remove(libro);
            System.out.println(nombre + " ha devuelto el libro: " + libro.getTitulo());
        } else {
            System.out.println("El libro " + libro.getTitulo() + " no está en la lista de libros prestados.");
        }
    }

    public void listarLibrosPrestados() {
        System.out.println("Libros prestados por " + nombre + ":");
        for (Libro libro : librosPrestados) {
            System.out.println("- " + libro.getTitulo() + " por " + libro.getAutor());
        }
    }
}
