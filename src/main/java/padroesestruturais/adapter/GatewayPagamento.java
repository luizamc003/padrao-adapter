package padroesestruturais.adapter;

public class GatewayPagamento {

    public String processarCobranca(int valorCentavos, String moeda) {
        return "Cobrança de " + valorCentavos + " centavos em " + moeda + " aprovada";
    }
}