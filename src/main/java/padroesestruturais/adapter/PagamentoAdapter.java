package padroesestruturais.adapter;

public class PagamentoAdapter implements IPagamento {

    private GatewayPagamento gateway;

    public PagamentoAdapter(GatewayPagamento gateway) {
        this.gateway = gateway;
    }

    public int converterParaCentavos(float valor) {
        return Math.round(valor * 100);
    }

    @Override
    public String pagar(float valor) {
        return gateway.processarCobranca(converterParaCentavos(valor), "BRL");
    }


}