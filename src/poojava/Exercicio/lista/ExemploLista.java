package poojava.exercicio.lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;

public class ExemploLista {

    public static void main(String[] args) {

        System.out.println("Crie uma lista e adicione as sete notas: ");
        List<Double> notas = new ArrayList<Double>();

        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(6.8);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);

        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5.0));

        System.out.println("Adicione na lista a nota 8.0 na posição 5: ");
        notas.add(5, 8.0);
        System.out.println(notas.toString());

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println(notas.toString());

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5.0));

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (Double nota : notas) {
            System.out.println(nota);
        }

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));

        System.out.println("Exiba a última nota adicionada: " + notas.get(notas.size() - 1));

        System.out.println("Exiba a quantidade de notas: " + notas.size());

        System.out.println("Exiba a menor nota: " + notas.stream().min(Double::compare).get());
        System.out.println("Exiba a menor nota: " + Collections.min(notas, Double::compare));

        System.out.println("Exiba a maior nota: " + notas.stream().max(Double::compare).get());
        System.out.println("Exiba a maior nota: " + Collections.max(notas, Double::compare));

        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);
    }
}
