import javax.swing.*;
import java.util.*;
class NumratthjeshteArrays
{
   public static void main(String[] args)
   {		
      int countst=0;
      int i =0;
      int num =0;
   
      String  numratthjesht = "";
      System.out.println("Shkruaj Vleren e n-it:");
      int n = new Integer(JOptionPane.showInputDialog("Shkruaj numrin ")).intValue();
      String [] numratthjeshtN = new String[n];
      System.out.println("Ne Numrat Natyror nga 1 deri ne "+ n +" kemi keta nr te thjeshte :");
            for (i = 1; i <= n; i++)  	   
      { 		 		  
         int counter=0; 		  
         for(num =i; num>=1; num--)
         {
            if(i%num==0)
            {		counter = counter + 1;	    }
         }
         if (counter ==2)
         {
            numratthjeshtN[countst]=""+i;
            numratthjesht = numratthjesht + i + "  ";countst=countst+1;
            System.out.print(numratthjeshtN[countst-1]+"  ");
         }	
      }	
      
      //System.out.println(numratthjesht);
      
      ;
   }
}