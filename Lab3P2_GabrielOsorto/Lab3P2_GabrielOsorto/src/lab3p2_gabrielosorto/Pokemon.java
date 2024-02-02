package lab3p2_gabrielosorto;

public class Pokemon {

    String NombrePokemon;
    int NumEntradaPokedex;
    String Naturaleza;
    Boolean Capturado;

    public Pokemon(String NombrePokemon, int NumEntradaPokedex, String Naturaleza, Boolean Capturado) {
        this.NombrePokemon = NombrePokemon;
        this.NumEntradaPokedex = NumEntradaPokedex;
        this.Naturaleza = Naturaleza;
        this.Capturado = Capturado;
    }

    public String getNombrePokemon() {
        return NombrePokemon;
    }

    public void setNombrePokemon(String NombrePokemon) {
        this.NombrePokemon = NombrePokemon;
    }

    public int getNumEntradaPokedex() {
        return NumEntradaPokedex;
    }

    public void setNumEntradaPokedex(int NumSerie) {
        this.NumEntradaPokedex = NumSerie;
    }

    public String getNaturaleza() {
        return Naturaleza;
    }

    public void setNaturaleza(String Naturaleza) {
        this.Naturaleza = Naturaleza;
    }

    public Boolean getCapturado() {
        return Capturado;
    }

    public void setCapturado(Boolean Capturado) {
        this.Capturado = Capturado;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "NombrePokemon=" + NombrePokemon + ", NumSerie=" + NumEntradaPokedex + ", Naturaleza=" + Naturaleza + ", Capturado=" + Capturado + '}';
    }

}
