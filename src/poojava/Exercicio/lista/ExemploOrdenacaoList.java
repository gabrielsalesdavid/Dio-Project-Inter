package poojava.exercicio.lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploOrdenacaoList {

    public static void main(String[] args) {

        List<Gato> gatos = new ArrayList<>() {
            {
                add(new Gato("Mingau", 3, "Preto"));
                add(new Gato("Garfield", 5, "Laranja"));
                add(new Gato("Tom", 2, "Cinza"));
            }
        };

        System.out.println("--\tGatos antes da ordenação: ---\t");
        for (Gato gato : gatos) {
            System.out.println(gato.getNome() + " - Idade: " + gato.getIdade() + " - Cor: " + gato.getCor());
        }

        Collections.sort(gatos);

        System.out.println("--\tGatos após a ordenação por nome: ---\t");
        for (Gato gato : gatos) {
            System.out.println(gato.getNome() + " - Idade: " + gato.getIdade() + " - Cor: " + gato.getCor());
        }

        System.out.println("--\tGatos ordenados por idade: ---\t");
        gatos.sort((g1, g2) -> Integer.compare(g1.getIdade(), g2.getIdade()));
        for (Gato gato : gatos) {
            System.out.println(gato.getNome() + " - Idade: " + gato.getIdade() + " - Cor: " + gato.getCor());
        }

        System.out.println("--\tGatos ordenados por cor: ---\t");
        gatos.sort((g1, g2) -> g1.getCor().compareTo(g2.getCor()));
        for (Gato gato : gatos) {
            System.out.println(gato.getNome() + " - Idade: " + gato.getIdade() + " - Cor: " + gato.getCor());
        }

        System.out.println("--\tGatos ordenados aleatoriamente: ---\t");
        Collections.shuffle(gatos);
        for (Gato gato : gatos) {
            System.out.println(gato.getNome() + " - Idade: " + gato.getIdade() + " - Cor: " + gato.getCor());
        }

        System.out.println("--\tGatos comparados por nome: ---\t");
        gatos.sort((g1, g2) -> g1.getNome().compareTo(g2.getNome()));
        for (Gato gato : gatos) {
            System.out.println(gato.getNome() + " - Idade: " + gato.getIdade() + " - Cor: " + gato.getCor());
        }

        System.out.println("--\tOrdem natural (nome): \t---");
        Collections.sort(gatos);
        for (Gato gato : gatos) {
            System.out.println(gato.getNome() + " - Idade: " + gato.getIdade() + " - Cor: " + gato.getCor());
        }

        System.out.println("--\tOrdem por idade: \t---");
        gatos.sort((g1, g2) -> Integer.compare(g1.getIdade(), g2.getIdade()));
        for (Gato gato : gatos) {
            System.out.println(gato.getNome() + " - Idade: " + gato.getIdade() + " - Cor: " + gato.getCor());
        }

        System.out.println("--\tOrdem por cor: \t---");
        gatos.sort((g1, g2) -> g1.getCor().compareTo(g2.getCor()));
        for (Gato gato : gatos) {
            System.out.println(gato.getNome() + " - Idade: " + gato.getIdade() + " - Cor: " + gato.getCor());
        }

        System.out.println("--\tOrdem por nome, cor e idade: \t---");
        gatos.sort((g1, g2) -> g1.comparetorNomeCorIdade(g1, g2));
        for (Gato gato : gatos) {
            System.out.println(gato.getNome() + " - Idade: " + gato.getIdade() + " - Cor: " + gato.getCor());
        }
    }

    class Gato implements Comparable<Gato> {

        private String nome;
        private int idade;
        private String cor;

        public Gato(String nome, int idade, String cor) {
            this.nome = nome;
            this.idade = idade;
            this.cor = cor;
        }

        public String getNome() {
            return nome;
        }

        public int getIdade() {
            return idade;
        }

        public String getCor() {
            return cor;
        }

        @Override
        public int compareTo(Gato outroGato) {
            return this.nome.compareTo(outroGato.getNome());
        }

        @Override
        public int comparetorNomeCorIdade(Gato g1, Gato g2) {
            int nomeCompare = g1.getNome().compareTo(g2.getNome());
            if (nomeCompare != 0) {
                return nomeCompare;
            }
            int corCompare = g1.getCor().compareTo(g2.getCor());
            if (corCompare != 0) {
                return corCompare;
            }
            return Integer.compare(g1.getIdade(), g2.getIdade());
        }

        @Override
        public int compareNome(Gato g1, Gato g2) {
            return g1.getNome().compareTo(g2.getNome());
        }        
        
        @Override
        public int compareIdade(Gato g1, Gato g2) {
            return Integer.compare(g1.getIdade(), g2.getIdade());
        }

        @Override
        public String toString() {
            return "Gato{" +
                    "nome='" + nome + '\'' +
                    ", idade=" + idade +
                    ", cor='" + cor + '\'' +
                    '}';
        }
    }
}
