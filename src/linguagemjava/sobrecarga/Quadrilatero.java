package sobrecarga;

public class Quadrilatero {
    
    public static void areaQuadratia(double lado) {

        System.out.println("Área do quadrado: " + lado * lado);
    }

    public static void areaRetangular(double lado1, double lado2) {

        System.out.println("Área do retângulo: " + lado1 * lado2);
    }

    public static void areaTrapezoidal(double baseMaior, double baseMenor, double altura) {

        System.out.println("Área do trapézio: " + ((baseMaior + baseMenor) * altura) / 2);
    }

    public static double areaLosango(double diagonal1, double diagonal2) {

        return (diagonal1 * diagonal2) / 2;
    }
}