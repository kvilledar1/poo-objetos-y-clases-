Sistema de Gestión de Biblioteca

Este sistema  de biblioteca en Java permite a los usuarios gestionar libros, incluyendo el préstamo y la devolución de los mismos. Utiliza principios de Programación Orientada a Objetos (POO) y está compuesto por las siguientes clases principales:

Libro:  muestra un libro en la biblioteca.
Usuario: muestra  un usuario de la biblioteca.
poo: es  método `main` que ejecuta el programa 

Estructura del Proyecto
Libro.java: Define la clase `Libro` con atributos para el título, autor y disponibilidad del libro. Incluye métodos para prestar y devolver libros.
Usuario.java: Define la clase `Usuario` con atributos para el nombre del usuario y una lista de libros prestados. Incluye métodos para prestar y devolver libros así como para listar los libros prestados.
poo.java: Contiene el método `main` que inicializa instancias de libros y usuarios y muestra como interactuar con el sistema.

Cómo Funciona el Sistema

 Clase Libro:
   Atributos:
   
  titulo: El título del libro.
  autor: El autor del libro.
  disponible: Indica si el libro está disponible para préstamo.

Métodos:
prestar(): Marca el libro como no disponible si está disponible.
devolver(): Marca el libro como disponible.
estaDisponible(): Devuelve el estado de disponibilidad del libro.
getTitulo(): Devuelve el título del libro.
getAutor(): Devuelve el autor del libro.

 Clase Usuario:
   Atributos:
   nombre: El nombre del usuario.
   librosPrestados: Una lista de libros que el usuario ha tomado prestados.
   Métodos:
   prestarLibro(Libro libro): Permite al usuario tomar prestado un libro si está disponible y lo añade a su lista de libros prestados.
   devolverLibro(Libro libro): Permite al usuario devolver un libro y lo elimina de su lista de libros prestados.
   listarLibrosPrestados(): Muestra todos los libros que el usuario tiene prestados actualmente.
   getNombre(): Devuelve el nombre del usuario.

 Clase Main:
Función Principal: Inicializa instancias de libros y usuarios, y demuestra cómo usar los métodos para prestar, devolver libros y listar los libros prestados.

Cómo Ejecutar el Código

 Clonar el Repositorio:
   Clona el repositorio del proyecto (si está en un repositorio remoto) usando Git:
   bash
https://github.com/kvilledar1/poo-objetos-y-clases-.git

   
