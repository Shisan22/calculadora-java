import javax.swing.*;

public class InterfasGrafica extends JFrame{

    private JLabel label1;

public InterfasGrafica(){
  setLayout(null);
  label1 = new JLabel ("Calculadora de zodiaco");
  label1.setBounds(10,20,300,30);
  add(label1);
  }

public static void main(String arg[]){
    InterfasGrafica calculadora = new InterfasGrafica();
    calculadora.setBounds(0,0,800,500);
    calculadora.setVisible(true);
    calculadora.setLocationRelativeTo(null);
    calculadora.setResizable(true);
    
  }
}