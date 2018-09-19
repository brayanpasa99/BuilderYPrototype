/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Juan Camilo
 */
public class FabricaHumanos implements FabricaAbstracta {

    @Override
    public ArmaAbstracta crearArma() {
        return new ArmaHumanos();
    }

    @Override
    public ArmaduraAbstracta crearArmadura() {
        return new ArmaduraHumanos();
    }


    @Override
    public PersonajeAbstracto crearPersonaje() {
        return new PersonajeHumano();
    }

}
