package Atividade06;

import java.util.Scanner;

public class TicTacToe {
    private enum Celula {
        X, O, VAZIO
    }

    private Celula[][] tabuleiro;
    private Scanner scanner;

    public TicTacToe() {
        tabuleiro = new Celula[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = Celula.VAZIO;
            }
        }
        scanner = new Scanner(System.in);
    }

    public void jogarJogo() {
        System.out.println("Bem-vindo ao Jogo da Velha!");

        Celula jogadorAtual = Celula.X;
        boolean jogoEncerrado = false;

        while (!jogoEncerrado) {
            imprimirTabuleiro();

            System.out.println("Jogador " + jogadorAtual + ", informe sua jogada (linha e coluna): ");
            int linha = scanner.nextInt();
            int coluna = scanner.nextInt();

            if (movimentoValido(linha, coluna)) {
                tabuleiro[linha][coluna] = jogadorAtual;
                if (verificarVencedor(jogadorAtual) || verificarEmpate()) {
                    imprimirTabuleiro();
                    jogoEncerrado = true;
                    if (verificarVencedor(jogadorAtual)) {
                        System.out.println("Jogador " + jogadorAtual + " vence!");
                    } else {
                        System.out.println("Empate!");
                    }
                } else {
                    jogadorAtual = (jogadorAtual == Celula.X) ? Celula.O : Celula.X;
                }
            } else {
                System.out.println("Jogada inválida! Tente novamente.");
            }
        }
    }

    private void imprimirTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
    }

    private boolean movimentoValido(int linha, int coluna) {
        return linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == Celula.VAZIO;
    }

    private boolean verificarVencedor(Celula jogador) {
        // Verificar linhas
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) {
                return true;
            }
        }
        // Verificar colunas
        for (int j = 0; j < 3; j++) {
            if (tabuleiro[0][j] == jogador && tabuleiro[1][j] == jogador && tabuleiro[2][j] == jogador) {
                return true;
            }
        }
        // Verificar diagonais
        if (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) {
            return true;
        }
        if (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador) {
            return true;
        }
        return false;
    }

    private boolean verificarEmpate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == Celula.VAZIO) {
                    return false; // Ainda há uma célula vazia, o jogo continua
                }
            }
        }
        return true; // Todas as células estão preenchidas, é um empate
    }

    public static void main(String[] args) {
        TicTacToe jogo = new TicTacToe();
        jogo.jogarJogo();
    }
}
