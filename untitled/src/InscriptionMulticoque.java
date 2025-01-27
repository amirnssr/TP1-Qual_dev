public class InscriptionMulticoque extends InscriptionVoilier {


    @Override
    public Voilier factoryMethod(String nom, SuivreRoute suivreRoute,String nomSkipper,EnumClasse enumClasse ){
        return getVoilier(nom, suivreRoute, nomSkipper, enumClasse);
    }

    static Voilier getVoilier(String nom, SuivreRoute suivreRoute, String nomSkipper, EnumClasse enumClasse) {
        if (enumClasse == EnumClasse.EnumMono){
            return new Monocoque(nom,suivreRoute,nomSkipper,enumClasse);
        }
        else {
            return new Multicoque(nom,suivreRoute,nomSkipper,enumClasse);
        }



    }

    @Override
    public void enregistrement(Voilier voilier){
        listVoilier.add(voilier);
    }
}
