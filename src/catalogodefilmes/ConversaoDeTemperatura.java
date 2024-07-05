package catalogodefilmes;

public class ConversaoDeTemperatura {
    public static void main(String[] args) {
        double temperaturaEmCelsius = 30;
        double temperaturaEmFahrenheit = (temperaturaEmCelsius *1.8) + 32;//Conversão de Celsius para Fahrenheit
        double temperaturaEmKelvin = (temperaturaEmFahrenheit -32) *5/9;//Conversão de Fahrenheit para Kelvin
        System.out.println("Temperatura em Celsius: " + temperaturaEmCelsius);
        System.out.println("Temperatura em Fahrenheit: " + temperaturaEmFahrenheit);
        System.out.println("Temperatura em Kelvin: " + temperaturaEmKelvin);

    }
}
