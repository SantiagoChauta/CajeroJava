/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import javax.swing.JFrame;

/**
 *
 * @author estudiantes
 */
public class Vista {
    protected JFrame miVentana;
    public Vista(){
        VentanaPrincipal();
    }
    public void VentanaPrincipal(){
        miVentana= new JFrame();
        miVentana.setVisible(true);
        miVentana.setTitle("Cajero");
        miVentana.pack();
        miVentana.setLocationRelativeTo(null);
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
