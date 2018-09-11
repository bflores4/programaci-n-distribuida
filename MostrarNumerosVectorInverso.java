import java.util.Scanner;
import java.util.Vector;

class MostrarNumerosVectorInverso
{
  public static void main(String[] args)
  {
      Scanner Lectura=new Scanner(System.in);
      int []vec = new int[5];

      int numero;
      System.out.println("INTRODUZCA CINCO NUMEROS");
      
      for(int i=0; i<5; i++)
      { 
        numero=Lectura.nextInt();
        vec[i]=numero;
      }

      System.out.println("INVERSO:");
      for(int i=vec.length-1; i>=0; i--)
        System.out.println(vec[i]);
    
  }
}