import javax.swing.*;
public class Soluçao1{
   public static void main (String [] args){
      String palavra1 = JOptionPane.showInputDialog("Escreva a primeira palavra");
      String palavra2 = JOptionPane.showInputDialog("Escreva a segunda palavra");
      String palavra3 = JOptionPane.showInputDialog("Escreva a terceira palavra");
      
      JOptionPane.showMessageDialog(null, palavra3 + " " + palavra2 + " " + palavra1);
      System.exit(0); 
   }
}