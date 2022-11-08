import java.util.*;

public class ConversorCelsiusFahrenheit { 
    public static void main(String[] args) {  
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a temperatura em Celsius que deseja converter: ");

    double temperaturaCelsius = scanner.nextDouble();

    System.out.println("A temperatura em Fahrenheit é: " + calcularFahrenheit(temperaturaCelsius));

    scanner.close();
    }

    public static double calcularFahrenheit (double temperaturaCelsius) {

        final double FATOR_1 = 1.8;
        final double FATOR_2 = 32;

        double fahrenheit = (temperaturaCelsius*FATOR_1) + FATOR_2;

        return fahrenheit;
    }
}

