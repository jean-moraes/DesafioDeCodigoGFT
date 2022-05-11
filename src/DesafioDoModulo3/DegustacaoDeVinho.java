package DesafioDoModulo3;

import java.util.Scanner;

public class DegustacaoDeVinho {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // iniciando fluxo de leitor
        String T = scan.nextLine(); // inserindo o numero do vinho correto
        String respostasCompetidores = scan.nextLine(); // respostas dos competidores

        String[] respostasCompetidoresSplit = respostasCompetidores.split(" "); // quebrando a array com split

        int count = 0; //contador do laço for
        for (int i = 0; i < respostasCompetidoresSplit.length; i++) { // contador indo ate o tamanho da array, "respostas dos competidoes"
            if (respostasCompetidoresSplit[i].equals(T)) { // se respostas dos competidores igual ao numero do vinho correto
                count++; // somando contador
            }

        }
        System.out.println(count);  // imprimindo o contador, logo pegando a quantiadade de vezes que foi inserido a resposta coreta do vinho "T"
    }
}
