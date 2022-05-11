package DesafioDoModulo4;

import java.util.Scanner;

public class PoligonosRegularesSimples {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // inserindo valor da nota
        int N = scan.nextInt(); // numero de lados do poligono
        int L = scan.nextInt(); // valor do comprimento de cada lado do poligono regular
        int resultado; // variavel "resultado"


        resultado = N * L; // calculo da logica da equacao

        System.out.println(resultado); // imprimindo o resoltado na tela

    }
}
