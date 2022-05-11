package DesafioDoModulo4;

import java.util.Scanner;

public class Media2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // iniciando fluxo de leitor
        double nota1 = input.nextDouble(); // inserindo valor da nota
        double nota2 = input.nextDouble(); // inserindo valor da nota
        double nota3 = input.nextDouble(); // inserindo valor da nota
        double media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / (2 + 3 + 5); // fazendo a media das notas multiplicadas com seus respectivos pesos, e dividindo pela soma dos pesos
        System.out.printf("MEDIA = %.1f", media); // imprimindo media
    }
}
