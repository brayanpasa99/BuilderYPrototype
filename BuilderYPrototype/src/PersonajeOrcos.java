/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.ImageIcon;

/**
 *
 * @author Juan Camilo
 */
public class PersonajeOrcos implements PersonajeAdstracto {

    private ImageIcon ImgPerOrcs= new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/PersonajeO.png")).getImage());

    @Override
    public ImageIcon ImagenPersonaje() {
        return ImgPerOrcs;
    }

    

}
