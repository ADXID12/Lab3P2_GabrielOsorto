package lab3p2_gabrielosorto;

public class Pokemon {

    private String NombrePokemon;
    private int NumEntradaPokedex;
    private String Naturaleza;
    private Boolean Capturado;
    private Pokeball Pokebola;

    public Pokemon(String NombrePokemon, int NumEntradaPokedex, String Naturaleza, Boolean Capturado, Pokeball Pokebola) {
        this.NombrePokemon = NombrePokemon;
        this.NumEntradaPokedex = NumEntradaPokedex;
        this.Naturaleza = Naturaleza;
        this.Capturado = Capturado;
        this.Pokebola = Pokebola;
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

    public Pokeball getPokebola() {
        return Pokebola;
    }

    public void setPokebola(Pokeball Pokebola) {
        this.Pokebola = Pokebola;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "NombrePokemon=" + NombrePokemon + ", NumSerie=" + NumEntradaPokedex + ", Naturaleza=" + Naturaleza + ", Capturado=" + Capturado + '}';
    }

}
