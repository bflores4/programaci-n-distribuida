import java.util.Scanner;

class PositiveOrNegative
{
  public static void main(String[] args)
  {
    Scanner Lectura = new Scanner(System.in);
    int n;

    System.out.println("INGRESA UN NUMERO");
    n = Lectura.nextInt();

    while(n != 0)
    {
        if(n>0)
            System.out.println("ES POSITIVO");
        else
            System.out.println("ES NEGATIVO");
            
        System.out.println("INGRESA UN NUMERO");
        n = Lectura.nextInt();
    }
  }
}