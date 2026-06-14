package com.dio.desafio.codigo;

public class Produto {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Multiplicação de dois números inteiros
        int A, B, PROD;

        A = scanner.nextInt();
        B = scanner.nextInt();

        PROD = A * B;

        System.out.println("PROD = " + PROD);

        scanner.close();
    }
}