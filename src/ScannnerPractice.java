import java.util.Scanner;

public class ScannnerPractice {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {


    System.out.println("Inserta tu nombre");

    String name = sc.nextLine();

    System.out.println("Tu nombre es " + name);
  }
}
