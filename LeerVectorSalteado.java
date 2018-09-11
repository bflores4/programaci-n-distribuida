import java.util.Scanner;
import java.util.Vector;

class LeerVectorSalteado
{
  public static void main(String[] args)
  {
      Scanner Lectura=new Scanner(System.in);
      int []vec = new int[10];

      int numero;
      System.out.println("INTRODUZCA DIEZ NUMEROS");
      
      for(int i=0; i<10; i++)
      { 
        numero=Lectura.nextInt();
        vec[i]=numero;
      }
      Lectura.close();

      for(int i=0, j=vec.length-1; i<vec.length/2;i++)
      {
        System.out.println(vec[i]+"\n"+vec[j-i]);
      }
  }
}
