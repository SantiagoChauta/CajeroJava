/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero;

import MVC.Controlador;
import MVC.Modelo;
import MVC.Vista;

/**
 *
 * @author estudiantes
 */
public class Cajero {
    
    public void launcher(){
        Controlador c= new Controlador(new Modelo(),new Vista());
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
