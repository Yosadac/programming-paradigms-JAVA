import java.util.ArrayList;
import java.util.Scanner;

class PlantillaEstudiante {
    String nombre;
    int edad;
    int boleta;
}

public class MainEstudiante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total;
        System.out.println("Total de estudiantes: ");
        total = sc.nextInt();
        ArrayList<PlantillaEstudiante> listaEstudiantes = new ArrayList<PlantillaEstudiante>();
        for (int i = 0; i < total; i++) {
            // OBTENER DATOS
            String nombre;
            int boleta, edad;
            System.out.println("Proporciona el nombre: ");
            nombre = sc.next();
            System.out.println("Proporciona la boleta: ");
            boleta = sc.nextInt();
            System.out.println("Proporciona la edad: ");
            edad = sc.nextInt();
            // estructura
            PlantillaEstudiante auxiliar = new PlantillaEstudiante();
            auxiliar.edad = edad;
            auxiliar.nombre = nombre;
            auxiliar.boleta = boleta;
            // guardamos en vector
            listaEstudiantes.add(auxiliar);
        }
        // REVISAR LISTA
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            System.out.println((i + 1) + " El nombre es: " + listaEstudiantes.get(i).nombre);
            System.out.println((i + 1) + " La boleta es: " + listaEstudiantes.get(i).boleta);
            System.out.println((i + 1) + " La edad es: " + listaEstudiantes.get(i).edad);
        }
        sc.close();
    }
}