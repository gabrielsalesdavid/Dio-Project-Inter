package poojava.exercicio.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ExemploMap {

    public static void main(String[] args) {

        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};

        System.out.println(carrosPopulares);

        System.out.println("Substitua o consumo do gol por 15.2 km/l: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));
        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));
        System.out.println("Exiba os modelos: " + carrosPopulares.keySet());
        System.out.println("Exiba os consumos dos carros: " + carrosPopulares.values());
        System.out.println("Exiba o modelo mais econômico e seu consumo: ");
        Double consumoMaisEficiente = Double.MIN_VALUE;
        String modeloMaisEficiente = "";
        for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
            if (entry.getValue() > consumoMaisEficiente) {  
                consumoMaisEficiente = entry.getValue();
                modeloMaisEficiente = entry.getKey();
            }
        }
        System.out.println(modeloMaisEficiente + " - " + consumoMaisEficiente);

        System.out.println("Exiba o modelo menos econômico e seu consumo: ");
        Double consumoMenosEficiente = Double.MAX_VALUE;
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
            if (entry.getValue() < consumoMenosEficiente) {
                consumoMenosEficiente = entry.getValue();
                modeloMenosEficiente = entry.getKey();
            }
        }
        System.out.println(modeloMenosEficiente + " - " + consumoMenosEficiente);
        System.out.println("Exiba a soma dos consumos: ");
        Double somaConsumos = 0.0;
        for (Double consumo : carrosPopulares.values()) {
            somaConsumos += consumo;
        }
        System.out.println(somaConsumos);

        System.out.println("Exiba a média dos consumos: " + somaConsumos / carrosPopulares.size());
        System.out.println("Remova os modelos com consumo igual a 15.6 km/l: ");
        carrosPopulares.values().removeIf(consumo -> consumo.equals(15.6));
        System.out.println(carrosPopulares);
        System.out.println("Apague o dicionário de carros: ");
        carrosPopulares.clear();
        System.out.println(carrosPopulares);

        Set<Map.Entry<String, Double>> entrySet = carrosPopulares.entrySet();
        String modeloMaisEficiente2 = "";
        Double consumoMaisEficiente2 = Double.MIN_VALUE;
        for (Map.Entry<String, Double> entry : entrySet) {
            if (entry.getValue() > consumoMaisEficiente2) {
                consumoMaisEficiente2 = entry.getValue();
                modeloMaisEficiente2 = entry.getKey();
            }
        }
        System.out.println(modeloMaisEficiente2 + " - " + consumoMaisEficiente2);
    }
}