package poojava.exercicio.lista;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemploSet {

    public static void main(String[] args) {

        Set notas = new HashSet<>();

        Set<Double> notas1 = new LinkedHashSet<>();

        HashSet<Double> notas2 = new HashSet<>();
        Set<Double> notas3 = new HashSet<>();
        Set<Double> notas3 = new HashSet<>(Arrays.asList(7.0, 8.5, 9.0));

        Set<Double> notas4 = new TreeSet<>();
        Set<Double> notas5 = new TreeSet<>(Comparator.reverseOrder());
        Set<Double> notas6 = new TreeSet<>(Comparator.comparingDouble(Double::doubleValue).reversed());

        Set<Double> notas7 = new Set.of(7.0, 8.5, 9.0);

        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.0);

        notas1.add(7.0);
        notas1.add(8.5);
        notas1.add(9.0);

        notas2.add(7.0);
        notas2.add(8.5);
        notas2.add(9.0);

        notas3.add(7.0);
        notas3.add(8.5);
        notas3.add(9.0);

        notas4.add(7.0);
        notas4.add(8.5);
        notas4.add(9.0);

        notas5.add(7.0);
        notas5.add(8.5);
        notas5.add(9.0);

        notas6.add(7.0);
        notas6.add(8.5);
        notas6.add(9.0);

        notas7.add(7.0);
        notas7.add(8.5);
        notas7.add(9.0);

        System.out.println("Notas: " + notas);
        System.out.println("Notas1: " + notas1);
        System.out.println("Notas2: " + notas2);
        System.out.println("Notas3: " + notas3);
        System.out.println("Notas4: " + notas4);
        System.out.println("Notas5: " + notas5);
        System.out.println("Notas6: " + notas6);
        System.out.println("Notas7: " + notas7);

        System.out.println("A nota 7.0 está presente? " + notas.contains(7.0));
        System.out.println("A nota 10.0 está presente? " + notas.contains(10.0));

        System.out.println("A menor nota é: " + notas4.first());
        System.out.println("A maior nota é: " + notas4.last());

        System.out.println("A média das notas é: " + notas.stream().mapToDouble(Double::doubleValue).average().orElse(0.0));
        System.out.println("A soma das notas é: " + notas.stream().mapToDouble(Double::doubleValue).sum());
        System.out.println("A quantidade de notas é: " + notas.size());
        System.out.println("A nota 8.5 está presente? " + notas.contains(8.5));
        System.out.println("A nota 10.0 está presente? " + notas.contains(10.0));
        System.out.println("Removendo a nota 7.0: " + notas.remove(7.0));
        System.out.println("Notas após remoção: " + notas);
        System.out.println("Removendo a nota 10.0: " + notas.remove(10.0));
        System.out.println("Notas após remoção: " + notas);

        System.out.println("--\tOrdem Aleatória\t--");
        Set<Serie> series = new HashSet<>() {{
            add(new Serie("Breaking Bad", "Drama", 50));
            add(new Serie("Game of Thrones", "Fantasia", 60));
            add(new Serie("Stranger Things", "Ficção Científica", 45));
        }};
        for (Serie serie : series) {
            System.out.println(serie);
        }
        System.out.println("Exibindo as séries na ordem de inserção: " + series);
    }

    public class Serie {
        private String nome;
        private String genero;
        private Integer tempoEpisodio;

        public Serie(String nome, String genero, Integer tempoEpisodio) {
            this.nome = nome;
            this.genero = genero;
            this.tempoEpisodio = tempoEpisodio;
        }

        public String getNome() {
            return nome;
        }

        public String getGenero() {
            return genero;
        }

        public Integer getTempoEpisodio() {
            return tempoEpisodio;
        }

        @Override
        public String toString() {
            return "{" +
                    "nome='" + nome + '\'' +
                    ", genero='" + genero + '\'' +
                    ", tempoEpisodio=" + tempoEpisodio +
                    '}';
        }
    }
}
