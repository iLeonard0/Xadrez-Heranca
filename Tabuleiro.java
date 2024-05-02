package br.xadrez;

public class Tabuleiro {
    private Pecas[][] tabuleiro;

    public Tabuleiro() {
        this.tabuleiro = new Pecas[8][8];
        // Inicializa o tabuleiro com peças padrão
        inicializarTabuleiro();
    }

    private void inicializarTabuleiro() {
        // Inicializa peões brancos
        for (int i = 0; i < 8; i++) {
            tabuleiro[1][i] = new Peao("BRANCO", 1, i);
        }
        // Inicializa peões pretos
        for (int i = 0; i < 8; i++) {
            tabuleiro[6][i] = new Peao("PRETO", 6, i);
        }
        // Inicializa peças brancas
        tabuleiro[0][0] = new Torre("BRANCO", 0, 0);
        tabuleiro[0][1] = new Cavalo("BRANCO", 0, 1);
        tabuleiro[0][2] = new Bispo("BRANCO", 0, 2);
        tabuleiro[0][3] = new Rainha("BRANCO", 0, 3);
        tabuleiro[0][4] = new Rei("BRANCO", 0, 4);
        tabuleiro[0][5] = new Bispo("BRANCO", 0, 5);
        tabuleiro[0][6] = new Cavalo("BRANCO", 0, 6);
        tabuleiro[0][7] = new Torre("BRANCO", 0, 7);
        // Inicializa peças pretas
        tabuleiro[7][0] = new Torre("PRETO", 7, 0);
        tabuleiro[7][1] = new Cavalo("PRETO", 7, 1);
        tabuleiro[7][2] = new Bispo("PRETO", 7, 2);
        tabuleiro[7][3] = new Rainha("PRETO", 7, 3);
        tabuleiro[7][4] = new Rei("PRETO", 7, 4);
        tabuleiro[7][5] = new Bispo("PRETO", 7, 5);
        tabuleiro[7][6] = new Cavalo("PRETO", 7, 6);
        tabuleiro[7][7] = new Torre("PRETO", 7, 7);
    }

    // Obter peça em determinada posição
    public Pecas getPeca(int linha, int coluna) {
        return tabuleiro[linha][coluna];
    }

    // Getters e setters
    public Pecas[][] getTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(Pecas[][] tabuleiro) {
        this.tabuleiro = tabuleiro;
    }
}
