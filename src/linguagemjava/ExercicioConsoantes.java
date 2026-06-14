
import java.util.Scanner;

public class ExercicioConsoantes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] consoantes = new String[6];
        int count = 0;

        do {
            System.out.println("Digite uma letra: ");
            String letra = sc.nextLine();
            if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i")
                    || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
                System.out.println("Vogal");
                consoantes[count] = letra;
                count++;
            } else {
                System.out.println("Consoante");
                consoantes[count] = letra;
                count++;
            }
        } while (count < consoantes.length);

        System.out.println("Consoantes digitadas: ");
        for (String consoante : consoantes) {
            if (consoante != null) {
                System.out.println(consoante + " ");
            }
            System.out.println("Quantidade de consoantes digitadas: " + count);
        }
        sc.close();
    }
}
