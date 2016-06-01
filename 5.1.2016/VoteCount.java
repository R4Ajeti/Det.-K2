import javax.swing.*;

public class VoteCount
{ public static void main(String[] args)
{ int num_candidates = 4; 
int[] votes = new int[num_candidates]; 

boolean processing = true;
while ( processing )

{ int v = new Integer(JOptionPane.showInputDialog
("Vote for (0,1,2,3):")).intValue();
if ( v >= 0 && v < votes.length ) 
{ votes[v] = votes[v] + 1; }
else { processing = false; } 
}

for ( int i = 0; i != votes.length; i = i + 1 )

{ System.out.println("Candidate" + i + " has " + votes[i] + " votes"); }
}
}