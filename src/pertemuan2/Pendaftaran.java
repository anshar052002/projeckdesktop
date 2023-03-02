/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author ansha
 */
public class Pendaftaran {
    public static void main (String[]args){
        JFrame j = new JFrame ("Pendaftaran ");
        
        JLabel nik = new JLabel();
        nik.setText("NIK");
        nik.setBounds(50,50,100,30);
        j.add(nik);
        
        JTextField nikTxt = new JTextField();
        nikTxt.setBounds(150,50,200,30);
        j.add(nikTxt);
        
        JLabel name = new JLabel();
        name.setText("Nama");
        name.setBounds(50,100,100,30);
        j.add(name);
        
        JTextField nameTxt = new JTextField();
        nameTxt.setBounds(150,100,200,30);
        j.add(nameTxt);
        
        JLabel email = new JLabel();
        email.setText("Email");
        email.setBounds(50,150,100,30);
        j.add(email);
        
        JTextField emailTxt = new JTextField();
        emailTxt.setBounds(150,150,200,30);
        j.add(emailTxt);
        
        JLabel tptlahir = new JLabel();
        tptlahir.setText("Tempat Lahir");
        tptlahir.setBounds(50,200,100,30);
        j.add( tptlahir);
        
        JTextField tptlahirTxt = new JTextField();
        tptlahirTxt.setBounds(150,200,200,30);
        j.add(tptlahirTxt);
        
        JLabel tgllahir = new JLabel();
        tgllahir.setText("Tanggal Lahir");
        tgllahir.setBounds(50,250,100,30);
        j.add( tgllahir);
        
        JTextField tgllahirTxt = new JTextField();
        tgllahirTxt.setBounds(150,250,200,30);
        j.add(tgllahirTxt);
        
         JLabel instansi = new JLabel();
        instansi.setText("Instansi");
        instansi.setBounds(50,300,100,30);
        j.add( instansi);
        
        String[] iinstansi ={"","KA","KY","BPK","BMKG"};
        JComboBox cbInstansi = new JComboBox(iinstansi);
        cbInstansi.setBounds(150,300,200,30);
        j.add(cbInstansi);
        
        JLabel nohp = new JLabel();
        nohp.setText("Nomor HP");
        nohp.setBounds(50,350,100,30);
        j.add(nohp);
        
        JTextField nohpTxt = new JTextField();
        nohpTxt.setBounds(150,350,200,30);
        j.add(nohpTxt);
        
        JButton daftarButton = new JButton();
        daftarButton.setText("Daftar");
        daftarButton.setBounds(200,400,100,30);
        j.add(daftarButton);
        
        j.setSize(800,800);
        j.setLayout(null);
        j.setVisible(true);
    }
}
