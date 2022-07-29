import calculo.InterpretadorExpressao;
import calculo.InterpretadorExpressoesAritmeticas;

public class Conversor {

    public static String formulaFahrenheit = "celsius * 9 / 5 + 32";
    public static String formulaKelvin = "celsius + 273.15";

    public static double converterFahrenheit(double unidadeMedida) {
        String expressao;
        expressao = formulaFahrenheit.replace("celsius", Double.toString(unidadeMedida));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }

    public static double converterKelvin(double unidadeMedida) {
        String expressao;
        expressao = formulaKelvin.replace("celsius", Double.toString(unidadeMedida));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}

