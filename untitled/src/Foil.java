public class Foil extends ArmementSupplementaire{


    public Foil(Voilier voilierDecore){
        super(voilierDecore);
    }


    public String toString() {
        return "Ajout de Foil " + voilierDecore.toString();
    }
}
