/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.pbo.persegipanjang;
    
import javax.swing.JOptionPane;

/**
 *
 * @author arifs
 */
public class persegiPanjang {
    public static void main(String[] args) {
        int luas, tinggi, lebar;
        
        lebar = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Lebar nya"));
        tinggi = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Tinggi nya"));
        luas = tinggi * lebar;
        JOptionPane.showMessageDialog(null, "Luas nya = "+luas, "Pertanyaan", JOptionPane.WARNING_MESSAGE);   
    }
}
