import javax.swing.*;
import java.awt.event.*;

public class InterfasGrafica extends JFrame implements ActionListener{

  private JLabel label1;
  private JLabel label2;  
  private JTextField respuesta;
  private JButton botonAceptar;
  private JButton botoncerrar;
  
  public InterfasGrafica(){
    setLayout(null);
    label1 = new JLabel ("Calculadora de zodiaco");
    label1.setBounds(10,20,300,30);
    add(label1);

    label2 = new JLabel("ingrese su mes");
    label2.setBounds(10,50,100,30);
    add(label2);
    
    respuesta = new JTextField();
    respuesta.setBounds(120,180,150,20);
    add(respuesta);
    
    botonAceptar = new JButton("Aceptar");
    botonAceptar.setBounds(10,210,100,30);
    add(botonAceptar);
    botonAceptar.addActionListener(this);
    
    botoncerrar = new JButton("cerrar");
    botoncerrar.setBounds(300,270,100,30);
    add(botoncerrar);
    botoncerrar.addActionListener(this);
  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == botonAceptar){
      String texto = respuesta.getText();
      setTitle(texto);
      }
    if(e.getSource() == botoncerrar){
      System.exit(0);
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