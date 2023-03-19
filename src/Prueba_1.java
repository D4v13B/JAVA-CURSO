import java.util.Scanner;

public class Prueba_1 {

  public static Scanner sc = new Scanner(System.in);

  //Programa que consiste en seleccionar que figura geomatrica desea calcular
  public static void main(String[] args) {
    //Inicializamos -- Medidas de los solidos que vamos a utilizar
    String[] solids = {"Circulo", "Cilindro", "Esfera", "Paralelipiedo"};

    System.out.println("Hola, como te llamas?");
    var nombre = sc.nextLine();
    //Arreglo de los solidos

    //Menu de figuras
    System.out.println(nombre + " ,que figura deseas calcular, selecciona con el numero que le corresponde");
    for (int i = 0; i < solids.length; i++) {
      System.out.println(i + "." + solids[i]);
    }
    //PETICION DE ELEGIR FIGURA
    int seleccion = sc.nextInt();


    //REDIRIGIMOS HACIA LA FUNCION
    switch (seleccion) {
      case 0:
        circle();
        break;
      case 1:
        cilindro();
        break;
    }

  }

  public static void circle() {
    System.out.println("Dame la longitud del radio");
    double radio = sc.nextDouble();
    System.out.println("Tu area mide " + Math.round(Math.PI * Math.pow(radio, 2)));
  }

  public static void cilindro() {
    System.out.println("Dame la longitud del radio");
    double radio = sc.nextDouble();
    System.out.println("Dame la longitud de la altura");
    double height = sc.nextDouble();
    System.out.println("Tu area mide " + (Math.PI * radio) * (2 * height + radio));
  }
}


/*
 * 1. EL programa pedira el nombre del estudiante
 * 2. Debe seleccionar que figura va a calcular su respectivas medidas (Circulo, Cilindro, Esfera, Paraleliepipedo)
 *----Elementos para el calculo
 * Radios(Cilindro, circulo y esfera) / Alturas(Cilindro, Paralelipipedo) / BASES (PARALELIPIPEDO) / PROFUNDIDAD (PARALELIPEPIDO)
 *
 * */

// FORMULAS PARA EL CIRCULO
/* AREA = PI * R^2
 * --------------------------
 * FORMULAS CILINDRO
 * AREA TOTAL
 * = PI * R (2H + R)
 * VOLUMEN
 * = PI * R^2 * H
 * --------------------------
 * FORMULAS DE ESFERA
 *
 * A = 4 * PI * R^2
 * v = (4/3) PI * R^3
 *
 * -------------------------
 * FORMULAS DEL PARALELIPIPEDO
 * A = 6 B*H
 * V = B*H*P
 * */