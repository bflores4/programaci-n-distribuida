import java.util.Vector;
import java.util.Random;
class Matrices3X3
{
  public static void main(String[] args)
  {
      int [][] matriz1 = new int[3][3];
      int [][] matriz2 = new int[3][3];
      int [][] suma = new int[3][3];
      Random random = new Random(System.currentTimeMillis());
     // int n = random.nextInt(10);

      for(int i=0; i<3; i++)
      {
          for(int j=0; j<3; j++)
          {
            matriz1[i][j]=random.nextInt(10);
            matriz2[i][j]=random.nextInt(10);
          }
      }

      System.out.println("Matriz 1");
      for(int i=0; i<3; i++)
      {
        System.out.format("%d - %d - %d\n", matriz1[i][0], matriz1[i][1], matriz1[i][2]);
      }

      System.out.println("Matriz 2");
      for(int i=0; i<3; i++)
      {
        System.out.format("%d - %d - %d\n", matriz2[i][0], matriz2[i][1], matriz2[i][2]);
      }

      System.out.println("Suma de matrices");
      for(int i=0; i<3; i++)
      {
          for(int j=0; j<3; j++)
          {
              suma[i][j]=matriz1[i][j] + matriz2[i][j];
          }
      }

      for(int i=0; i<3; i++)
      {
        System.out.format("%d - %d - %d\n", suma[i][0], suma[i][1], suma[i][2]);
      }
  }
}