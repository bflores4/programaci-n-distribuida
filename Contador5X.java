import java.util.Scanner;

import com.sun.glass.ui.Pixels.Format;

class Contador5X
{
  public static void main(String[] args)
  {
      String numero ="";
      String auxiliar="";
      
      for(int n5=0; n5<10; n5++)
      { 
        for(int n4=0; n4<10; n4++)
        {
            for(int n3=0; n3<10; n3++)
            {
                for(int n2=0; n2<10; n2++)
                {
                    for(int n1=0; n1<10; n1++)
                    {
                        if(n5 == 3)
                            numero+= "E";
                        else
                            numero+=String.valueOf(n5);
                        
                        if(n4 == 3)
                            numero+= "E";
                        else
                            numero+=String.valueOf(n4);
                        
                        if(n3 == 3)
                            numero+= "E";
                        else
                            numero+=String.valueOf(n3);

                        if(n2 == 3)
                            numero+= "E";
                        else
                            numero+=String.valueOf(n2);
                        
                        if(n1 == 3)
                            numero+= "E";
                        else
                            numero+=String.valueOf(n1);
                       
                        System.out.println(numero);
                        numero="";
                    }
            
                }
            }
        }
      }
  }
}