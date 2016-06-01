public class FunkisonetMat{
/** Shuma e serise*/
   public int summation(int i){
      int s=0;
      int n=0;
   
      while(n<=i){
         s+=n;
         n=n+1;
      }
      return s;
   }


   public double product(int b,int b1)
   {
      double produkt=1;
   
      while(b<=b1){
      
         produkt = produkt * b;
         b=b+1;
      }
      return produkt;
   }
   
   
   public long faktoriel(int k){
      int j=1;
      long s2=1;
      
      while(j<=k){
         s2=s2*j;      
         j=j+1;
      } 
      return s2;
   
   } 


/** sine calculates the sine value of its argument, using the formula
* sin(x) = x - (x^3/3!) + (x^5/5!) - (x^7/7!) + ... - (x^n/19!)
* @param x - the value, in radians, whose sine is desired
* (i.e., sine(0)=0, sine(pi/2)=1, sine(pi)=0, sine(3pi/2)=-1, etc.)
* @return the sine as calculated by the formula */

   
   public double sin(double x){
   
        
      double sin;
      sin = x;
      int i=0,j=1;
      i=i+3;
     
      while (i<=20)
      {
         if (j%2==0)
         {
            sin=sin + Math.pow(x,i)/faktoriel(i);
            i=i+2;
            j=j+1;
         }
         else
         {
            sin=sin - Math.pow(x,i)/faktoriel(i);
            i=i+2;
            j=j+1;
         }}  
      return sin;
   }

/** cosine calculates the cosine value of its parameter, using the formula
* cosin(x) = 1 - (x^2/2!) + (x^4/4!) - (x^6/6!) + ... - (x^20/20!)
* @param x - the value, in radians, whose cosine is desired
* @return the cosine as calculated by the formula */
   public double lcos(double y){
     
      double cos=1;
      int i=0,j=1;
      i=i+2;
     
      while (i<=20)
      {
         if (j%2==0)
         {
            cos=cos + Math.pow(y,i)/faktoriel(i);
            i=i+2;
            j=j+1;
         }
         else
         {
            cos=cos - Math.pow(y,i)/faktoriel(i);
            i=i+2;
            j=j+1;
         }}   
      return cos;
   }


}