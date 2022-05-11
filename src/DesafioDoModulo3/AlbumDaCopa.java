package DesafioDoModulo3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AlbumDaCopa {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in); // iniciancdo fluxo de leitor
            int numTotal = scan.nextInt(); // inserindo numero total de figurinhas e espaço no álbum
            int numFigCompradas = scan.nextInt(); // numero de figurinhas ja compradas

            Set<Integer> setFig = new HashSet<>(); // iniciando um set de figurinhas

            for ( int i = 0; i < numFigCompradas; i++) { // laço "for" para saber quantas figurinhas sao necessarias
                int fig = scan.nextInt(); // inseindo o numero de figurinhas
                if (fig < 1 || fig > numTotal) return; //logica de quntas fugurinhas sao necessarias para completar o album
                setFig.add(fig); //adicioando figurinhas

            }
            System.out.println(numTotal - setFig.size()); // imprimindo o numero necessario de figurinhas
        }
    }
