public class ExercicioMensagem {
    
    public static void main(String[] args) {
        exibirMensagem(10);
        exibirMensagem(15);
        exibirMensagem(20);
        exibirMensagem(25);
    }

    public static void exibirMensagem(int hora) {

        switch (hora) {
            case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11:
                System.out.println("Bom dia!");
                break;
            case 12, 13, 14, 15, 16, 17:
                System.out.println("Boa tarde!");
                break;
            case 18, 19, 20, 21, 22, 23:
                System.out.println("Boa noite!");
                break;
            default:
                System.out.println("Hora inválida!");
        }
    }
}
