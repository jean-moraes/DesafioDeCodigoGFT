package DesafioDoModulo3;

import java.util.Scanner;

public class CoxinhaDeBueno {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in); // iniciando fluxo de leitor
            double p; // numero total de participantes da competição
            double h; // numero total de coxinhas comidas
            double media;

            h = scan.nextInt(); // inserir numero na tela
            p = scan.nextInt();  // inserir numero na tela

            media = h / p; // calculo da divisao entre os dois dados

            System.out.printf("%.2f" , media); // imprimindo a média
        }
    }

