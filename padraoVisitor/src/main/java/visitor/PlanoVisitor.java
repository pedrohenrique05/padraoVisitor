package visitor;

public class PlanoVisitor implements Visitor{
    public String exibir(Plano plano){
        return plano.aceitar(this);
    }
    @Override
    public String exibirPlanoInternet(PlanoInternet internet) {
        return "Plano internet{ " +
                "Velocidade: "+internet.getVelocidade()+
                "\nServiço agregado: "+internet.getServicosAgregado()+
                "\nValor: "+internet.getValor();
    }

    @Override
    public String exibirPlanoTelevisao(PlanoTelevisao televisao) {
        return "Plano de televisão{ "+
                "Canais: "+televisao.getCanais()+
                "\nPayPerView: "+televisao.getPayPerView()+
                "\nValor: "+televisao.getValor();
    }

    @Override
    public String exibirPlanoTelefonico(PlanoTelefonico telefonico) {
        return "Plano telefonico{ "+
                "Ligações: "+telefonico.getLigacao()+
                "\nFranquia: "+telefonico.getFranquia()+
                "\nValor: "+telefonico.getValor();
    }
}
