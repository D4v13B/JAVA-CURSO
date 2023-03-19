public class OperacionesMatematicas {
  public static void main(String[] args) {
    double x = 2.1;
    double y = 3;

    System.out.println(Math.ceil(x));
    System.out.println(Math.floor(x));

    //Elevar un numero a otro (Math.pow(base, exponente))
    System.out.println(Math.pow(x, y));

    //Devuelve el mayor
    System.out.println(Math.max(x, y));

    //Raiz cuadrada
    System.out.println(Math.sqrt(y));

    //Formula de un circulo
    System.out.println(Math.PI * Math.pow(y, 2));

    //Area de una esfera 4*PI*R*R
    var areaEsfera = 4 * Math.PI * Math.pow(y, 2);

    //Volumen de una esfera
    var volumenEsfera = (4 / 3) * Math.PI * Math.pow(y, 3);

    System.out.println(volumenEsfera + " cm3");
  }
}