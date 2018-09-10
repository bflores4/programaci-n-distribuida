import java.util.Scanner;

class TablasMultiplicar
{
  public static void main(String[] args)
  {
      System.out.println("Tablas de multiplicar del 1 al 12");

      for(int i=1; i<=12; i++)
      {
          for(int j=1; j<=10; j++)
          {
                System.out.format("%d * %d = %d\n",i, j, i*j);
          }
      }
  }
}