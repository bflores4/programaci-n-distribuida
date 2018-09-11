import java.util.Vector;
import java.util.Random;
class Matriz10x10
{
  public static void main(String[] args)
  {
      int [][] matriz = new int[11][11];
      Random random = new Random(System.currentTimeMillis());

      for(int i=0; i<10; i++)
      {
          for(int j=0; j<10; j++)
          {
            matriz[i][j]=random.nextInt(10);
          }
      }

      //suma columnas
      int suma=0;
      for(int columna=0; columna<10; columna++)
      {
          int renglon=0;
          for(; renglon<10; renglon++)
          {
              suma+=matriz[columna][renglon];
          }
           matriz[columna][renglon+1]=suma;
           suma=0;
      }
      //suma de renglones
      suma=0;
      for(int renglon=0; renglon<10; renglon++)
      {
          int columna=0;
          for(; columna<10; columna++)
          {
            suma+=matriz[columna][renglon];
          }
           matriz[columna+1][renglon]=suma;
           suma=0;
      }

      for(int i=0; i<10; i++)
      {
        System.out.format("%d - %d - %d - %d - %d- %d - %d- %d - %d- %d\n"
                            , matriz[i][0], matriz[i][1], matriz[i][2], matriz[i][3], matriz[i][4], matriz[i][5]
                            , matriz[i][6], matriz[i][7], matriz[i][8], matriz[i][9], matriz[i][10]);
      }
  }
}