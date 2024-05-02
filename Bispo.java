package br.xadrez;
import java.util.List;
import java.util.ArrayList;
public class Bispo extends Pecas {

    public Bispo(String cor, int linha, int coluna) {
        super(cor, linha, coluna);
    }

    private String MovimentoBispo;
    private String CapturaBispo;
    private String CorBispo;
    private String LinhaBispo;
    private String ColunaBispo;

    public List<String> MovimentoBispo(){
        List<String> movimentos = new ArrayList<>();
        movimentos.add("Mover na diagonal em qualquer direção.");
        movimentos.add("Capturar peças adversárias na diagonal e na casa em que parou de se movimentar.");
        movimentos.add("Não pode pular sobre outras peças.");
        return movimentos;
    }

    public void setCapturaBispo(String capturaBispo) {
        CapturaBispo = capturaBispo;
    }

    public void setColunaBispo(String colunaBispo) {
        ColunaBispo = colunaBispo;
    }

    public void setCorBispo(String corBispo) {
        CorBispo = corBispo;
    }

    public void setLinhaBispo(String linhaBispo) {
        LinhaBispo = linhaBispo;
    }

    public void setMovimentoBispo(String movimentoBispo) {
        MovimentoBispo = movimentoBispo;
    }

    public String getCorBispo() {
        return CorBispo;
    }

    public String getCapturaBispo() {
        return CapturaBispo;
    }

    public String getColunaBispo() {
        return ColunaBispo;
    }

    public String getLinhaBispo() {
        return LinhaBispo;
    }

    public String getMovimentoBispo() {
        return MovimentoBispo;
    }

}
