import java.util.Scanner;

class Circunferencia
{
  public static void main(String[] args)
  {
    Scanner Lectura = new Scanner(System.in);
    int radio;

    System.out.println("INGRESE EL RADIO DE LA CIRCUNFERECIA:");
    radio = Lectura.nextInt();

    System.out.println("Longitud: " + (2*Math.PI*radio) + "\nArea: " + (Math.PI * Math.pow(radio, 2)));
  }
}