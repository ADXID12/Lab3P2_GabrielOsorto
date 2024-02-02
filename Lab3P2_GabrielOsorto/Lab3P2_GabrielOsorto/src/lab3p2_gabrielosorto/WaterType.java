package lab3p2_gabrielosorto;

public class WaterType extends Pokemon {

    private boolean VivirFueraAgua;
    private int RapidezNadar;

    public WaterType(String NombrePokemon, int NumEntradaPokedex, String Naturaleza, Boolean Capturado, Pokeball Pokebola, boolean VivirFueraAgua, int RapidezNadar) {
        super(NombrePokemon, NumEntradaPokedex, Naturaleza, Capturado, Pokebola);
        this.VivirFueraAgua = VivirFueraAgua;
        this.RapidezNadar = RapidezNadar;
    }

    public boolean isVivirFueraAgua() {
        return VivirFueraAgua;
    }

    public void setVivirFueraAgua(boolean VivirFueraAgua) {
        this.VivirFueraAgua = VivirFueraAgua;
    }

    public int getRapidezNadar() {
        return RapidezNadar;
    }

    public void setRapidezNadar(int RapidezNadar) {
        this.RapidezNadar = RapidezNadar;
    }
    

}
