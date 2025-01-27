public class Velo extends ArmementSupplementaire{



    public Velo(Voilier voilierDecore){
        super(voilierDecore);

    }


    public String toString() {
        return "Ajout de Velo " + voilierDecore.toString();
    }
}
