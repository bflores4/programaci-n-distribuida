import java.util.Scanner;
import java.util.Vector;

class MetodoBurbuja
{
  public static void main(String[] args)
  {
      Scanner Lectura=new Scanner(System.in);
      int []vec = new int[5];

      int numero, orden=0, aux;
      System.out.println("INTRODUZCA CINCO NUMEROS");
      
      for(int i=0; i<5; i++)
      { 
        numero=Lectura.nextInt();
        vec[i]=numero;
      }
      Lectura.close();
      System.out.println("ORDENANDO...");

      
      for(int i = 0; i < vec.length - 1; i++)
      {
          for(int j = 0; j < vec.length - 1; j++)
          {
              if (vec[j] < vec[j + 1])
              {
                  aux = vec[j+1];
                  vec[j+1] = vec[j];
                  vec[j] = aux;
              }
          }
      }
      
      for(int i=0; i<vec.length; i++)
        System.out.println(vec[i]);
  }
}
      