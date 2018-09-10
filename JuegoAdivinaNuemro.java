import java.util.Random;
import java.util.Scanner;

class JuegoAdivinaNuemro
{
  public static void main(String[] args)
  {
      Scanner Lectura = new Scanner(System.in);
      int n;

      Random random = new Random(System.currentTimeMillis());
      int meta = random.nextInt(1001);//entre 0 y 1000

      System.out.println("Ingrese un numero:");
      n = Lectura.nextInt();
      
      while(n != meta)
      {
        if(n < meta)
            System.out.println("El numero que ingresaste es MENOR");
        else
            System.out.println("El numero que ingresaste es MAYOR");
        
        System.out.println("Ingrese otro numero:");
        n = Lectura.nextInt();
      }
     
        System.out.println("El numero que ingresaste es el CORRECTO");
  }
}