
public abstract class  ConstrutorPersonaje {
    
    protected Personaje Pers;
    protected FabricaAbstracta Fabrica;
    protected ArmaAbstracta Arma;
    protected ArmaduraAbstracta Armadura;
    protected PersonajeAbstracto Personaje;
    

    public Personaje getPersonaje() {
        return Pers;
    }
    
    public abstract void construirPers();
    public abstract void construirImgPers();
    
    
}
