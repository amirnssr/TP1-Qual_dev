import java.util.List;

public abstract class InscriptionVoilier {
    static List<Voilier> listVoilier;

    public abstract Voilier factoryMethod(String nom, SuivreRoute suivreRoute,String nomSkipper,EnumClasse classe);

    void enregistrement(Voilier voilier){
        listVoilier.add(voilier);
    }

    @Override
    public String toString() {
        return listVoilier.toString();
    }

}
