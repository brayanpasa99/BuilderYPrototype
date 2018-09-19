
public class DirectorPersonaje {

    private ConstrutorPersonaje ConsPers;

    public void setConstructor(ConstrutorPersonaje constructor) {
        this.ConsPers = constructor;
    }

    public Personaje getPersonaje() {
        return ConsPers.getPersonaje();

    }

    public void construirPersonaje() {
        ConsPers.construirPers();
        ConsPers.construirImgPers();

    }

}
