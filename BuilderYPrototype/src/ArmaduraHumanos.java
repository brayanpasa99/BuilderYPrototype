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
public class ArmaduraHumanos implements ArmaduraAdstracta {

    private ImageIcon ImgArmaduraHum= new ImageIcon(new ImageIcon(getClass().getResource("/imagenes/ArmaduraH.png")).getImage());

    @Override
    public ImageIcon ImagenArmadura() {
        return ImgArmaduraHum;
    }

    

}
