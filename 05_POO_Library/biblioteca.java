import java.util.ArrayList;
import java.util.Scanner;

public class biblioteca {

    String titulo;
    String autor;
    String editorial;
    int ejemplares;

    public biblioteca(String titulo, String autor, String editorial, int ejemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.ejemplares = ejemplares;
    }

    public static void agregar(ArrayList<biblioteca> libros) {
        System.out.println("Ingrese el titulo: ");
        Scanner scanner = new Scanner(System.in);
        String titulo = scanner.nextLine();

        System.out.println("Ingrese el autor: ");
        String autor = scanner.nextLine();

        System.out.println("Ingrese la editorial");
        String editorial = scanner.nextLine();

        System.out.println("Ingrese el número de ejemplares");
        int ejemplares = scanner.nextInt();

        biblioteca libro1 = new biblioteca(titulo, autor, editorial, ejemplares);
        libro1.titulo = titulo;
        libro1.autor = autor;
        libro1.editorial = editorial;
        libro1.ejemplares = ejemplares;

        libros.add(libro1);

    }

    // FUNCIÓN DE ELIMINAR UN LIBRO
    public static void eliminar(ArrayList<biblioteca> libros) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el título del libro que quiere eliminar: ");
        String mostrar = scanner.nextLine();

        boolean existente = false;
        int j = 0;

        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).titulo.equals(mostrar)) {
                // System.out.println("El libro se encuentra en la libreria");
                j = i;
                existente = true;
            }
        }

        for (int i = 0; i < libros.size(); i++) {
            if (existente == true) {
                // REVISAR LISTA
                libros.remove(j);
                System.out.println("Libro eliminado con éxito");
            } else {
                System.out.println("El libro no se pudo eliminar ya que no se encuenta disponible en la libreria");
            }
        }
    }

    // FUNCIÓN DE MOSTRAR UN LIBRO
    public static void mostrar(ArrayList<biblioteca> libros) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el título del libro que quiere mostrar: ");
        String mostrar = scanner.nextLine();

        boolean existente = false;
        int j = 0;

        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).titulo.equals(mostrar)) {
                // System.out.println("El libro se encuentra en la libreria");
                j = i;
                existente = true;
            }
        }

        if (existente == true) {
            // REVISAR LISTA
            System.out.println("El título: " + libros.get(j).titulo);
            System.out.println("De autor: " + libros.get(j).autor);
            System.out.println("De editorial: " + libros.get(j).editorial);
            System.out.println("se encuentra en la biblioteca");
            System.out.println("con la cantidad de: " + libros.get(j).ejemplares + " ejemplares");
        } else {
            System.out.println("El libro no está disponible en la biblioteca");
        }

    }

    // FUNCIÓN DE PRESTAR UN LIBRO
    public static void prestar(ArrayList<biblioteca> libros, ArrayList<biblioteca> prestados) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el título del libro que quiere prestar: ");
        String mostrar = scanner.nextLine();

        boolean existente = false;
        int j = 0;

        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).titulo.equals(mostrar)) {
                // System.out.println("El libro se encuentra en la libreria");
                j = i;
                existente = true;
            }
        }

        if ((existente == true) && (libros.get(j).ejemplares > 0)) {
            // REVISAR LISTA
            prestados.add(libros.get(j));
            libros.get(j).ejemplares = libros.get(j).ejemplares - 1;
            System.out.println("Libro prestado exitosamente");
        } else {
            System.out.println("El libro no se pudo prestar ya que no está en la biblioteca");
        }
    }

    // FUNCIÓN DE MOSTRAR PRESTADOS
    public static void mostrarprestados(ArrayList<biblioteca> prestados) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el título de libros prestados que quiere mostrar: ");
        String mostrar = scanner.nextLine();

        boolean existente = false;
        int j = 0;

        for (int i = 0; i < prestados.size(); i++) {
            if (prestados.get(i).titulo.equals(mostrar)) {
                // System.out.println("El libro se encuentra en la libreria");
                j = i;
                existente = true;
            }
        }

        if (existente == true) {
            // REVISAR LISTA
            System.out.println("El título: " + prestados.get(j).titulo);
            System.out.println("De autor: " + prestados.get(j).autor);
            System.out.println("De editorial: " + prestados.get(j).editorial);
            System.out.println("se encuentra prestado");
        } else {
            System.out.println("El libro no está prestado");
        }

    }

    // FUNCIÓN DE DEVOLVER UN LIBRO
    public static void devolver(ArrayList<biblioteca> libros, ArrayList<biblioteca> prestados) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el título del libro que quiere devolver: ");
        String mostrar = scanner.nextLine();

        boolean existente = false;
        int j = 0;

        for (int i = 0; i < prestados.size(); i++) {
            if (libros.get(i).titulo.equals(mostrar)) {
                // System.out.println("El libro se encuentra en la libreria");
                j = i;
                existente = true;
            }
        }

        if ((existente == true)) {
            // REVISAR LISTA
            libros.get(j).ejemplares = libros.get(j).ejemplares + 1;
            if (prestados.get(j).ejemplares == 0) {
                prestados.remove(j);
            }
            System.out.println("Libro fue devuelto exitosamente");
        } else {
            System.out.println("El libro no se pudo devolver ya que no está prestado");
        }

    }

    // FUNCIÓN PRINCIPAL
    public static void main(String[] args) {
        ArrayList<biblioteca> libros = new ArrayList<>();
        ArrayList<biblioteca> prestados = new ArrayList<>();

        boolean menu = true;
        while (menu == true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("");
            System.out.println("Ingrese alguna de las siguientes opciones");
            System.out.println("0 - Agregar libro");
            System.out.println("1 - Eliminar libro");
            System.out.println("2 - Mostrar libros");
            System.out.println("3 - Pedir prestado un libro");
            System.out.println("4 - Mostrar libros prestados");
            System.out.println("5 - Devolver libros");
            System.out.println("6 - Salir");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 0:
                    agregar(libros);
                    // System.out.println("El título del libro es: " + libros.get(0).titulo);
                    System.out.println("Se agregó el libro correctamente");
                    break;
                case 1:
                    eliminar(libros);
                    break;
                case 2:
                    mostrar(libros);
                    break;
                case 3:
                    prestar(libros, prestados);
                    break;
                case 4:
                    mostrarprestados(prestados);
                    break;
                case 5:
                    devolver(libros, prestados);
                    break;
                case 6:
                    System.out.println("El programa ha finalizado");
                    menu = false;
                    break;
            }
        }

    }
}
