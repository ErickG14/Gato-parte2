import java.util.Scanner;

public class Gato2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingresa una cadena de 9 caracteres (solo se aceptan X, O, y _):");
    String cadena = scanner.nextLine();

    // Validar la longitud de la cadena
    if (cadena.length() != 9) {
      System.out.println("La cadena debe tener exactamente 9 caracteres.");
      return;
    }

    // Validar que la cadena solo tenga los caracteres permitidos
    for (int i = 0; i < cadena.length(); i++) {
      char c = cadena.charAt(i);
      if (c != 'X' && c != 'O' && c != '_') {
        System.out.println("La cadena solo debe contener los caracteres X, O, y _.");
        return;
      }
    }

    // Crear el marco
    System.out.println(" " + cadena.charAt(0) + " | " + cadena.charAt(1) + " | " + cadena.charAt(2) + " ");
    System.out.println("---+---+---");
    System.out.println(" " + cadena.charAt(3) + " | " + cadena.charAt(4) + " | " + cadena.charAt(5) + " ");
    System.out.println("---+---+---");
    System.out.println(" " + cadena.charAt(6) + " | " + cadena.charAt(7) + " | " + cadena.charAt(8) + " ");
  }

}
