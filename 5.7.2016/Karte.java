// Fajli Karte.java
/** Karte e modelon nje karte per lojera */
public class Karte
{ // perkufizimet qe dikush mund t'i perdore per ta pershkruar vleren nje karte:
int numri;
/**public static final String GJETHE = "gjethe";
public static final String ZEMER = "zemer";
public static final String RRUSH = "rrush";
public static final String ROMB = "romb";
public static final int PIKE = 1;
public static final int DYSH = 2;
public static final int TRESH = 3;
public static final int KATER = 4;
public static final int PESE = 5;
public static final int GJASHTE = 6;
public static final int SHTATE = 7;
public static final int TETE = 8;
public static final int NENTE = 9;
public static final int DHJETE = 10;
public static final int XHANDAR = 11;
public static final int QIKE = 12;
public static final int MBRET = 13;*/
int j=0;
public static final int [] llojikartave= {1, 2, 3, 4};
public static final String [] llojikartaveEMR={"gjethe", "zemer", "rrush", "romb"};
public static final int [] kartat = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
public static final String [] kartatEMR = {"PIKE", "DYSH", "TRESH", "KATER", "PESE", "GJASHTE", "SHTATE", "TETE", "NENTE", "DHJETE", "Pike", "XHANDAR", "QIKE", "MBRET"};
public static final int MADHESIA_E_NJE_NGJYRE = 13; // sa karta ne nje ngjyre
// Keto jane atributet (vetite) e kartes:
private String ngjyra="";;
private int vlera;
/** Konstruktori Karte e cakton ngjyren dhe vleren.
* @param n - ngjyra
* @param v - vlera */
public Karte(int n, int v)
{ 
while(j<4){
if ( n == llojikartave[j] ) { ngjyra = llojikartaveEMR[j]; }j=j+1;}
//ngjyra = n;
vlera = v;
}
/** merreNgjyren e kthen ngjyren e kartes */
public String merreNgjyren()
{ return ngjyra; }
/** merreVleren e kthen vleren e kartes */
public int merreVleren()
{ return vlera; }
boolean booleantest=true;int i =0;
/** neFjale e afishon ngjyren dhe vleren e kartes me fjale
* @return paraqitjen me fjale (si String) te kartes */
public String neFjale()
{ String s = " me " + ngjyra;
while(i<13){
if ( vlera == kartat[i] ) { s = kartatEMR[i] + s; }
//else{ s = vlera + s; }
i=i+1;}

return vlera+" "+s;
}


}