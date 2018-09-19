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
public class ArmaOrcos implements ArmaAbstracta {

    private ImageIcon ImgArmOrcs= new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/ArmaO.png")).getImage());

    @Override
    public ImageIcon ImagenArma() {
        return ImgArmOrcs;
    }

    

}
