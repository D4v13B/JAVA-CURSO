public class Functions {
  public static void main(String[] args) {

    double areaCircle = circleArea(7);
    System.out.println(areaCircle);

    System.out.println(sphereArea(8));

    //Currency
    forex(500, "USD");


  }

  public static double circleArea(double radio) {
    return Math.PI * Math.pow(radio, 2);
  }

  public static double sphereArea(double radio) {
    return Math.PI * 4 * Math.pow(radio, 2);
  }

  /**
   * @param quantity Cantidad de Dinero
   * @param currency solo acepta USD o EUR
   * @return Devuelve la cantidad actualizada
   * @author David Bustamante
   * @version 1.0
   * @since 2023
   * Description: Funcion que convierte de USD a EUR o viceversa
   */
  public static double forex(double quantity, String currency) {
    switch (currency) {
      case "EUR":
        quantity = quantity * 1.07;
        System.out.println("Son " + quantity + "USD");
        break;
      case "USD":
        quantity = quantity * 0.94;
        System.out.println("Son " + quantity + "EUR");
    }
    return quantity;
  }
}
