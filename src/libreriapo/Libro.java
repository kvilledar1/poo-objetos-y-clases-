
package libreriapo;

/**
 *
 * @author Kim Villeda
 */
public class Libro {
  private String titulo;
    private String autor;
    private boolean disponible;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean estaDisponible() {
        return disponible;
    }

    public void prestar() {
        if (disponible) {
            disponible = false;
        } else {
            System.out.println("El libro " + titulo + " no esta disponible para prestamo.");
        }
    }

    public void devolver() {
        disponible = true;
    }  
}
