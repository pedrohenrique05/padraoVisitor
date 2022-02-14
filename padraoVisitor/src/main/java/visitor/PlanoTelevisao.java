package visitor;

public class PlanoTelevisao implements Plano{
    private String canais;
    private String payPerView;
    private double valor;

    public PlanoTelevisao(String canais, String payPerView, double valor) {
        this.canais = canais;
        this.payPerView = payPerView;
        this.valor = valor;
    }

    public String getCanais() {
        return this.canais;
    }

    public String getPayPerView() {
        return this.payPerView;
    }

    public double getValor() {
        return this.valor;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirPlanoTelevisao(this);
    }
}
