package lab3p2_gabrielosorto;

public class GrassType extends Pokemon {

    private String Ecosistema;
    private int PoderSobrePlantas;

    public GrassType(String NombrePokemon, int NumEntradaPokedex, String Naturaleza, Boolean Capturado, Pokeball Pokebola, String Ecosistema, int PoderSobrePlantas) {
        super(NombrePokemon, NumEntradaPokedex, Naturaleza, Capturado, Pokebola);
        this.Ecosistema = Ecosistema;
        this.PoderSobrePlantas = PoderSobrePlantas;
    }

    public String getEcosistema() {
        return Ecosistema;
    }

    public void setEcosistema(String Ecosistema) {
        this.Ecosistema = Ecosistema;
    }

    public int getPoderSobrePlantas() {
        return PoderSobrePlantas;
    }

    public void setPoderSobrePlantas(int PoderSobrePlantas) {
        this.PoderSobrePlantas = PoderSobrePlantas;
    }

}
