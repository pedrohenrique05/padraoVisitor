package visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlanoVisitorTest {

    @Test
    void deveExibirPlanoInternet(){
        PlanoInternet internet =  new PlanoInternet("360","GloboPlay",120);
        PlanoVisitor visitor = new PlanoVisitor();
        assertEquals("Plano internet{ Velocidade: 360\n" +
                "Serviço agregado: GloboPlay\n" +
                "Valor: 120.0",visitor.exibirPlanoInternet(internet));
    }

    @Test
    void deveExibirPlanoTelevisao(){
        PlanoTelevisao ptv = new PlanoTelevisao("Básico","Premiere", 200);
        PlanoVisitor visitor = new PlanoVisitor();
        assertEquals("Plano de televisão{ Canais: Básico\n" +
                "PayPerView: Premiere\n" +
                "Valor: 200.0",visitor.exibirPlanoTelevisao(ptv));
    }

    @Test
    void deveExibirPlanoTelefonico(){
        PlanoTelefonico pt = new PlanoTelefonico("Estado de Minas Gerais","100 minutos",80);
        PlanoVisitor visitor = new PlanoVisitor();
        assertEquals("Plano telefonico{ Ligações: Estado de Minas Gerais\n" +
                "Franquia: 100 minutos\n" +
                "Valor: 80.0",visitor.exibirPlanoTelefonico(pt));
    }

}