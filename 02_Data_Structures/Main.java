public class Main {

    public static void main(String[] args) {

        // Definir la estructura plantillaPerro
        class plantillaPerro {
            int edad;
            String raza;
            int peso;
            float estatura;
        }

        // Definir la estructura plantillaTiburon
        class plantillaTiburon {
            int peso;
            plantillaPerro similitudes = new plantillaPerro();
        }

        // Crear un perro
        plantillaPerro perro = new plantillaPerro();
        perro.edad = 5;
        perro.raza = "Chihuhua";
        System.out.println("La edad del perro es: " + perro.edad);
        System.out.println("La raza del perro es: " + perro.raza);
        perro.raza = "pitbull";
        System.out.println("La raza del perro es: " + perro.raza);

        // Crear otro perro
        plantillaPerro otroPerro = new plantillaPerro();
        otroPerro.edad = 7;
        otroPerro.raza = "maltes";
        System.out.println("La raza del otro perro es: " + otroPerro.raza);
        System.out.println("La edad del otro perro es: " + otroPerro.edad);

        // Verificar si otroPerro es mayor que perro
        if (otroPerro.edad > perro.edad) {
            perro.estatura = 67.78f;
        }
        System.out.println("La estatura del perro 1 es: " + perro.estatura);

        // Crear un tiburón
        plantillaTiburon tiburon1 = new plantillaTiburon();
        tiburon1.peso = 500;
        System.out.println("El peso del tiburon 1 es: " + tiburon1.peso);
        tiburon1.similitudes.raza = "martillo";
        System.out.println("La raza del tiburon 1 es: " + tiburon1.similitudes.raza);
    }
}