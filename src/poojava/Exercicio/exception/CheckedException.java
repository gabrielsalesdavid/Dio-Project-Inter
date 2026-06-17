package poojava.exercicio.exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class CheckedException {

    public static void main(String[] args) {

        try {
            String nomeArquivo = "arquivo.txt";
            imprimirArquivosNoConsole(nomeArquivo);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    public static void lerArquivo(String nomeArquivo) throws java.io.IOException {
        java.nio.file.Files.readAllLines(java.nio.file.Paths.get(nomeArquivo));
    }

    public static void imprimirArquivosNoConsole(String nomeArquivo) throws IOException {

        File file = new File(nomeArquivo);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (java.io.IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
