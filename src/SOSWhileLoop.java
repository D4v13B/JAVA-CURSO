public class SOSWhileLoop {
  static boolean isTurnOnLight = false;

  public static void main(String[] args) {
    TurnOnLight();

    int i = 1;
    while (isTurnOnLight && i <= 10) {
      printSOS();
      i++;
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
