package visitor;

public class PlanoTelefonico implements Plano{
    private String ligacao;
    private String franquia;
    private double valor;

    public PlanoTelefonico(String ligacao, String franquia, double valor) {
        this.ligacao = ligacao;
        this.franquia = franquia;
        this.valor = valor;
    }

    public String getLigacao() {
        return this.ligacao;
    }

    public String getFranquia() {
        return this.franquia;
    }

    public double getValor() {
        return this.valor;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirPlanoTelefonico(this);
    }
}
