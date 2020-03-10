import javax.swing.*;
public class Soluçao4{
   public static void main (String [] args){
      
      double peso;
      
      peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso: "));
      
      JOptionPane.showMessageDialog(null, "O peso informado foi " + peso + "Kg");
      System.exit(0);
   }
}