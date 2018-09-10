import java.util.Scanner;

class SueldoMaximo
{
  public static void main(String[] args)
  {
      Scanner Lectura = new Scanner(System.in);
      int mayor=0, numero, sueldos;
      
      System.out.println("Ingrese el numero de sueldos: ");
      sueldos = Lectura.nextInt();

      System.out.println("Ingrese los sueldos: ");
      mayor=Lectura.nextInt();

      for(int i=sueldos-1; i>0; i--)
      {
            numero = Lectura.nextInt();
            if(numero > mayor)
                mayor = numero;
      }
      System.out.println("EL sueldo mayor es de: " + mayor);
  }
}