public class ForLoop {

  static boolean isTurnOnLight = false;

  public static void main(String[] args) {
    TurnOnLight();

    for (int i = 1; i <= 10; i++) {
      printSOS();
      break;
    }
  }

  public static void printSOS() {
    System.out.println("...___...");
  }

  public static boolean TurnOnLight() {
    isTurnOnLight = !isTurnOnLight;
    return isTurnOnLight;
  }
}
