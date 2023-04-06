import java.util.Scanner;

public class Perro {
    // atributos
    String raza;
    int edad;
    String ladrando = "Callado";

    // acciones que los objetos pueden realizar
    void ladrar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quieres que el perro ladre?: (1:si, 0:No)");
        int dato = sc.nextInt();
        if (dato == 1)
            ladrando = "wof wof";
        else
            ladrando = "...";
    }

    public static void main(String[] args) {
        Perro Pperro = new Perro();
        System.out.println("El perro esta: " + Pperro.ladrando);
        Pperro.ladrar();
        System.out.println("El perro esta: " + Pperro.ladrando);
    }
}