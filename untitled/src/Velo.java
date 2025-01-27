/**
 * La classe Velo représente un armement supplémentaire pour un voilier, ajoutant un vélo.
 * Cette classe étend ArmementSupplementaire et décore un voilier existant.
 */
public class Velo extends ArmementSupplementaire {

    /**
     * Constructeur de la classe Velo.
     *
     * @param voilierDecore le voilier à décorer avec un vélo
     */
    public Velo(Voilier voilierDecore) {
        super(voilierDecore);
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères de l'objet Velo.
     *
     * @return une chaîne de caractères représentant l'ajout d'un vélo au voilier décoré
     */
    public String toString() {
        return "Ajout de Velo " + voilierDecore.toString();
    }
}
