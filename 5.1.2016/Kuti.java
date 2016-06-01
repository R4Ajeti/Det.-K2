// Fajli Kuti.java
/** Kuti e modelon nje kuti ne te cilen jetojne objektet levizese */
public class Kuti
{ private int madhesia_e_kutise,m1;
/** Konstruktori Kuti e nderton kutine
* param madhesia - madhesia e kutise */
public Kuti(int madhesia)
{ madhesia_e_kutise = madhesia;}
/** neKontaktHorizontal pergjigjjet:
* a ka kontaktuar pozita momentale ndonje mur horizontal?
* @param x_pozita - pozita qe testohet
* @return (kthen) true, nese x_pozita eshte baraz ose i kalon pozitat
* e mureve horizontale; perndryshe return (kthen) false */
public boolean neKontaktHorizontal(int x_pozita)
{ return (x_pozita <= 5) || (x_pozita >= (madhesia_e_kutise-5)); }
/** neKontaktVertikal pergjigjet: a ka kontaktuar pozita ndonje mur vertikal
* @param y_pozita - pozita e testuar
* return (kthen) true, nese y_pozita eshte baraz ose i tejkalon pozitat
* e mureve vertikale; perndryshe, return (kthen) false */
public boolean neKontaktVertikal(int y_pozita)
{ return (y_pozita <= 5) || (y_pozita >= (madhesia_e_kutise-5)); }
//{ return ((25 <=y_pozita) && (y_pozita <=30)) ||(y_pozita <= 5) || (y_pozita >= (madhesia_e_kutise-5)); }

public boolean neKH(int x_pozita)
{ return (x_pozita >=93 ) && (x_pozita <= 107); }

public boolean neKV(int y_pozita)
{ return (y_pozita >= 65) && (y_pozita <= 115); }
/**

public boolean neKH(int x_pozita)
{ return ((2.0)*(madhesia_e_kutise-5)/8)>=x_pozita && (x_pozita <= (6.0)*(madhesia_e_kutise-5)/8); }

public boolean neKV(int y_pozita)
{ return ((2.0)*(madhesia_e_kutise-5)/8)>=y_pozita && (y_pozita <= (6.0)*(madhesia_e_kutise-5)/8); }
*/
/** madhesiaE e kthen madhesine e kutise */
public int madhesiaE()
{ return madhesia_e_kutise; }
}