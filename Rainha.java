package br.xadrez;
import java.util.ArrayList;
import java.util.List;

public class Rainha extends Pecas{
    public Rainha(String cor, int linha, int coluna) {
        super(cor, linha, coluna);
    }

    private String MovimentoRainha;
    private String CapturaRainha;
    private String CorRainha;
    private String LinhaRainha;
    private String ColunaRainha;

    public List<String> MovimentoRainha(){
        List<String> movimentos = new ArrayList<>();
        movimentos.add("Mover na vertical, horizontal ou diagonal em qualquer direção.");
        movimentos.add("Capturar peças adversárias na vertical, horizontal ou diagonal. Na casa onde parar!");
        movimentos.add("Não pode pular sobre outras peças.");
        return movimentos;
    }

    public void setCapturaRainha(String capturaRainha) {
        CapturaRainha = capturaRainha;
    }

    public void setColunaRainha(String colunaRainha) {
        ColunaRainha = colunaRainha;
    }

    public void setCorRainha(String corRainha) {
        CorRainha = corRainha;
    }

    public void setLinhaRainha(String linhaRainha) {
        LinhaRainha = linhaRainha;
    }

    public void setMovimentoRainha(String movimentoRainha) {
        MovimentoRainha = movimentoRainha;
    }

    public String getCapturaRainha() {
        return CapturaRainha;
    }

    public String getColunaRainha() {
        return ColunaRainha;
    }

    public String getCorRainha() {
        return CorRainha;
    }

    public String getLinhaRainha() {
        return LinhaRainha;
    }

    public String getMovimentoRainha() {
        return MovimentoRainha;
    }
}
