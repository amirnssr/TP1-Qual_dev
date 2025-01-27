/**
 * La classe Voilier représente un voilier avec ses attributs et ses méthodes.
 */
public class Voilier {
    /**
     * Le nom du voilier.
     */
    String nom;

    /**
     * La stratégie de suivi de route du voilier.
     */
    SuivreRoute suivreRoute;

    /**
     * Le nom du skipper du voilier.
     */
    String nomSkipper;

    /**
     * La classe du voilier.
     */
    EnumClasse classe;

    /**
     * Constructeur de la classe Voilier.
     *
     * @param name le nom du voilier
     * @param suivreRoute la stratégie de suivi de route
     * @param nomSkipper le nom du skipper du voilier
     * @param classe la classe du voilier
     */
    public Voilier(String name, SuivreRoute suivreRoute, String nomSkipper, EnumClasse classe) {
        this.nom = name;
        this.suivreRoute = suivreRoute;
        this.nomSkipper = nomSkipper;
        this.classe = classe;
    }

    /**
     * Constructeur par défaut de la classe Voilier.
     */
    public Voilier() {}

    /**
     * Définit la stratégie de suivi de route pour le voilier.
     *
     * @param sr la stratégie de suivi de route
     */
    public void setSuivreRoute(SuivreRoute sr){
        this.suivreRoute = sr;
    }

    /**
     * Applique la stratégie de suivi de route du voilier.
     */
    public void appliquerSuivreRoute(){
        suivreRoute.suivreRoute();
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères du voilier.
     *
     * @return le nom du voilier
     */
    public String toString() {
        return nom;
    }
}
