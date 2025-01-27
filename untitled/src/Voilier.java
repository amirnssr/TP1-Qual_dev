public class Voilier {
    String nom;
    SuivreRoute suivreRoute;
    String nomSkipper;
    EnumClasse classe;

    public Voilier(String name, SuivreRoute suivreRoute,String nomSkipper,EnumClasse classe) {
        this.nom = name;
        this.suivreRoute = suivreRoute;
        this.nomSkipper = nomSkipper;
        this.classe = classe;
    }

    public Voilier() {}

    public void setSuivreRoute(SuivreRoute sr){
        this.suivreRoute = sr;
    }

    public void appliquerSuivreRoute(){
        suivreRoute.suivreRoute();
    }
    public String toString() {
        return nom;
    }


}
