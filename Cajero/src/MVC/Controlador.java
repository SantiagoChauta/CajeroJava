/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author estudiantes
 */
public class Controlador implements ActionListener{
    
   Modelo m;
   Vista v;
    
    public Controlador(Modelo m,Vista v){
        this.v=v;
        this.m=m;
        Escuchar(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void Escuchar(ActionListener a){
        
    }
}
