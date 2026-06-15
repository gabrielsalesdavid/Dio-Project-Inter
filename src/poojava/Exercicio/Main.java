package poojava.exercicio;

import poojava.exercicio.Carro;

public class Main {

    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.setCor("Preto");
        carro1.setModelo("Celta");
        carro1.setCapacidadeTanque(50);

        System.out.println("Cor: " + carro1.getCor());
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Capacidade do tanque: " + carro1.getCapacidadeTanque());
        System.out.println("Valor total para encher o tanque: " + carro1.totalValor(5.50));

        Carro carro2 = new Carro("Branco", "Onix", 60);
        System.out.println("Cor: " + carro2.getCor());
        System.out.println("Modelo: " + carro2.getModelo());
        System.out.println("Capacidade do tanque: " + carro2.getCapacidadeTanque());
        System.out.println("Valor total para encher o tanque: " + carro2.totalValor(5.50));
    }
}
