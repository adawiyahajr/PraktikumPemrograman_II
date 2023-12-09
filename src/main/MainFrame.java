/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import jenis_member.JenisMemberFrame;
import member.MemberFrame;
import dao.*;

/**
 *
 * @author adawiyahajr
 */
public class MainFrame extends JFrame {
    private JenisMemberFrame jenisMemberFrame;
    private MemberFrame memberFrame;
    private JButton buttonJenisMember;  // corrected variable name
    private JButton buttonMember;
    private JenisMemberDao jenisMemberDao;
    private MemberDao memberDao;
    
    public MainFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 500);
        
        this.jenisMemberDao = new JenisMemberDao();
        this.memberDao = new MemberDao();
        
        this.jenisMemberFrame = new JenisMemberFrame(jenisMemberDao);
        this.memberFrame = new MemberFrame(memberDao, jenisMemberDao);
        
        this.setLayout(new FlowLayout());
        MainButtonActionListener actionListener = new MainButtonActionListener(this);
        
        this.buttonJenisMember = new JButton("Jenis member: ");  // corrected variable name
        this.buttonMember = new JButton("Button");
        
        this.buttonJenisMember.addActionListener(actionListener);
        this.buttonMember.addActionListener(actionListener);
        
        this.add(buttonJenisMember);
        this.add(buttonMember);
    }
    
    // JButton untuk jenis member
    public JButton getButtonJenisMember() {
        return buttonJenisMember;
    }
    
    // JButtn untuk member
    public JButton getButtonMember() {
        return buttonMember;
    }
    
    // menampilkan frame jenis member
    public void showJenisMemberFrame() {
        if (jenisMemberFrame == null) {
            jenisMemberFrame = new JenisMemberFrame(jenisMemberDao);
        }
        jenisMemberFrame.setVisible(true);
    }
    
    // menampilkan frame member
    public void showMemberFrame() {  // corrected method declaration
        if (memberFrame == null) {
            memberFrame = new MemberFrame(memberDao, jenisMemberDao);
        }
        memberFrame.populateComboJenis();
        memberFrame.setVisible(true);
    }
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainFrame f = new MainFrame();
                f.setVisible(true);
            }
        });
    }
}