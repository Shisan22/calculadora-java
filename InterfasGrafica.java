import javax.swing.*;
import java.awt.event.*;

public class InterfasGrafica extends JFrame implements ActionListener{

  private JLabel label1;
  private JLabel label2;  
  private JTextField mes, dia;
  private JButton botonAceptar;
  private JButton botoncerrar;
  private JLabel signo;

  public InterfasGrafica(){
    setLayout(null);
    label1 = new JLabel ("Calculadora de zodiaco");
    label1.setBounds(10,20,300,30);
    add(label1);

    label2 = new JLabel("ingrese su mes");
    label2.setBounds(10,50,100,30);
    add(label2);
    
    mes = new JTextField();
    mes.setBounds(10,80,40,40);
    add(mes);
    
    dia = new JTextField();
    dia.setBounds(50,80,40,40);
    add(dia);
    
    botonAceptar = new JButton("Aceptar");
    botonAceptar.setBounds(10,140,100,30);
    add(botonAceptar);
    botonAceptar.addActionListener(this);
    
    botoncerrar = new JButton("cerrar");
    botoncerrar.setBounds(300,270,100,30);
    add(botoncerrar);
    botoncerrar.addActionListener(this);

    signo = new JLabel(mes + dia);
    signo.setBounds(10,200,100,30);
    add(signo);
  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == botonAceptar){
      String texto = mes.getText();
      setTitle(texto);
    }
    if(e.getSource() == botonAceptar){
      String texto = dia.getText();
      setTitle(texto);
    }
    if(e.getSource() == botoncerrar){
      System.exit(0);
    }
    if(e.getSource() == botonAceptar){
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