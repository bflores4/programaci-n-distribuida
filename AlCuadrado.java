import java.util.Scanner;

class AlCuadrado
{
  public static void main(String[] args)
  {
      Scanner Lectura = new Scanner(System.in);
      int n;

      System.out.println("INGRESA UN NUMERO");
      n = Lectura.nextInt();

    do
    {
      System.out.println("EL cuadrado de " + n + " es " + Math.pow(n, 2));

      System.out.println("INGRESA UN NUMERO");
      n = Lectura.nextInt();
    }
    while(n>=0);
  }
}