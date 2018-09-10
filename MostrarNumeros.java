import java.util.Scanner;

class MostrarNumeros
{
	public static void main(String[] args)
	{
		Scanner T = new Scanner(System.in);

		int a, b, suma, resta, modulo, opcion, repetir=0;
		float division;
		
		do{
			System.out.println("INGRESA DOS NUMEROS: ");
			a=T.nextInt();
			b=T.nextInt();

			System.out.println("1 - SUMA \n2 - RESTA\n 3 - DIVISION");
			System.out.println("QUE OPERACION DESEA HACER?(INGRESE EL NUMERO DE OPCION");
			opcion = T.nextInt();

			switch(opcion)
			{
				case 1: suma = a+b;
					System.out.println("LA SUMA ES: " + suma); break;
				case 2: resta = a-b;
					System.out.println("LA RESTA ES: " + resta); break;
				case 3: modulo = a%b; division = a/b;
					System.out.println("LA DIVISION ES: " + division + "\nEL RESIDUO ES: " + modulo); break;
			}

			System.out.println("DESEA REALIZAR OTRA OPERACION? (SI = 1    NO = 0");
			repetir = T.nextInt();
	  }
		while(repetir != 0);
	}
}
