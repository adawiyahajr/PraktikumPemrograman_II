/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesi2;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Yusup
 */
public class Latihan extends JFrame {
    public Latihan() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel labelInput = new JLabel("Input Nama:");
        labelInput.setBounds(130,40,100,10);
        
        JTextField textField = new JTextField();
        textField.setBounds(130,60,100,30);
        
        JLabel labelNoHp = new JLabel("No Hp:");
        labelNoHp.setBounds(130,40,100,10);
        
        JTextField1 textField = new JTextField1();
        textField.setBounds(130,60,100,30);
        
        JButton button = new JButton("Klik");
        button.setBounds(130,100,100,40);
        
        JTextArea txtOutput = new JTextArea("");
        txtOutput.setBounds(130,150,100,100);
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nama = textField.getText();
                txtOutput.append("Hello "+nama+"\n");
                textField.setText("");
            }
        });
        
        this.add(button);
        this.add(textField);
        this.add(labelInput);
        this.add(txtOutput);
        
        this.setSize(400,500);
        this.setLayout(null);
    }
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Latihan l = new Latihan();
                l.setVisible(true);
            }
        });
    }
}
