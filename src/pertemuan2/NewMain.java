/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author ansha
 */
public class NewMain {
    public static void main (String[]args){
        JFrame j = new JFrame ("JFrame Pertamaku");
        
        JLabel username = new JLabel();
        username.setText("Username");
        username.setBounds(50,100,100,30);
        j.add(username);
        
        JLabel password = new JLabel();
        password.setText("Password");
        password.setBounds(50,150,100,30);
        j.add(password);
        
        JTextField usernameTxt = new JTextField();
        usernameTxt.setBounds(150,100,200,30);
        j.add(usernameTxt);
        
        JTextField passwordTxt = new JTextField();
        passwordTxt.setBounds(150,150,200,30);
        j.add(passwordTxt);
        
        JButton loginButton = new JButton();
        loginButton.setText("Login");
        loginButton.setBounds(200,200,100,30);
        j.add(loginButton);
                        
        j.setSize(800,800);
        j.setLayout(null);
        j.setVisible(true);
        
    }
    
}
