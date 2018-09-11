import java.util.Vector;
class NmasM
{
  public static void main(String[] args)
  {
      int [][] vec = new int[5][5];

      for(int i=0; i<5; i++)
      {
          for(int j=0; j<5; j++)
          {
              vec[i][j]=i+j;
          }
      }

      for(int i=0; i<5; i++)
      {
        System.out.format("%d - %d - %d- %d- %d\n", vec[i][0], vec[i][1], vec[i][2], vec[i][3], vec[i][4]);
      }
  }
}