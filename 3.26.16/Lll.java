public class Lll
{  
   
   public static void main(String[] args)
   { 
   
   
      FunkisonetMat funksionet = new FunkisonetMat();
      System.out.println("Shuma=" + funksionet.summation(5));
      System.out.println("\nProdhimi=" + funksionet.product(3,6));
      System.out.println("\nFaktorieli=" + funksionet.faktoriel(6));
      System.out.println("\nVlera e sinusit = "+funksionet.sin(Math.PI/9)+"\nVlera e vertet e sinusit= "+Math.sin(Math.PI/9));
      System.out.println("\nVlera = "+funksionet.lcos(Math.PI/9)+"\nVlera e vertet = "+Math.cos(Math.PI/9));
   
   
   }
}