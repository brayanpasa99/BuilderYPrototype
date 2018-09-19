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
public class ArmaElfos implements ArmaAdstracta {

    private ImageIcon ImgArmElf= new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/ArmaE.png")).getImage());
    
    @Override
    public ImageIcon ImagenArma() {
        return ImgArmElf;
    }

    

}
