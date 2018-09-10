import java.util.Scanner;

class LeerNombre
{
  public static void main(String[] args)
  {
    Scanner Lectura = new Scanner(System.in);
    String nombre;

    System.out.println("Escribe tu nombre: ");
    nombre = Lectura.nextLine();

    System.out.println("Buenos dias " + nombre);
  }
}
