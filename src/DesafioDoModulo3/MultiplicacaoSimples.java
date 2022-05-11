package DesafioDoModulo3;

import java.util.Scanner;

public class MultiplicacaoSimples {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in); // iniciando fluxo de leitor

            int A, B, PROD; // definindo as variaveis

            A = sc.nextInt(); //inserindo a variavel
            B = sc.nextInt(); //inserindo a variavel

            PROD = A * B; // multiplicando as variaveis inseridas

            System.out.println("PROD = " +  PROD   ); // implimindo o produto das duas variaveis

        }
    }
