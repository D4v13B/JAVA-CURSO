import java.util.Scanner;

import static java.lang.Integer.valueOf;

public class whileLoop {
  public static void main(String[] args) {
    var responsive = 0;

    do {
      System.out.println("Selecciona el numero");
      System.out.println("1. Catalogo de peliculas");
      System.out.println("2. Catalogo de series");
      System.out.println("0. Salir");

      Scanner sc = new Scanner(System.in);
      responsive = valueOf(sc.nextLine());

      switch (responsive) {
        case 0:
          System.out.println("Gracias por visitarnos");
          break;
        case 1:
          System.out.println("Movies");
          break;
        case 2:
          System.out.println("Series");
          break;
        default:
          System.out.println("Seleccione una opcion correcta");
      }
    } while (responsive != 0);

    System.out.println("Se termino el programa");
  }
}