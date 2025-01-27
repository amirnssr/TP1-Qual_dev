public class Monocoque extends Voilier {

    public Monocoque(String nom, SuivreRoute suivreRoute,String skipper,EnumClasse classe) {
        super(nom,suivreRoute,skipper,classe);

    }


    public String toString() {
        return nom+" est monocoque";
    }
}
