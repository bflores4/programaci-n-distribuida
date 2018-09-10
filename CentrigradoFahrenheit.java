import java.util.Scanner;

class CentrigradoFahrenheit
{
  public static void main(String[] args)
  {
    Scanner Lectura = new Scanner(System.in);
    int centigrados;

    System.out.println("INGRESA LOS GRADOS CENTIGRADOS:");
    centigrados = Lectura.nextInt();

    System.out.println(centigrados + " GRADOS CENTIGRADOS EQUIVALEN A " + (32 + ((9* centigrados)/5)) + " GRADOS FAHRENHEIT");
  }
}