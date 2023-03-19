public class Switch {
  public static void main(String[] args) {

    var colorModeSelected = "";

    switch (colorModeSelected) {
      case "light":
        System.out.println("seleccionaste Light Mode");
        break;
      case "night":
        System.out.println("seleccionaste Night Mode");
        break;
      case "blue":
        System.out.println("seleccionaste Blue Mode");
        break;
      default:
        System.out.println("selecciona una opcion");
    }
  }
}
