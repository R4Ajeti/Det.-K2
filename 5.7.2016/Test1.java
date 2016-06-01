import javax.swing.*;

public class Test1
{
   public static void main(String[] args)
   {int k=0; int [] letrat2= {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};int [] llojiletrat2= {0, 0, 0, 0};
      int q=0;int p = -1;
      int nrilojtarve = new Integer(JOptionPane.showInputDialog("Numri i lojtareve")).intValue(); 
      
      if((52/nrilojtarve)>=5){
         while(k<5*nrilojtarve){
            int b=(int )(Math.random() * 13 + 1);
            int a=(int )(Math.random() * 4 + 1);
            
            //a=a+k%3;
            Karte m = new Karte(a, b);
            
            if(p!=k){p=k; 
               if (p%5==0){q=q+1;System.out.println("\n Lojtari "+q+" ka keto letra: \n");}
               else{}}
         
            if(letrat2[b-1]<4 && llojiletrat2[a-1]<13){
               letrat2[b-1]=letrat2[b-1]+1;
               llojiletrat2[a-1]=llojiletrat2[a-1]+1;
               String ngjyra = m.merreNgjyren();
               int vlera = m.merreVleren();
            //System.out.println("Karta është " + vlera + " - " + ngjyra);
               System.out.println("Karta "+(k+1) +" është " + m.neFjale());}           
            else { k=k-1; }k=k+1;}}
            
            
      else{JOptionPane.showMessageDialog(null, "Numri i lojtareve eshte i pa lejuar! Provoje perseri!");}
   
      int t=0;
      System.out.print("\n"+"\n"+"\n");
      System.out.print("\n"+"Letrat te nevojshme nga pika deri tek mbreti sipas renditjes: \n");
      while(t<13){
      
         int l=letrat2[t];
         System.out.print(" "+l+" ");t=t+1;}t=0;System.out.print("\n"+"\n"+"\n");
         
      System.out.print("\n"+"Lloji i letrat te nevojshme gjethe, zemer, rrush, romb sipas renditjes: \n");
      while(t<4){int l=llojiletrat2[t];
         System.out.print(" "+l+" ");t=t+1;}
   
   }
}