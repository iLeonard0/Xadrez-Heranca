package br.xadrez;
import java.util.ArrayList;
import java.util.List;
public class Cavalo extends Pecas{
    public Cavalo(String cor, int linha, int coluna) {
        super(cor, linha, coluna);
    }

    private String MovimentoCavalo;
    private String CapturaCavalo;
    private String CorCavalo;
    private String LinhaCavalo;
    private String ColunaCavalo;

    public List<String> MovimentoCavalo(){
        List<String> movimentos = new ArrayList<>();
        movimentos.add("Move-se em fomato de 'L', ou seja, anda 2 casas em qualquer direção (vertical ou horizontal)" +
                " e depois mais uma em sentido perpendicular.");
        movimentos.add("Capturar peças adversárias na casa para onde foi deslocado");
        movimentos.add("Pode pular sobre outras peças.");
        return movimentos;
    }

    public void setCapturaCavalo(String capturaCavalo) {
        CapturaCavalo = capturaCavalo;
    }

    public void setColunaCavalo(String colunaCavalo) {
        ColunaCavalo = colunaCavalo;
    }

    public void setCorCavalo(String corCavalo) {
        CorCavalo = corCavalo;
    }

    public void setLinhaCavalo(String linhaCavalo) {
        LinhaCavalo = linhaCavalo;
    }

    public void setMovimentoCavalo(String movimentoCavalo) {
        MovimentoCavalo = movimentoCavalo;
    }

    public String getCapturaCavalo() {
        return CapturaCavalo;
    }

    public String getColunaCavalo() {
        return ColunaCavalo;
    }

    public String getCorCavalo() {
        return CorCavalo;
    }

    public String getLinhaCavalo() {
        return LinhaCavalo;
    }

    public String getMovimentoCavalo() {
        return MovimentoCavalo;
    }

}
