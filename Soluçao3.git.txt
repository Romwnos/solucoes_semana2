import javax.swing.*;
public class Soluçao3{
   public static void main (String [] args){
      int dia;
      int mes;
      int ano;
      
      dia = Integer.parseInt(JOptionPane.showInputDialog("De o dia: "));
      mes = Integer.parseInt(JOptionPane.showInputDialog("De o mes: "));
      ano = Integer.parseInt(JOptionPane.showInputDialog("De o ano: "));
      
      JOptionPane.showMessageDialog(null, dia + "/" + mes + "/" + ano);
      System.exit(0);
   }
}