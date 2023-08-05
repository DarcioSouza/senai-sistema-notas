package br.senai.sp.sistema;

import java.util.Scanner;

public class sistema {
    public static void main(String[] args) {
        /** Import class Scanner */
        Scanner teclado = new Scanner(System.in);

        /** Coleta dados do User */
        System.out.print("Bem vindo ! Digite o seu nome: ");
        String nome = teclado.nextLine();

        System.out.print("Digite o nome do seu curso : ");
        String curso = teclado.nextLine();

        System.out.print("Digite o nome do professor ? ");
        String professor = teclado.nextLine();

        System.out.print("Qual é o percentual de frequencia ? ");
        int frequencia = teclado.nextInt();

        System.out.print("Digite sua nota1 : ");
        int nota1 = teclado.nextInt();

        System.out.print("Digite sua nota2 : ");
        int nota2 = teclado.nextInt();

        float media = ((nota1 + nota2) / 2);

        if (frequencia >= 75 && media >=7 || frequencia >= 90 && media >=6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }

}


