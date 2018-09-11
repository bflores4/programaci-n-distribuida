import java.util.Scanner;
import java.util.Vector;

class VectorMedia
{
  public static void main(String[] args)
  {
      Scanner Lectura=new Scanner(System.in);
      int []vec = new int[3];//0, positivo, negativo
      int sumPos=0, sumNeg=0, numero;
      System.out.println("INTRODUZCA CINCO NUMEROS");
      
      for(int i=0; i<5; i++)
      { 
        numero=Lectura.nextInt();
        if(numero>0)
        {
            sumPos+=numero;
            vec[1]++;
        }
        else if(numero<0)
        {
            sumNeg+=numero;
            vec[2]++;
        }
        else 
            vec[0]++;
      }

      Lectura.close();

      System.out.println("La media de los positivos es: "+ (float)sumPos/vec[1]);
      System.out.println("La media de los negativos es: "+ (float)sumNeg/vec[2]);
      System.out.println("La canitdad de 0s fue es: "+ vec[0]);
  }
}