package DesafioDoModulo4;

import java.util.ArrayList; // imports necessários
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaiorEPosicao {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // iniciando fluxo de leitor

        List<Integer> numeros = new ArrayList<>(); // iniciando uma lista
        for (int i = 0; i < 100; i++) { // lista adicionada vai ate o numero 100, adicionando de um em um numero
            int numero = scan.nextInt(); // inserindo os numeros na lista
            numeros.add(numero); // adicionando os valores a lista
        }
        Integer maior = Collections.max(numeros); // encontrando o maior valor adicionado na lista
        System.out.println(maior); // imprimindo o maior valor

        int posicao = numeros.indexOf(maior) + 1; // encontrando a posicao em que foi adicionado o maior valor " +1 porque a lista comeca em posicao 0, adicionando +1 a posição fica correta com o pedido
        System.out.println(posicao); // imprimindo a posição do maior valor


    }
}
