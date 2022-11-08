public class Conversao {

    public static void menuConversao() {
        System.out.println("Escolha a unidade de medida para qual deseja converter: ");
        System.out.println("1 - Kelvin");
        System.out.println("2 - Fahrenheit");
        System.out.println("3 - Rankine");
        System.out.println("4 - Réaumur");
    }
    
    public static double converterParaKelvin(double temperaturaCelsius) {
        double temperaturaKelvin = temperaturaCelsius + 273.15;
        return temperaturaKelvin;
        
    }

    public static double converterParaFahrenheit(double temperaturaCelsius) {
        double temperaturaFahrenheit = temperaturaCelsius*1.8 + 32;
        return temperaturaFahrenheit;
        
    }

    public static double converterParaRankine(double temperaturaCelsius) {
        double temperaturaRankine = temperaturaCelsius*1.8 + 32 + 459.67;
        return temperaturaRankine;
        
    }

    public static double converterParaReaumur(double temperaturaCelsius) {
        double temperaturaReaumur = temperaturaCelsius*0.8;
        return temperaturaReaumur;
        
    }
}
