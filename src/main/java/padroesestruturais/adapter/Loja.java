package padroesestruturais.adapter;

public class Loja {

    private PagamentoAdapter pagamento;
    private float valorCompra;

    public Loja() {
        pagamento = new PagamentoAdapter(new GatewayPagamento());
    }

    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }

    public float getValorCompra() {
        return valorCompra;
    }

    public String finalizarCompra() {
        return pagamento.pagar(valorCompra);
    }

    public int getValorCentavos() {
        return pagamento.converterParaCentavos(valorCompra);
    }
}