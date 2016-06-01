import javax.swing.*;
class Vitiibrishte {
   public static void main(String[] args) {
   
      int month = 2;
      int year = new Integer(JOptionPane.showInputDialog("Shkruaj vitin qe deshironi ta kontrolloni se a eshte vit i brisht apo jo")).intValue();
      int numDays = 0;
      String monthString = "";
   
      switch (month) {
         case 1: monthString = "Janar"; 
            numDays = 31;
            break;
         case 3: monthString = "Mars"; 
            numDays = 31;
            break;
         case 5: monthString = "Maj";
         case 7: monthString = "Korrik"; 
            numDays = 31;
            break;
         case 8: monthString = "Gusht";
            numDays = 31;
            break; 
         case 10: monthString = "October";
            numDays = 31;
            break;
         case 12: monthString = "Dhjetor";
            numDays = 31;
            break;
         case 4: monthString = "Prill"; 
            numDays = 30;
            break;
         case 6: monthString = "Qershor";
            numDays = 30;
            break;
         case 9: monthString = "Shtator"; 
            numDays = 30;
            break;
         case 11: monthString = "Nentor";
            numDays = 30;
            break;
         case 2: monthString = "Shkurt";
            if (((year % 4 == 0) && 
                     !(year % 100 == 0))
                     || (year % 400 == 0))
               numDays = 29;
            else
               numDays = 28;
            break;
         default:
            System.out.println("Invalid month.");
            monthString = "???";
            break;
      }
        
      System.out.println(" Muaji  "+monthString+ "  i vitit " + year + " i ka "
                           + numDays + " dite ");
   
      if(month==2&&numDays==29){
         System.out.print("\n Prandaj viti "+ year);}
      
      else{
         System.out.print("\n Prandaj viti "+ year +" nuk");}
         
      if(year<2016) System.out.println(" ka qene vite i brishte");
      else if (year==2016)System.out.println(" eshte vite i brishte");
      else if (year>=2016)System.out.println(" do te jete vite i brishte");
   }
}
/** Rinor Ajeti
3/10/2016
*/