import javax.swing.*;
public class votoYte{
String a1,b1,c1,d1,e1;
public static void mosha(){
int x1=new Integer(JOptionPane.showInputDialog("Mosha juaj?")).intValue();
if(x1>=18&&x1<110){
votimi();}else{JOptionPane.showMessageDialog(null, "Vetem personat mbi 18 vjec kan te drejt votimi");
JOptionPane.showMessageDialog(null, "Ju lutem shkruani moshen perseri");
mosha();
}
}

public static void votimi(){
String a1="";
JOptionPane.showMessageDialog(null, "Ta keni parasysh se: Kandidati i pare permban numrin rendor 1, Kandidati i dyte numrin rendor 2");
int x2=new Integer(JOptionPane.showInputDialog("Cili eshte kandidati qe deshironi ta votoni")).intValue();
if(x2==1||x2==2)
{
dergimi();
a1=JOptionPane.showInputDialog("Nese deshironi ta mbyllni dritaren shtyp: Exit, nese deshironi te votoni prap shtyp: No");
if(a1.equals("Exit")||a1.equals("exit")||a1.equals("EXIT"))
System.exit(0);
else 
JOptionPane.showMessageDialog(null, "Regjistro nje tjeter");
}
else{votimi();}
mosha();
}
public static void dergimi(){
JOptionPane.showMessageDialog(null, "Ju faleminderit. Vota juaj eshte derguar me sukses");}

public static void main(String []args){
JOptionPane.showMessageDialog(null, "Voto per kandidatin e preferuar");
mosha();
/** \

Punuar nga Rinor Ajeti

*/
}}