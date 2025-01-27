

public class Multicoque extends Voilier {


    public Multicoque(String nom, SuivreRoute suivreRoute,String skipper,EnumClasse classe) {
        super(nom,suivreRoute,skipper,classe);
    }


    public String toString() {
        return nom+" est multicoque";
    }
}
