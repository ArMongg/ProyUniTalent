/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.utp.estructurasdedatos.ejemplo.proybd;

import javax.swing.JFrame;
import vista.PanelRegistro;



/**
 *
 * @author USER
 */
public class Main {

    public static void main(String[] args) {
        
        JFrame ventana = new JFrame("UniTalent");

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(700,500);
        ventana.setLocationRelativeTo(null);

        ventana.setContentPane(new PanelRegistro());

        ventana.setVisible(true);

    }
}
