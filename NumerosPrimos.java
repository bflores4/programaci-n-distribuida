import java.util.Scanner;

class NumerosPrimos
{
  public static void main(String[] args)
  {
      Scanner Lectura = new Scanner(System.in);
      System.out.println("INGRESE UN NUMERO:");
      int n=Lectura.nextInt();
      int primos=0, divisores=0;

      for(int i=2; i<=n; i++)
      {
        for(int j=2; j<=i; j++)
        {
            if(i%j==0)
            divisores++;
        }

        if(divisores==1)
            primos++;

        divisores=0;
      }
      System.out.print("Existen "+primos+" numeros primos entre 1 y "+n);
  }

}