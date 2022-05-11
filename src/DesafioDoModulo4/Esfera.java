package DesafioDoModulo4;

import java.util.Scanner;

public class Esfera {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // inserindo valor da nota

        double pi = 3.14159; // valor de pi
        double R = sc.nextDouble(); // inserindo o valor do raio da circunferencia
        double volume = (4 / 3.0) * pi * (Math.pow(R, 3.0)); // calculo para o volume
        System.out.printf("VOLUME = %.3f%n", volume); // imprimindo na tela o volume da esfera
    }

}