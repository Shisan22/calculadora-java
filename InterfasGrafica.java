import javax.swing.*;
import java.awt.event.*;

public class InterfasGrafica extends JFrame implements ActionListener{

  private JLabel label1;
  private JTextField respuesta;
  private JButton botonAceptar;
  
  public InterfasGrafica(){
    setLayout(null);
    label1 = new JLabel ("Calculadora de zodiaco");
    label1.setBounds(10,20,300,30);
    add(label1);

    respuesta = new JTextField();
    respuesta.setBounds(120,180,150,20);
    add(respuesta);
    
    botonAceptar = new JButton("Aceptar");
    botonAceptar.setBounds(10,210,100,30);
    add(botonAceptar);
    botonAceptar.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e){
  if(e.getSource() == botonAceptar){
    String texto = respuesta.getText();
    setTitle(texto);
    }
  }
  
  public static void main(String arg[]){
    InterfasGrafica calculadora = new InterfasGrafica();
    calculadora.setBounds(0,0,800,500);
    calculadora.setVisible(true);
    calculadora.setLocationRelativeTo(null);
    calculadora.setResizable(true);
  }
}