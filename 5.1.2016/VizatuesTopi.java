// Fajli VizatuesTopi.java
import java.awt.*;
/** VizatuesTopi e paraqet ne ekran nje top levizes */
public class VizatuesTopi
{ private TopLevizes topi; // objekti top i paraqitur (adresa e vet)
private Color ngjyra_e_topit;
/** Konstruktori VizatuesTopi
* @param x - topi qe do te paraqitet
* @param n - ngjyra e tij */

/** vizato e vizaton topin ne pamje (ekran)
* @param g - penda grafike e perdorur per ta vizatuar topin */

/**
int b4=0; int b5=0; int a=-50; int b=-50;
b4=a;
b5=b;
if(a<b4){ if(b4==d){a=b;}}
else{}

if(b==b5){
if(b5<e){b=e;}}
else{}*/
//int x_posnew= a;int y_posnew= b;
public void vizato(Graphics g)
{ 

g.setColor(ngjyra_e_topit);
int rrezja = topi.rrezjaE();
int a=topi.xPozita() - rrezja; 
int b=topi.yPozita() - rrezja;
int c=rrezja * 2;
int d=a+(c/2);
int e=b+(c/2);
g.fillOval(a, b, c, c);
}

public VizatuesTopi(TopLevizes x, Color n)
{ topi = x;
ngjyra_e_topit = n;

}
}