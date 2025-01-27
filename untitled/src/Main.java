public class Main {
    public static void main(String[] args) {

        InscriptionMulticoque inscriptionMulticoque = new InscriptionMulticoque();
        InscriptionMonocoque inscriptionMonocoque = new InscriptionMonocoque();


        Voilier v1 = inscriptionMonocoque.factoryMethod("el monocoque", new RouteAlize(), "x", EnumClasse.EnumMono);
        Voilier v2 = inscriptionMulticoque.factoryMethod("titanic", new RouteOrthodromie(), "monsieur y", EnumClasse.EnumMulti);


        inscriptionMonocoque.enregistrement(v1);
        inscriptionMulticoque.enregistrement(v2);

        System.out.println(InscriptionMonocoque.listVoilier);

    }
}