package br.xadrez;
import java.util.ArrayList;
import java.util.List;

public class Torre extends Pecas {

    public Torre(String cor, int linha, int coluna) {
        super(cor, linha, coluna);
    }

    private String MovimentoTorre;
    private String CapturaTorre;
    private String CorTorre;
    private String LinhaTorre;
    private String ColunaTorre;
    private String RoqueGrandeTorre;
    private String RoquePequenoTorre;

    public List<String> MovimentoTorre() {
        List<String> movimentos = new ArrayList<>();
        movimentos.add("Mover na vertical ou horizontal em qualquer direção.");
        movimentos.add("Capturar peças adversárias na vertical ou horizontal e na casa em que parou de se movimentar.");
        movimentos.add("Não pode pular sobre outras peças.");
        movimentos.add("Pode realizar o roque grande, portanto que não tenho feito movimentos com ele e " +
                "nenhum espaço entre eles seja atacado pelo adversário.");
        movimentos.add("Pode realizar o roque pequeno, portanto que não tenho feito movimentos com ele e " +
                "nenhum espaço entre eles seja atacado pelo adversário.");
        return movimentos;
    }

    public void setRoqueGrandeTorre(String roqueGrandeTorre) {
        RoqueGrandeTorre = roqueGrandeTorre;
    }

    public String getRoqueGrandeTorre() {
        return RoqueGrandeTorre;
    }

    public void setRoquePequenoTorre(String roquePequenoTorre) {
        RoquePequenoTorre = roquePequenoTorre;
    }

    public String getRoquePequenoTorre() {
        return RoquePequenoTorre;
    }

    public void setMovimentoTorre(String movimentoTorre) {
        MovimentoTorre = movimentoTorre;
    }

    public String getMovimentoTorre() {
        return MovimentoTorre;
    }

    public void setCapturaTorre(String capturaTorre) {
        CapturaTorre = capturaTorre;
    }

    public String getCapturaTorre() {
        return CapturaTorre;
    }

    public void setColunaTorre(String colunaTorre) {
        ColunaTorre = colunaTorre;
    }

    public String getColunaTorre() {
        return ColunaTorre;
    }

    public void setCorTorre(String corTorre) {
        CorTorre = corTorre;
    }

    public String getCorTorre() {
        return CorTorre;
    }

    public void setLinhaTorre(String linhaTorre) {
        LinhaTorre = linhaTorre;
    }

    public String getLinhaTorre() {
        return LinhaTorre;
    }
}
