
public class Celsius {
    private double unidadeMedida;

    public Celsius(double unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public double converterFahrenheit() {
        return Conversor.converterFahrenheit(unidadeMedida);
    }

    public double converterKelvin() {
        return Conversor.converterKelvin(unidadeMedida);
    }
}
