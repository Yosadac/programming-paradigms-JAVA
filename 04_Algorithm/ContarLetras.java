import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class ContarLetras {

    public static void contarLetras(String cadena) {
        String ArrayCadena[] = cadena.split("");

        String letras[] = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p",
                "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };

        Map<String, Integer> diccionario = new HashMap<>();

        int contador = 0;
        boolean caracter = false;

        for (int i = 0; i < letras.length; i++) {
            for (int j = 0; j < ArrayCadena.length; j++) {
                if (ArrayCadena[j].equals(letras[i])) {
                    contador = contador + 1;
                }
            }
            if (contador != 0) {
                System.out.print(letras[i] + " ");
                System.out.println(contador);
            }
            contador = 0;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una cadena de texto:");
        String cadena = scanner.nextLine();
        contarLetras(cadena);

    }

}
