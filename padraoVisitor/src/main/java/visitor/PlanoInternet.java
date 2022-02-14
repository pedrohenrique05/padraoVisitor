package visitor;

public class PlanoInternet implements Plano{
    private String velocidade;
    private String servicosAgregado;
    private double valor;

    public PlanoInternet(String velocidade, String servicosAgregado, double valor) {
        this.velocidade = velocidade;
        this.servicosAgregado = servicosAgregado;
        this.valor = valor;
    }

    public String getVelocidade() {
        return this.velocidade;
    }

    public String getServicosAgregado() {
        return this.servicosAgregado;
    }

    public double getValor() {
        return this.valor;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirPlanoInternet(this);
    }
}
