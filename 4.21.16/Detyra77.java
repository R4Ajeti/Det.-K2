
public class Detyra77{


/** removeDuplicateLetters constructs a string that contains the
* same letters as its argument except that all duplicate letters
* are removed, e.g., for argument, "butterflies", the result is
* "buterflis"
* @param s - the argument string
* @return a string that looks like s but with no duplicates */
   public String removeDuplicateLetters(String s){
      String a="";int x=s.length(); char a2,a3;int i=0;char a1='1';
      while(i<x){
         if(a1==s.charAt(i)){i=i+1;}
         else {a1=s.charAt(i);a=a+a1;i=i+1;}
      
      
      }
   
      return a;}
   public void matricaA(){
      int i=4;
      for(int x=0; x<4; x++){
      
         for(int y=0; y<4; y++){
            if(x>=y){
               System.out.print(x+" "+y+"  ");}
            else{}
         }System.out.println();}}


   public void matricaB(){
      int i=4;int j=0;
      for(int x=0; x<4; x++){
      
         for(int y=3; y>=0; y--){
            if(x<=y){
               System.out.print(x+" "+y+"  ");}
            else{}
         }System.out.println();}}







   public static void main(String[]args){
      Detyra77 hey=new Detyra77();
      System.out.println(hey.removeDuplicateLetters("Butterflies \n"));
      hey.matricaA();
      System.out.println();
      hey.matricaB();
      System.out.println("\n");
   }
}