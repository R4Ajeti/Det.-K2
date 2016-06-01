
public class SortimiString{

   public String alphabetize1(String s)
   { String answer="";String s1=s;int h=0;String s2="";int j=0;int x1=s1.length();
      while(j<x1){int i =0;int k=0;int x=s.length();char c='ë';s2="";
         while(i<x){
            if((int)c>(int)s.charAt(i))
            {c=s.charAt(i);h=i;}
            i=i+1;
            }
         
        while(k<x){
         
         if(k==h){s2=s2;}
         else{
         s2=s2+s.charAt(k);}
         
         k=k+1;}
         s=s2;
         j=j+1;
         answer=answer+c;}
           
      return answer;
   }
   public static void main(String[]args){
      SortimiString hey=new SortimiString();
      
      System.out.println("\n"+hey.alphabetize1("Simplest can change the world"));
   }
}