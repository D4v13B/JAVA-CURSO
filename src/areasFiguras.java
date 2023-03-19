import java.util.Scanner;

/**
 * Programa donde eliges que area de figura geometrica calcular
 */
public class areasFiguras {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double radio = 0;
    double height = 0;

    System.out.println("Que quieres calcular?");
    System.out.println("1. Area del cilidro");
    System.out.println("2. Volumen del cilindro");
    System.out.println("0. Salir");
    int selection = sc.nextInt();

    System.out.println("Insertar el radio");
    radio = sc.nextDouble();
    System.out.println("Insertar la altura");
    height = sc.nextDouble();

    switch (selection) {
      case 1:
        System.out.println(cilinderArea(radio, height));
        break;
      case 2:
        System.out.println(cilinderVolume(radio, height));
        break;
      case 0:
        System.out.println("Thank you very much");
        break;
    }
  }

  public static double cilinderArea(double r, double h) {
    return (2 * Math.PI * Math.pow(r, 2)) + (Math.PI * Math.pow(r, 2));
  }

  public static double cilinderVolume(double r, double h) {
    return Math.PI * Math.pow(r, 2) * h;
  }
}