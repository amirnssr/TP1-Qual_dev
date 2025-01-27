import java.util.List;

/**
 * La classe abstraite InscriptionVoilier représente le processus d'inscription d'un voilier.
 * Elle définit une méthode de fabrique abstraite pour créer des instances de Voilier et
 * une méthode pour enregistrer les voiliers.
 */
public abstract class InscriptionVoilier {
    /**
     * La liste des voiliers inscrits.
     */
    static List<Voilier> listVoilier;

    /**
     * Méthode de fabrique abstraite pour créer un voilier.
     *
     * @param nom le nom du voilier
     * @param suivreRoute la stratégie de suivi de route
     * @param nomSkipper le nom du skipper
     * @param classe la classe du voilier
     * @return une instance de Voilier
     */
    public abstract Voilier factoryMethod(String nom, SuivreRoute suivreRoute, String nomSkipper, EnumClasse classe);

    /**
     * Enregistre un voilier dans la liste des voiliers inscrits.
     *
     * @param voilier le voilier à enregistrer
     */
    void enregistrement(Voilier voilier) {
        listVoilier.add(voilier);
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères de la liste des voiliers inscrits.
     *
     * @return une chaîne de caractères représentant la liste des voiliers inscrits
     */
    @Override
    public String toString() {
        return listVoilier.toString();
    }
}
