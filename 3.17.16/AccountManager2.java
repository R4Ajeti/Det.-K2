import javax.swing.*;
/** AccountManager2 maintains two bank accounts */
public class AccountManager2
{ 
   public static void main(String[] args)
   { BankReader reader = new BankReader();
   // create the models and their views:
      BankAccount primary_account = new BankAccount(0);
      BankWriter primary_writer = new BankWriter("Primary Account", primary_account,240);
      BankAccount secondary_account = new BankAccount(0);
      BankWriter secondary_writer = new BankWriter("Secondary Account", secondary_account, 740);
   // construct the controller and start it:
   //AccountController controller1 = new AccountController(reader, primary_writer, primary_account);
      AccountController2 controller = new AccountController2(reader, primary_account, primary_writer, secondary_account, secondary_writer);
   //controller. processTransactions();
      String sss = JOptionPane.showInputDialog("Identifikohu!");
      String cs = sss.trim().toUpperCase();
      if (cs.equals("PERSONI A")||cs.equals("A")||cs.equals("PERSONI B")||sss.equals("B"))
      {
         if(cs.equals("PERSONI A")||cs.equals("A"))
         {controller.pArametri("A");primary_writer.iKorniza();controller.processTransactions1();}
         else
         {controller.pArametri("B");secondary_writer.iKorniza();
            controller.processTransactions1();}
      }
      
      else if (cs.equals("BANKIER")||cs.equals("BT"))
      {controller.pArametri("BT");primary_writer.iKorniza();
         secondary_writer.iKorniza();
         controller.processTransactions(); 
      }
      
      else { JOptionPane.showMessageDialog(null,"Gabim ne Identifikim"); 
      }
   
   
   }
}