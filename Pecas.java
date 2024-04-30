package br.xadrez;

public class Pecas {

    protected static int x; // posição de cada peça
    protected static int y; // posição de cada peça
    protected boolean brancas; // cor da peça

    public Pecas(int x, int y, boolean brancas){
        this.x = x;
        this.y = y;
        this.brancas = brancas;
    }

    public abstract boolean MovimentoValido(int novoX, int novoy);
}

