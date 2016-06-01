import javax.swing.*;
public class PerdorimiSwitchPerNota {
    public static void main(String[] args) {

int nota = new Integer(JOptionPane.showInputDialog("Shkruaj piket")).intValue();
if(nota<50&&nota>0)nota=1;
        String notaString;
        switch (nota) {
            case 100 : case 99 : case 98 :case 97 :case 96 :case 95 :case 94 :case 93 :case 92 :case 91 :
            notaString = "A";
                     break;

            case 90 :case 89 : case 88 :case 87 :case 86 :case 85 : case 84 : case 83 : case 82 :case 81 : 
          
           notaString = "B";
                     break;
            case 80 :case 79 : case 78 : case 77 : case 76 :case 75 : case 74 : case 73 :case 72 : case 71 :  
            notaString = "C";
                     break;
            case 70 :case 69 :case 68 :case 67 : case 66 :case 65 :case 64 :case 63 :case 62 :case 61 :  
            notaString = "D";
                     break;
            case 60 :case 59 :case 58 :case 57 : case 56 : case 55 : case 54 : case 53 : case 52 : case 51 : case 50 : 
            notaString = "E";
                     break;
            case 1 :  //ose nese nuk perdorim if duhet qe te shkruajme te gjitha p.sh case 1: case 2: case 3: ... deri case 49:
                        notaString = "F";
                     break;
            default: notaString = "Gabim ne shenimin e notes";
                     break;
        }
        System.out.println(notaString);
    }
}
/** Rinor Ajeti
2/10/2016
*/