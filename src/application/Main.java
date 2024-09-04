package application;

import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import xadrez.PartidaXadrez;

public class Main {
    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro(8,8);

        PartidaXadrez partidaXadrez = new PartidaXadrez();
        UI.printTabuleiro(partidaXadrez.getPecas());
    }
}