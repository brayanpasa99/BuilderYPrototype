
public class PersonajeCreator {

    private Personaje personaje;

    public PersonajeCreator(String TypePers) {
        DirectorPersonaje Dir = new DirectorPersonaje();
        
        switch (TypePers) {
            case "Elfo":
                
                Dir.setConstructor(new Elfo());
                break;
            case "Humano":
                
                Dir.setConstructor(new Humano());
                break;
            case "Orco":
                
                Dir.setConstructor(new Orco());
                break;
            default:
                break;
        }
        
        Dir.construirPersonaje();
        personaje=Dir.getPersonaje();
    }
    
    public Personaje retrievePersonaje() {
        return (Personaje) personaje.clone();
    } 

}
