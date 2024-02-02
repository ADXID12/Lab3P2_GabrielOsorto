package lab3p2_gabrielosorto;

public class FireType extends Pokemon {

    private int PotenciaLlamas;

    public FireType(String NombrePokemon, int NumEntradaPokedex, String Naturaleza, Boolean Capturado, Pokeball Pokebola, int PotenciaLlamas) {
        super(NombrePokemon, NumEntradaPokedex, Naturaleza, Capturado, Pokebola);
        this.PotenciaLlamas = PotenciaLlamas;
    }

    public int getPotenciaLlamas() {
        return PotenciaLlamas;
    }

    public void setPotenciaLlamas(int PotenciaLlamas) {
        this.PotenciaLlamas = PotenciaLlamas;
    }

}
