import java.util.Scanner;

class KilometroPorHora
{
  public static void main(String[] args)
  {
      Scanner Lectura = new Scanner(System.in);
      float km;
      int hrs;

      System.out.println("INGRESA LOS KILOMETROS: ");
      km= Lectura.nextFloat();
      System.out.println("INGRESA LAS HORAS: ");
      hrs= Lectura.nextInt();

      System.out.println(km +"km /" + hrs + "h  equivalen a " + km*1000 + "m /" + hrs*3600 + "s");
  }
}