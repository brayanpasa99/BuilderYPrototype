
public abstract class  ConstrutorPersonaje {
    
    protected Personaje Pers;
    protected FabricaAdstracta Fabrica;
    protected ArmaAdstracta Arma;
    protected ArmaduraAdstracta Armadura;
    protected PersonajeAdstracto Personaje;
    

    public Personaje getPersonaje() {
        return Pers;
    }
    
    public abstract void construirPers();
    public abstract void construirImgPers();
    
    
}
