import java.util.Scanner;
import java.util.Scanner;

class DobleTripeN
{
    public static void main(String[]args)
    {
        Scanner Lectura = new Scanner(System.in);
        int n;

        System.out.println("INGRESA UN NUMERO: ");
        n= Lectura.nextInt();

        System.out.println("Doble: " + n*2 +"\nTripe: " + n*3);
    }
}