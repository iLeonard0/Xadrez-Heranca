package br.xadrez;
import java.util.List;
import java.util.ArrayList;
public class Rei extends Pecas{
    public Rei(String cor, int linha, int coluna) {
        super(cor, linha, coluna);
    }

    private String MovimentoRei;
    private String CapturaRei;
    private String CorRei;
    private String LinhaRei;
    private String ColunaRei;
    private String RoqueGrandeRei;
    private String RoquePequenoRei;
    private String ChequeMate;
    private String Cheque;

    public List<String> MovimentosRei(){
        List<String> movimentos = new ArrayList<>();
        movimentos.add("Mover em qualquer direção uma casa por vez.");
        movimentos.add("Capturar peças adversárias na vertical, horizontal ou diagonal, uma casa por vez.");
        movimentos.add("Não pode pular sobre outras peças.");
        movimentos.add("Pode fazer o movimento especial 'Roque' com a torre, desde que não tenha se movido ainda " +
                "e nenhum espaço entre eles seja atacado pelo adversário.");
        movimentos.add("Quando em cheque o rei é obrigado a ser movimentado ou uma peça do tabuleiro cobrir o cheque" +
                " do adversário. ");
        movimentos.add("Quando em Cheque Mate, o jogo acaba pois o rei não terá como escapar e estará sendo " +
                "ameaçado pelas demais peças do seu adversário.");
        return movimentos;
    }

    public void setCapturaRei(String capturaRei) {
        CapturaRei = capturaRei;
    }

    public void setCheque(String cheque) {
        Cheque = cheque;
    }

    public void setChequeMate(String chequeMate) {
        ChequeMate = chequeMate;
    }

    public void setColunaRei(String colunaRei) {
        ColunaRei = colunaRei;
    }

    public void setCorRei(String corRei) {
        CorRei = corRei;
    }

    public void setLinhaRei(String linhaRei) {
        LinhaRei = linhaRei;
    }

    public void setMovimentoRei(String movimentoRei) {
        MovimentoRei = movimentoRei;
    }

    public void setRoqueGrandeRei(String roqueGrandeRei) {
        RoqueGrandeRei = roqueGrandeRei;
    }

    public void setRoquePequenoRei(String roquePequenoRei) {
        RoquePequenoRei = roquePequenoRei;
    }

    public String getCheque() {
        return Cheque;
    }

    public String getCapturaRei() {
        return CapturaRei;
    }

    public String getChequeMate() {
        return ChequeMate;
    }

    public String getColunaRei() {
        return ColunaRei;
    }

    public String getCorRei() {
        return CorRei;
    }

    public String getLinhaRei() {
        return LinhaRei;
    }

    public String getRoqueGrandeRei() {
        return RoqueGrandeRei;
    }

    public String getMovimentoRei() {
        return MovimentoRei;
    }

    public String getRoquePequenoRei() {
        return RoquePequenoRei;
    }

}

