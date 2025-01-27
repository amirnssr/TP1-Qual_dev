
/**
 * Classe abstraite représentant un armement supplémentaire pour un voilier.
 * Cette classe hérite de la classe Voilier et permet de décorer un voilier déjà existant avec des fonctionnalités supplémentaires.
 **/
public abstract class ArmementSupplementaire extends Voilier {

    /**
     * Le voilier décoré avec des armements supplémentaires.
     **/
    protected Voilier voilierDecore;

    /**
     * Constructeur de la classe ArmementSupplementaire.
     *
     * @param voilierDecore le voilier à décorer avec des armements supplémentaires
     **/
    public ArmementSupplementaire(Voilier voilierDecore) {
        this.voilierDecore = voilierDecore;
    }

    /**
     * Définit la route à suivre pour le voilier décoré.
     *
     * @param suivreRoute la stratégie de suivi de route
     **/
    @Override
    public void setSuivreRoute(SuivreRoute suivreRoute) {
        voilierDecore.setSuivreRoute(suivreRoute);
    }
}
