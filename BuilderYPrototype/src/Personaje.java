
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan Camilo
 */
public class Personaje implements Cloneable{
    private ImageIcon ImgArmadura;
    private ImageIcon ImgArma;
    private ImageIcon ImgPersonaje;

    public ImageIcon getImgArmadura() {
        return ImgArmadura;
    }

    public ImageIcon getImgArma() {
        return ImgArma;
    }

    public ImageIcon getImgPersonaje() {
        return ImgPersonaje;
    }

    public void setImgArmadura(ImageIcon ImgArmadura) {
        this.ImgArmadura = ImgArmadura;
    }

    public void setImgArma(ImageIcon ImgArma) {
        this.ImgArma = ImgArma;
    }

    public void setImgPersonaje(ImageIcon ImgPersonaje) {
        this.ImgPersonaje = ImgPersonaje;
    }
    
    @Override
    public Personaje clone() {
        Personaje clonedPers = null;
        try {
            clonedPers = (Personaje) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }	
        return clonedPers;
    } 
    
    
}
