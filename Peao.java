package br.xadrez;
import java.util.ArrayList;
import java.util.List;

public class Peao extends Pecas{

    private String Avançar1Casa;
    private String Avançar2Casas;
    private String EnPassant;
    private String CapturaPeao;
    private String Promoção;
    private String CorPeao;
    private String LinhaPeao;
    private String ColunaPeao;

    public Peao(String cor, int linha, int coluna) {
        super(cor, linha, coluna);
    }

    public List<String> MovimentosPeao(){
        List<String> movimentos = new ArrayList<>();
        movimentos.add("Avançar 1 casa.");
        movimentos.add("Avançar 2 casas (Caso for o primeiro movimento(Brancas)).");
        movimentos.add("Capturar na diagonal");
        movimentos.add("Promoção de peão");
        movimentos.add("Captura por EnPassant. Apenas realizado em uma coluna Adjacente");
        return movimentos;
    }

    public void setLinhaPeao(String linhaPeao) {
        LinhaPeao = linhaPeao;
    }

    public String getLinhaPeao() {
        return LinhaPeao;
    }

    public String getColunaPeao() {
        return ColunaPeao;
    }

    public void setColunaPeao(String colunaPeao) {
        ColunaPeao = colunaPeao;
    }

    public void setCorPeao(String corPeao) {
        CorPeao = corPeao;
    }

    public String getCorPeao() {
        return CorPeao;
    }

    public void setAvançar1Casa(String avançar1Casa) {
        Avançar1Casa = avançar1Casa;
    }

    public String getAvançar1Casa() {
        return Avançar1Casa;
    }

    public void setAvançar2Casas(String avançar2Casas) {
        Avançar2Casas = avançar2Casas;
    }

    public String getAvançar2Casas() {
        return Avançar2Casas;
    }

    public void setEnPassant(String enPassant) {
        EnPassant = enPassant;
    }

    public String getEnPassant(){
        return EnPassant;
}

    public void setCapturaPeao(String captura) {
        CapturaPeao = captura;
    }

    public String getCapturaPeao() {
        return CapturaPeao;
    }

    public void setPromoção(String promoção) {
        Promoção = promoção;
    }

    public String getPromoção() {
        return Promoção;
    }
}
