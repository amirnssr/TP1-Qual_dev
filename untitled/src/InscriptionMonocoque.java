/**
 * La classe InscriptionMonocoque représente une inscription spécifique pour un voilier monocoque.
 * Cette classe étend InscriptionVoilier et implémente le pattern Factory Method pour créer des instances
 * de Monocoque ou Multicoque.
 */
public class InscriptionMonocoque extends InscriptionVoilier {

    /**
     * Méthode de fabrique pour créer un voilier en fonction de sa classe.
     *
     * @param nom le nom du voilier
     * @param suivreRoute la stratégie de suivi de route
     * @param nomSkipper le nom du skipper
     * @param enumClasse la classe du voilier (monocoque ou multicoque)
     * @return une instance de Monocoque si la classe est EnumMono, sinon une instance de Multicoque
     */
    @Override
    public Voilier factoryMethod(String nom, SuivreRoute suivreRoute, String nomSkipper, EnumClasse enumClasse) {
        if (enumClasse == EnumClasse.EnumMono) {
            return new Monocoque(nom, suivreRoute, nomSkipper, enumClasse);
        } else {
            return new Multicoque(nom, suivreRoute, nomSkipper, enumClasse);
        }
    }

    /**
     * Enregistre un voilier dans la liste des voiliers inscrits.
     *
     * @param voilier le voilier à enregistrer
     */
    @Override
    public void enregistrement(Voilier voilier) {
        listVoilier.add(voilier);
    }
}
