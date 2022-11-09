import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Quantas temperaturas deseja transformar? ");
            int qtdTemperatura = scanner.nextInt();

            double[] tempEntrada = new double[qtdTemperatura];
            double[] tempConvertido = new double[qtdTemperatura];

            for (int i = 0; i < qtdTemperatura; i++) {
                System.out.print("Digite a temperatura: ");
                tempEntrada[i] = scanner.nextDouble();
            }
            

            System.out.println("\nEscolha a unidade de medida de entrada:");
            menuUnidadesMedidas();
            int unidadeEntrada = scanner.nextInt();

            String nomeUnidEntrada = "";

            switch (unidadeEntrada) {
                case 1:
                nomeUnidEntrada = "Celsius";
                break;

                case 2:
                nomeUnidEntrada = "Kelvin";
                break;

                case 3:
                nomeUnidEntrada = "Fahrenheit";
                break;
            }

            System.out.println("\nEscolha a unidade de medida de saída:");
            menuUnidadesMedidas();
            int unidadeSaida = scanner.nextInt();

            String nomeUnidSaida = "";

            switch (unidadeSaida) {
                case 1:
                nomeUnidSaida = "Celsius";
                break;

                case 2:
                nomeUnidSaida = "Kelvin";
                break;

                case 3:
                nomeUnidSaida = "Fahrenheit";
                break;
            }

            switch (unidadeEntrada) {
                case 1:
                if (unidadeSaida == 1) {
                    System.out.println("Unidade de entrada e saída são iguais! Não há temperatura convertida.");


                } else if (unidadeSaida == 2){
                    for (int i = 0; i < tempEntrada.length; i++) {
                        tempConvertido[i] = celsiusParaKelvin(tempEntrada[i]);
                    }
                } else if (unidadeSaida == 3) {
                    for (int i = 0; i < tempEntrada.length; i++) {
                        tempConvertido[i] = celsiusParaFahrenheit(tempEntrada[i]);
                    }
                } else {
                    System.out.println("Opção de unidade de saída inválida!");
                }
                break;

                case 2:
                if (unidadeSaida == 1) {
                    for (int i = 0; i < tempEntrada.length; i++) {
                        tempConvertido[i] = kelvinParaCelsius(tempEntrada[i]);
                    }
                } else if (unidadeSaida == 2){
                    System.out.println("Unidade de entrada e saída são iguais! Não há temperatura convertida.");
                } else if (unidadeSaida == 3) {
                    for (int i = 0; i < tempEntrada.length; i++) {
                        tempConvertido[i] = kelvinParaFahrenheit(tempEntrada[i]);
                    }
                } else {
                    System.out.println("Opção de unidade de saída inválida!");
                }
                break;

                case 3:
                if (unidadeSaida == 1) {
                    for (int i = 0; i < tempEntrada.length; i++) {
                        tempConvertido[i] = fahrenheitParaCelsius(tempEntrada[i]);
                    }
                } else if (unidadeSaida == 2){
                    for (int i = 0; i < tempEntrada.length; i++) {
                        tempConvertido[i] = fahrenheitParaKelvin(tempEntrada[i]);
                    } 
                } else if (unidadeSaida == 3) {
                    System.out.println("Unidade de entrada e saída são iguais! Não há temperatura convertida.");
                } else {
                    System.out.println("Opção de unidade de saída inválida!");
                }
                break;

                default: 
                System.out.println("Opção de unidade de entrada inválida!");
            }

            System.out.printf("As temperaturas de entrada em %s são: \n", nomeUnidEntrada);
            for (int i = 0; i < tempEntrada.length; i++) {
                System.out.println(tempEntrada[i]);
            }

            System.out.printf("\nAs temperaturas convertidas em %s são: \n", nomeUnidSaida);
            for (int i = 0; i < tempConvertido.length; i++) {
                System.out.println(tempConvertido[i]);
            }

            double somaTempEntrada = 0;
            double somaTempConvertida = 0;

            for (int i = 0; i < tempEntrada.length; i++) {
                somaTempEntrada += tempEntrada[i];
            }

            for (int i = 0; i < tempConvertido.length; i++) {
                somaTempConvertida += tempConvertido[i];
            }

            System.out.printf("\nA média das temperaturas de entrada é %.2f.", (somaTempEntrada/tempEntrada.length));

            System.out.printf("\nA média das temperaturas convertidas é %.2f.", (somaTempConvertida/tempConvertido.length));

        } catch (Exception e) {
        System.out.println("Algo deu errado tente novamente!");
        }

        scanner.close();
    }


    private static void menuUnidadesMedidas() {
        System.out.println("Digite o número da unidade de medida desejada");
        System.out.println("1 - Celsius");
        System.out.println("2 - Kelvin");
        System.out.println("3 - Fahrenheit");
    }

    private static double celsiusParaKelvin(double tempEntrada) {
        double tempKelvin = tempEntrada + 273.15;
        return tempKelvin;
    }

    private static double celsiusParaFahrenheit(double tempEntrada) {
        double tempFahrenheit = tempEntrada*1.8 + 32;
        return tempFahrenheit;
    }

    private static double kelvinParaFahrenheit(double tempEntrada) {
        double tempFahrenheit = ((tempEntrada - 273.15) * 1.8) + 32;
        return tempFahrenheit;
    }

    private static double kelvinParaCelsius(double tempEntrada) {
        double tempCelsius = tempEntrada - 273.15;
        return tempCelsius;
    }

    private static double fahrenheitParaKelvin(double tempEntrada) {
        double tempKelvin = ((tempEntrada - 32) / 1.8) + 273.15;
        return tempKelvin;
    }

    private static double fahrenheitParaCelsius(double tempEntrada) {
        double tempCelsius = (tempEntrada - 32) / 1.8;
        return tempCelsius;
    }

}
