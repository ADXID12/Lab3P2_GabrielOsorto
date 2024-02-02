package lab3p2_gabrielosorto;

public class Pokeball {
private String Color;
private int NumeroSerie;
private int EficienciaAtrapado;

    public Pokeball(String Color, int NumeroSerie, int EficienciaAtrapado) {
        this.Color = Color;
        this.NumeroSerie = NumeroSerie;
        this.EficienciaAtrapado = EficienciaAtrapado;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getNumeroSerie() {
        return NumeroSerie;
    }

    public void setNumeroSerie(int NumeroSerie) {
        this.NumeroSerie = NumeroSerie;
    }

    public int getEficienciaAtrapado() {
        return EficienciaAtrapado;
    }

    public void setEficienciaAtrapado(int EficienciaAtrapado) {
        this.EficienciaAtrapado = EficienciaAtrapado;
    }


}
