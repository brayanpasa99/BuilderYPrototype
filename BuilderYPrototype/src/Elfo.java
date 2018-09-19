/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan Camilo
 */
public class Elfo extends ConstrutorPersonaje {

    @Override
    public void construirPers() {
        Pers = new Personaje();
        Fabrica = new FabricaElfos();
        Arma = Fabrica.crearArma();
        Armadura = Fabrica.crearArmadura();
        Personaje = Fabrica.crearPersonaje();
    }

    @Override
    public void construirImgPers() {
        Pers.setImgArma(Arma.ImagenArma());
        Pers.setImgArmadura(Armadura.ImagenArmadura());
        Pers.setImgPersonaje(Personaje.ImagenPersonaje());
    }

}
